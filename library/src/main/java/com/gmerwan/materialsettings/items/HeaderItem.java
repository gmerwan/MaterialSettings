package com.gmerwan.materialsettings.items;

import android.view.View;
import android.widget.TextView;

import com.gmerwan.materialsettings.MaterialSettingsFragment;
import com.gmerwan.materialsettings.MaterialSettingsItem;
import com.gmerwan.materialsettings.R;


public class HeaderItem extends MaterialSettingsItem {

	private String title;

	public HeaderItem(MaterialSettingsFragment ctx) {
		super(ctx, null);
	}

	@Override
	public int getViewResource() {
		return R.layout.item_header;
	}

	@Override
	public void setupView(View v) {
		((TextView) v).setText(title);
	}

	@Override
	public void save() {
		// NOP
	}

	public String getTitle() {
		return title;
	}

	public HeaderItem setTitle(String title) {
		this.title = title;
		return this;
	}
}
