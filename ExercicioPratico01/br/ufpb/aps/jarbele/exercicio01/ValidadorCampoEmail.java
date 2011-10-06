package br.ufpb.aps.jarbele.exercicio01;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidadorCampoEmail implements ValidadorCampo{
	
	public ValidadorCampoEmail (){
	}
	
	public void verificarCampo (String txt) throws TextoInvalidoException{
	
		Pattern digitoSimbolo = Pattern.compile("@.+$.+!.+#.+\\d[a-z]*");
		// corresponde a expressão regular à string
		Matcher textoSimbolo = digitoSimbolo.matcher (txt);
		
		Pattern digitoNumero = Pattern.compile(".+\\d[0-9]*");
		Matcher textoNumero = digitoNumero.matcher (txt);
		
		// verifica se o texto digitado cotém os caracteres
		if (textoSimbolo.matches()){
			throw new TextoInvalidoException("ERRO: E-mail invalido");
		} else if (textoNumero.matches()){
			throw new TextoInvalidoException("ERRO: E-mail inválido");
		} else {
			System.out.println("OK");
		}
				
	}

	/*
	 * for (int i =0; i<txt.length();i++)
	 * if (txt.charAt[i] == '@')
	 * return true;
	 * 
	 * throws new Exception("----");
	 */

}

/*Observações: o caracter .(ponto) procura qualquer caracter único, menos uma nova linha 
o caracter * (asterisco) localiza 0 ou mais ocorrências
o caracter + (mais) localiza uma ou mais ocorrências
\\d indica qualquer digito*/