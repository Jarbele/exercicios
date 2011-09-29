package br.ufpb.aps.jarbele.exercicio01;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidadorCampoEmail implements ValidadorCampo{

	
	
	public ValidadorCampoEmail (){
		
	}
	
	public void verificarCampo (String txt) throws TextoInvalidoException{
	
		// cria um texto digitado regular
		Pattern digito = Pattern.compile("@.+$.+!.+#.+\\d[a-z]*");
		/*o caracter .(ponto) procura qualquer caracter único, menos uma nova linha 
		o caracter * (asterisco) localiza 0 ou mais ocorrências
		o caracter + (mais) localiza uma ou mais ocorrências
		\\d indica qualquer digito*/
		
		// corresponde a expressão regular à string
		Matcher texto = digito.matcher (txt);
		
		//compara o texto que foi passado e informa se a comparação é verdadeira ou não
		boolean textoDigitado;
		if (textoDigitado = texto.matches()){
			System.out.println("O texto digitado está dentro dos padrões exigidos!");
		} else {
			throw new TextoInvalidoException("O email não pode começar com esse tipo de caracter!");
		}
			
				
	}


}


//O email não pode começar com caracteres, do tipo: @, !, $.