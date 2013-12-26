package com.android.settings.thinkingbridge;

import android.os.Bundle;
import android.preference.Preference;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class SystemSettings extends SettingsPreferenceFragment {

    private static final String TAG = "SystemSettings";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.system_settings);
    }
    
    @Override
    public void onResume() {
        super.onResume();
    }
}