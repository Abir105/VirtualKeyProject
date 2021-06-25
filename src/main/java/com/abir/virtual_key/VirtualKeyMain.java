package com.abir.virtual_key;

import com.abir.virtual_key.screens.HomeScreen;

public class VirtualKeyMain {

    public static void main(String[] args) {
    	HomeScreen home = new HomeScreen();
    	
    	System.out.println("Project Name: VirtualKey");
    	System.out.println("Developer Name: Md. Ashiqur Rahman");
        System.out.println("From Dhaka, Bangldesh");
    	home.MenuList();
    	home.InputFromUser();

    }
}
