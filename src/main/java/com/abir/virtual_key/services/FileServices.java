package com.abir.virtual_key.services;

import com.abir.virtual_key.entities.FileDirectory;
import com.abir.virtual_key.screens.FileScreen;
import com.abir.virtual_key.screens.HomeScreen;
import com.abir.virtual_key.screens.ScreenInterface;


public class FileServices {
	
	public static HomeScreen HomeScreen = new HomeScreen();
    public static FileScreen FileScreen = new FileScreen();    
    
    public static ScreenInterface CurrentScreen = HomeScreen;

    
    public static ScreenInterface getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(ScreenInterface currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
