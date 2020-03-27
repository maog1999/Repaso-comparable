package controller;

import model.Logic;
import processing.core.PApplet;

public class ControllerMain {
	private Logic logic;
	private PApplet appLo;
	
	public ControllerMain(PApplet appLo) {
		this.appLo = appLo;
		logic = new Logic(appLo);
	}

	public void addElementList() {
		logic.addElementList();
	}

	public void sortList(char c) {
		logic.sortList(c);
	}

	public void pintar() {
		logic.pintar();
	}
}
