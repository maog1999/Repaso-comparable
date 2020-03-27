package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	
	private LinkedList <Ball> listBall;
	private PApplet app;
	private int contador;

	public Logic(PApplet app) {
		listBall = new LinkedList<Ball>();
		contador = 0;
		this.app = app;
	}

	public void addElementList() {
		contador ++; //implementar el for del profe
		listBall.add(new Ball((contador*60)-70,app.width/2,(int) app.random(10,50),(int) app.random(1,1000),app));
	}

	public void sortList(char c) {
		switch(c) {
		case 'n':
			System.out.println("ord nat");
			Collections.sort(listBall);
		break;
		}
	}

	public void pintar() {
		for(int i = 1; i<listBall.size();i++) {
			listBall.get(i).draw();
		}
	}



}
