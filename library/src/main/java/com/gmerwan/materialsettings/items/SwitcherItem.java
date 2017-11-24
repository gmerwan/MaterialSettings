package com.gmerwan.materialsettings.items;

import com.gmerwan.materialsettings.MaterialSettingsFragment;
import com.gmerwan.materialsettings.R;


public class SwitcherItem extends CheckboxItem {

	public SwitcherItem(MaterialSettingsFragment ctx, String name) {
		super(ctx, name);
	}

	@Override
	public int getViewResource() {
		return R.layout.item_switcher;
	}

}
