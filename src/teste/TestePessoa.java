package teste;

import beans.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		//classe que receber� os dados do usu�rio
		
		Pessoa gabrielle;
		gabrielle = new Pessoa();
		gabrielle.nome = "Gabrielle Sim�es";
		gabrielle.idade = 24;
		gabrielle.sexo = "feminino";
		gabrielle.genero = "feminino";
		
		System.out.println(gabrielle.nome + " " + gabrielle.idade);
				
		
		/*String nome = "Gabrielle Sim�es";
		int idade = 24;
		String sexo = "feminino";
		String genero = "feminino";
		
		System.out.println(nome);*/
	}

}
