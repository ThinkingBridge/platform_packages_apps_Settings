package com.android.settings;

import com.android.settings.airplane.AirplaneEnabler;
import com.android.settings.bluetooth.BluetoothEnabler;
import com.android.settings.profiles.ProfileEnabler;
import com.android.settings.wifi.WifiEnabler;

public class SwitcherHelpers {

    private WifiEnabler mWifiEnabler;
    private BluetoothEnabler mBluetoothEnabler;
    private ProfileEnabler mProfileEnabler;
    private AirplaneEnabler mAirplaneEnabler;
    private int isWifi = 0;
    private int isBluetooth = 0;
    private int bluetoothIndex = 0;
    private int isProfile = 0;
    private int isAirplane = 0;
    private static SwitcherHelpers mHelpers = null;

    private SwitcherHelpers(){}

    public static SwitcherHelpers getInstance(){
        if(mHelpers == null){
            mHelpers = new SwitcherHelpers();
        }
        return 	mHelpers;
    }

    public WifiEnabler getmWifiEnabler() {
        return mWifiEnabler;
    }

    public void setmWifiEnabler(WifiEnabler mWifiEnabler) {
        this.mWifiEnabler = mWifiEnabler;
    }

    public BluetoothEnabler getmBluetoothEnabler() {
        return mBluetoothEnabler;
    }

    public void setmBluetoothEnabler(BluetoothEnabler mBluetoothEnabler) {
        this.mBluetoothEnabler = mBluetoothEnabler;
    }

    public int getIsWifi() {
        return isWifi;
    }

    public void setIsWifi(int isWifi) {
        this.isWifi = isWifi;
    }

    public int getIsBluetooth() {
        return isBluetooth;
    }

    public void setIsBluetooth(int isBluetooth) {
        this.isBluetooth = isBluetooth;
    }

    public int getBluetoothIndex() {
        return bluetoothIndex;
    }

    public void setBluetoothIndex(int bluetoothIndex) {
        this.bluetoothIndex = bluetoothIndex;
    }

    public ProfileEnabler getmProfileEnabler() {
        return mProfileEnabler;
    }

    public void setmProfileEnabler(ProfileEnabler mProfileEnabler) {
        this.mProfileEnabler = mProfileEnabler;
    }

    public int getIsProfile() {
        return isProfile;
    }

    public void setIsProfile(int isProfile) {
        this.isProfile = isProfile;
    }

    public AirplaneEnabler getmAirplaneEnabler() {
        return mAirplaneEnabler;
    }

    public void setmAirplaneEnabler(AirplaneEnabler mAirplaneEnabler) {
        this.mAirplaneEnabler = mAirplaneEnabler;
    }

    public int getIsAirplane() {
        return isAirplane;
    }

    public void setIsAirplane(int isAirplane) {
        this.isAirplane = isAirplane;
    }
}