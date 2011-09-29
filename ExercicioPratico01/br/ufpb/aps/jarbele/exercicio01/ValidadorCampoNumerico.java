package br.ufpb.aps.jarbele.exercicio01;

public class ValidadorCampoNumerico implements ValidadorCampo {

	
	
	public ValidadorCampoNumerico(){
		
	}
	
	
	public void verificarCampo (String txt) throws TextoInvalidoException{
		
		
	}
}

/*
 * int idade = Integer.parseInt(texto);

        //Definir a seqüência de caracteres padrão de numeros
        Pattern p = Pattern.compile("[0-9]+");

        //Combina a string dada com o padrão
        Matcher m = p.matcher(texto);

        //Verificar se a comparação é verdadeira
        boolean matchFound = m.matches();
        if (matchFound) {
            System.out.println("OK");
        } else {
            if ((idade < 0) || (idade >= 150)){
                    throw new IdadeInvalidaException("Idade inválida!");
            }


 */
