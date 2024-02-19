package com.sample.main;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static final int MAX_ATTEMPTS = 3;
	
	public static void main(String[] args){
		String userName = null;
		int counter = 0;
		boolean isOK = false;
		
		while(userName == null || userName.isEmpty() || counter < MAX_ATTEMPTS) {
			if (counter == MAX_ATTEMPTS) {
				break;
			}
			counter++;
			
			userName = JOptionPane.showInputDialog(null, "Hello, world!\nHi, user!\nMay I know what is your name?");
			if (userName != null && !userName.trim().isEmpty()) {
				isOK = true;
				break;
			}
		}
		
		if (!isOK) {
			JOptionPane.showMessageDialog(null, "Input is invalid and max attempts have been reached.\nPlease try again next time.\nThank you and goodbye!", "Error", JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Nice to meet you, " + userName + "!\nSee you next time!");
		}
	}
}