package com.m;

import java.util.ArrayList;
import java.util.Stack;

public class Sala {
	private int tipo; //1 - Sala, 2 - Corredor
	private int i, j;
	private boolean cima, baixo, esquerda, direita; // Mostra (Se tipo é sala) as possiveis salas que o personagem pode acessar
	private int ouro;
	private boolean temTroll;
	private Troll troll;
	private ArrayList <Porta> portas;
	private Stack <Chave> chaves;
	private Stack <Pocao> pocoes;
	private Stack <Machado> machados;
	
	Sala(int tipo, int i, int j, boolean cima, boolean baixo, boolean esquerda, boolean direita, ArrayList <Porta> portas, 
			Stack <Chave> chaves, Stack <Pocao> pocoes, Stack <Machado> machados){
		this.tipo = tipo;
		this.i = i;
		this.j = j;
		this.cima = cima;
		this.baixo = baixo;
		this.esquerda = esquerda;
		this.direita = direita;
		this.ouro = 0;
		this.temTroll = false;
		this.troll = null;
		this.portas = portas;
		this.chaves = chaves;
		this.pocoes = pocoes;
		this.machados = machados;
	}
	
	
	public int getTipo() {
		return tipo;
	}
	
	public int getOuro() {
		return ouro;
	}
	
	public void setOuro(int ouro) {
		this.ouro = ouro;
	}
	
	public boolean temTroll() {
		return temTroll;
	}
	
	public void setTemTroll(boolean temTroll) {
		this.temTroll = temTroll;
	}
	
	public Porta getPorta(int id){
		//AINDA NÃO ESTÁ CERTO, FALTA VERIFICAR SE O ID EXISTE
		return portas.get(id);
	}
	
	//		####	Chaves		####
	
	// <!> Retorna a poção no topo da pilha
	public Chave getChave(){
		//Verificar se está vazio ...
		return chaves.pop();
	}
	
	//Adiciona uma chave ao conjunto de chaves da sal
	public void addChave(Chave c){
		chaves.push(c);
	}
	
	//Retorna o número de chaves presente na sala
	public int getNumChaves(){
		return chaves.size();
	}
	
	
	
	//		####	Poção		####
	
	// <!> Retorna a poção no topo da pilha
	public Pocao getPocao(){		
		//Verificar se está vazio ou não
		return pocoes.pop();
	}
	
	//Adiciona uma poção ao conjunto de poções da sala
	public void addPocao(Pocao p){
		pocoes.push(p);
	}
	
	//Retorna o número de poções na sala
	public int getNumPocoes(){
		return pocoes.size();
	}
	
	
	
	// <!> Retorna um machado no topo da pilha
	public Machado getMachado(){
		//Verificar se está vazio ou não
		return machados.pop();
	}
	
	
	
	
	
	
}
