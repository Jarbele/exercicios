package br.ufpb.aps.jarbele.exercicio01;

public class ValidadorCampoTexto implements ValidadorCampo{
	
	private int tamanhoMax;
	private int tamanhoMin;
	
	
	public ValidadorCampoTexto (int max, int min){
		this.tamanhoMax = 40;
		this.tamanhoMin = 8;
	}
	
	public void verificarCampo (String txt) throws TextoInvalidoException{
		if (txt.length() >= tamanhoMax){
			throw new TextoInvalidoException ("O texto digitado está muito grande. Diminua-o!");
		} else if (txt.length() < tamanhoMin){
			throw new TextoInvalidoException ("O texto digitado está muito curto!");
		} else if (txt.contains("^[0-9]")){
			throw new TextoInvalidoException ("O texto digitado não pode conter números.");
		} 
	}


}
