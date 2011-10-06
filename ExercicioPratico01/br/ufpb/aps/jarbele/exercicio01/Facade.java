package br.ufpb.aps.jarbele.exercicio01;

public class Facade {
	
	private Formulario form;
	
	public Facade(){
	}
	
	public void listarItensCadastrados(){
		form.listarItensCadastrados();
	}

}
