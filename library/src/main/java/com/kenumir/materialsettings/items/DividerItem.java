package com.kenumir.materialsettings.items;

import android.view.View;

import com.kenumir.materialsettings.MaterialSettingsFragment;
import com.kenumir.materialsettings.MaterialSettingsItem;
import com.kenumir.materialsettings.R;


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
