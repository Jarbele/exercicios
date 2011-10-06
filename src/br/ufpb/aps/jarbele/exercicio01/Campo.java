package br.ufpb.aps.jarbele.exercicio01;

public class Campo {
	
	private String nome;
	private String email;
	private int idade;
	
	
	public Campo (){
	}
	
	public String getLabel (){
		return nome;
	}
	
	public void setLabel (String label){
		this.nome = label;
	}

	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}

	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int id){
		this.idade = id;
	}
	
	
	
	public void verificarCampo (String txt, ValidadorCampo vc) throws TextoInvalidoException { // verificar se esse void dá algum problema, se der, colcoar boolean
		vc.verificarCampo(txt);
	}
		
}
