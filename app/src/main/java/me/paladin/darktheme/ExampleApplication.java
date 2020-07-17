package me.paladin.darktheme;

import android.app.Application;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

import me.paladin.darktheme.util.ThemeUtil;

public class ExampleApplication extends Application {
    
    @Override
    public void onCreate() {
        super.onCreate();
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String theme = preferences.getString("application_theme", ThemeUtil.THEME_SYSTEM);
        if (theme != null) ThemeUtil.applyTheme(theme);
    }
}
