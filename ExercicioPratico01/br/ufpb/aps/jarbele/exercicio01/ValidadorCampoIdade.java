package br.ufpb.aps.jarbele.exercicio01;

public class ValidadorCampoIdade implements ValidadorCampo {

	public ValidadorCampoIdade(){
	}
		
	public void verificarCampo (String txt) throws TextoInvalidoException{
		
		try {
			int idade = Integer.parseInt(txt);
			if (idade >= 150){
				throw new TextoInvalidoException("> ERRO: O valor máximo de Idade é: 150");
				} else if (idade <= 0){
					throw new TextoInvalidoException ("> ERRO: Valor inválido");
				}
			} catch (NumberFormatException ex) {
			throw new TextoInvalidoException("idade invalida");
		}
		
		
//		Pattern digito = Pattern.compile("+.\\d[0-9]+");
//		Matcher texto = digito.matcher (txt);
//
//		int idade = Integer.parseInt(txt);
//		
//		//verifica se existem apenas numeros no campo digitado
//		if (texto.matches()){
//			throw new TextoInvalidoException ("ERRO: Idade deve conter apenas números");
//		} else if (idade < 150){
//			throw new TextoInvalidoException ("ERRO: O valor máximo de Idade é: 150");
//		} else if (idade > 0){
//			throw new TextoInvalidoException ("ERRO: Valor inválido");
//		} else {
//			System.out.println("OK");			
//		}

		
		
		// verifica se a idade está dentro dos padrões permitidos
		
		
		
	}
}
