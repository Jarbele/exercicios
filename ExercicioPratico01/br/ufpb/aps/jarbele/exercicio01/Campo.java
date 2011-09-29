package br.ufpb.aps.jarbele.exercicio01;

public class Campo {
	
	private String campoTexto;
	private String campoEmail;
	private int campoNumerico;
	private ValidadorCampo validador;
	
	public Campo (String ct, String ce, int cn, ValidadorCampo validador){
		this.campoTexto = ct;
		this.campoEmail = ce;
		this.campoNumerico = cn; 
		this.validador = validador;
		
	}
	
	public void setValidador (ValidadorCampo vc){
		this.validador = vc;
	}

	public boolean verificarCampo (String txt) throws TextoInvalidoException { //txt: texto que o usuário digitar no campo

		
	}
	
	
	
}
