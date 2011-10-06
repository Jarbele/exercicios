package br.ufpb.aps.jarbele.exercicio01;

public class ValidadorCampoNome implements ValidadorCampo{
	
	private int tamanhoMax;
	private int tamanhoMin;
	
	
	public ValidadorCampoNome (int max, int min){
		this.tamanhoMax = 30;
		this.tamanhoMin = 8;
	}
	
	public ValidadorCampoNome(){
		
	}
	
	public void verificarCampo (String txt) throws TextoInvalidoException{
		
		for ()
		
		
			/*try{
			if (txt.length() >= tamanhoMax){
				throw new TextoInvalidoException ("ERRO: Nome deve ter no máximo 30 caracteres");
			} else if (txt.length() < tamanhoMin){
				throw new TextoInvalidoException ("ERRO: Nome deve ter no mínimo 8 caracteres");
			} else if (txt.contains("^[0-9]")){
				throw new TextoInvalidoException ("ERRO: O Nome é um campo texto");
			} else System.out.println("OK");
		}catch(Exception ex){
			System.out.print(ex.getMessage());
		}
	}*/

	}
}
