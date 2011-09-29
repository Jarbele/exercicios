package br.ufpb.aps.jarbele.exercicio01;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidadorCampoEmail implements ValidadorCampo{

	
	
	public ValidadorCampoEmail (){
		
	}
	
	public void verificarCampo (String txt) throws TextoInvalidoException{
	
		// cria um texto digitado regular
		Pattern digito = Pattern.compile("@.+$.+!.+#.+\\d[a-z]*");
		/*o caracter .(ponto) procura qualquer caracter �nico, menos uma nova linha 
		o caracter * (asterisco) localiza 0 ou mais ocorr�ncias
		o caracter + (mais) localiza uma ou mais ocorr�ncias
		\\d indica qualquer digito*/
		
		// corresponde a express�o regular � string
		Matcher texto = digito.matcher (txt);
		
		//compara o texto que foi passado e informa se a compara��o � verdadeira ou n�o
		boolean textoDigitado;
		if (textoDigitado = texto.matches()){
			System.out.println("O texto digitado est� dentro dos padr�es exigidos!");
		} else {
			throw new TextoInvalidoException("O email n�o pode come�ar com esse tipo de caracter!");
		}
			
				
	}


}


//O email n�o pode come�ar com caracteres, do tipo: @, !, $.