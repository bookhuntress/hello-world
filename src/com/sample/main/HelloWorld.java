package com.sample.main;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args){
		Object[] possibleValues = { "First", "Second", "Third" };
		Object selectedValue = JOptionPane.showInputDialog(null,
			"Choose one", "Input",
			JOptionPane.INFORMATION_MESSAGE, null,
			possibleValues, possibleValues[0]);
		JOptionPane.showMessageDialog(null, "You selected: " + selectedValue);
	}
}