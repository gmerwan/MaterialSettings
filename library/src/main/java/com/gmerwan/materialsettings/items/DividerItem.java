package com.gmerwan.materialsettings.items;

import android.view.View;

import com.gmerwan.materialsettings.MaterialSettingsFragment;
import com.gmerwan.materialsettings.MaterialSettingsItem;
import com.gmerwan.materialsettings.R;


public class DividerItem extends MaterialSettingsItem {

	public DividerItem(MaterialSettingsFragment ctx) {
		super(ctx, null);
	}

	@Override
	public int getViewResource() {
		return R.layout.item_divider;
	}

	@Override
	public void setupView(View v) {

	}

	@Override
	public void save() {
		// NOP
	}
}
