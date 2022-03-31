package com.lockedme;

public class LockedMeMain {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		String veeksha;
		MenuOptions.printWelcomeScreen("LockedMe", veeksha);
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}
