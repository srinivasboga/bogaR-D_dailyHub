package com.getrosoft.teleport;

import javax.swing.*;

public class AccessibleButton extends JButton {
	public AccessibleButton(String text) {
		super(text);

		getAccessibleContext().setAccessibleName(text);

		getAccessibleContext().setAccessibleDescription("This is a button");
	}
}