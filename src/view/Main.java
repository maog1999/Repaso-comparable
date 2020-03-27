package view;

import controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet {

	private ControllerMain controller;
	
	public static void main(String[] args) {
		PApplet.main("view.Main");
	}
	public void settings() {
		size(600,600);
	}
	public void setup() {
		controller = new ControllerMain(this);
	}
	public void draw() {
		background(155);
		
		controller.pintar();
	}
	public void mousePressed() {
		controller.addElementList();
	}
	public void keyPressed() {
		controller.sortList(key);
	}
}
