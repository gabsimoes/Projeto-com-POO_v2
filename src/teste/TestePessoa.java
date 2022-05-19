package teste;

import beans.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		//classe que receberá os dados do usuário
		
		Pessoa gabrielle;
		gabrielle = new Pessoa();
		gabrielle.nome = "Gabrielle Simões";
		gabrielle.idade = 24;
		gabrielle.sexo = "feminino";
		gabrielle.genero = "feminino";
		
		System.out.println(gabrielle.nome + " " + gabrielle.idade);
				
		
		/*String nome = "Gabrielle Simões";
		int idade = 24;
		String sexo = "feminino";
		String genero = "feminino";
		
		System.out.println(nome);*/
	}

}
