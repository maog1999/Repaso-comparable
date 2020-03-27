package model;

import processing.core.PApplet;

public class Ball implements Comparable <Ball> {
	private int posX, posY, tam, Value;
	PApplet app;
	public Ball(int posX, int posY, int tam, int Value, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tam = tam;
		this.Value = Value;
		this.app = app;
		
	}
	public void draw() {
		app.fill(255);
		app.text(this.Value,this.posX-10,this.posY+40);
		app.fill(255,0,0);
		app.ellipse(posX, posY, tam, tam);
	}
	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getTam() {
		return tam;
	}
	public void setTam(int tam) {
		this.tam = tam;
	}
	public int getValue() {
		return Value;
	}
	public void setValue(int value) {
		Value = value;
	}
	
	
	public int compareTo(Ball nextBall) {
		return this.tam - nextBall.getTam() ;
	}
	

}
