package com.m;

public class Porta {
	private int id;
	private int x,y; //Deslocamento do personagem na matriz
	private boolean tracada;
	private int magiaCont;
	private boolean encantada;
	
	Porta(int id, int x, int y, boolean trancada){
		this.id = id;
		this.x = x;
		this.y = y;
		this.tracada = trancada;
		this.magiaCont = 0;
		this.encantada = false;
	}

	public boolean isTracada() {
		return tracada;
	}

	public void setTracada(boolean tracada) {
		this.tracada = tracada;
	}

	public int getMagiaCont() {
		return magiaCont;
	}

	public void setMagiaCont(int magiaCont) {
		this.magiaCont = magiaCont;
	}

	public boolean isEncantada() {
		return encantada;
	}

	public void setEncantada(boolean encantada) {
		this.encantada = encantada;
	}
	
}
