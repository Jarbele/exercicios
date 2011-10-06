package br.ufpb.aps.jarbele.exercicio01;

import java.util.Scanner;

public class main {

		
	public static void main (String args[]){
		
		Scanner telaDeOpcao = new Scanner(System.in);
		Facade fachada = new Facade();
		int opcao = -1;
		while (opcao != 0){
			
		System.out.println("---- Sistema de cadastro ----\n");
		System.out.println("[1] Cadastrar\n");	 
		System.out.println("[2] Listar itens cadastrados\n");
		System.out.println("[0] Sair\n");
		
		opcao = Integer.parseInt(telaDeOpcao.nextLine());
		
			switch (opcao){
				case 1:
					
					Campo c = new Campo();
					
					//esse bloco é responsável pela verificação do texto
					
						 System.out.print("Nome:");
						 String nome = telaDeOpcao.nextLine();
						try{ 
						 c.verificarCampo(nome, new ValidadorCampoNome());
						 System.out.println("Opa! Deu certo.");
						 System.exit(0);
					} catch(TextoInvalidoException ex){
						System.out.println(ex.getMessage());
					}
					
					//esse bloco é responsável pela verificação do texto
					try {
						System.out.print("Idade: ");
						String idade = telaDeOpcao.nextLine();
						c.verificarCampo(idade, new ValidadorCampoIdade());
						
						System.out.println("Opa! Deu certo.");
						System.exit(0);
					} catch (TextoInvalidoException ex) {
						System.out.println(ex.getMessage());
					}
					
					//esse bloco é responsável pela verificação do email
					try{
						System.out.print("Email:");
						String email = telaDeOpcao.nextLine();
						c.verificarCampo(email, new ValidadorCampoEmail());
						
						System.out.println("Opa! Deu certo.");
						System.exit(0);
					} catch (TextoInvalidoException ex){
						System.out.println(ex.getMessage());
					}
					
					
					//usuario.cadastrarUsuario();
					System.out.println("Cadastro Finalizado");
					System.out.println("[C]ontinua ou [F]inaliza?");
					Scanner op = new Scanner(System.in); 
					int escolha = op.nextInt(); //armazena a escolha
					
					if (escolha == 'C') {

					} else if (escolha == 'F'){
						System.out.println("Fim de Cadastro");
					}
				break;	
				
				case 2: 
					fachada.listarItensCadastrados();
				break;
			}
		}

		System.out.println("Até Logo!");	
	
	}
	
}	
			
             		
	