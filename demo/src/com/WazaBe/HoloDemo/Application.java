package com.WazaBe.HoloDemo;

import com.WazaBe.HoloEverywhere.LayoutInflater;
import com.WazaBe.HoloEverywhere.ThemeManager;

public class Application extends com.WazaBe.HoloEverywhere.app.Application {
	static {
		Application.getSettings().setUseThemeManager(true)
				.setAlwaysUseParentTheme(true);
		LayoutInflater.remap("com.WazaBe.HoloDemo.widget", "WidgetContainer",
				"OtherButton");
		ThemeManager.modify(ThemeManager.FULLSCREEN);
	}
}
