package br.ufpb.aps.jarbele.exercicio01;

import java.util.List;
import java.util.LinkedList;

public class Formulario {

	private List<Campo> campos;
	private String descricao;

	
	public Formulario (String nome){
		this.descricao = nome;
		this.campos = new LinkedList<Campo> ();
	}
		
	public void addCampo (Campo c){
		campos.add(c);
	}
	
	public void removeCampo (Campo c){
		campos.remove(c);
	}
	
		
}
