package com.gmerwan.materialsettings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmerwan.materialsettings.storage.StorageInterface;


public abstract class MaterialSettingsItem {

	protected MaterialSettingsFragment mContext;
	protected MaterialSettingsFragment mMaterialSettings;
	protected String name;

	public MaterialSettingsItem(MaterialSettingsFragment ctx, String name) {
		this.mContext = ctx;
		//if (ctx instanceof MaterialSettingsFragment)
		//	this.mMaterialSettings = (MaterialSettingsFragment) ctx;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public View initView(ViewGroup parent, int res) {
		return LayoutInflater.from(mContext.getActivity()).inflate(res, parent, false);
	}

	public View getView(ViewGroup parent) {
		if (getViewResource() > 0) {
			View v = initView(parent, getViewResource());
			setupView(v);
			return v;
		} else
			return null;
	}

	public void setMaterialSettings(MaterialSettingsFragment m) {
		mMaterialSettings = m;
	}

	public StorageInterface getStorageInterface() {
		if (mMaterialSettings != null)
			return mMaterialSettings.getStorageInterface();
		else
			return null;
	}

	public abstract int getViewResource();
	public abstract void setupView(View v);
	public abstract void save();

}
