package com.kenumir.materialsettings.items;

import com.kenumir.materialsettings.MaterialSettingsFragment;
import com.kenumir.materialsettings.R;


public class SwitcherItem extends CheckboxItem {

	public SwitcherItem(MaterialSettingsFragment ctx, String name) {
		super(ctx, name);
	}

	@Override
	public int getViewResource() {
		return R.layout.item_switcher;
	}

}
