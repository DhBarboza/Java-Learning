package cadastro;

public class Cadastro {
	String nome;
	int idade;
	int peso;
	int altura;
	String objetivo;
	String biotipo;
	boolean atividade_fisica;
	
	void status() {
		System.out.println("Seu Nome: " +  this.nome);
		System.out.println("Sua Idade: " + this.idade);
		System.out.println("Seu Peso: " + this.peso);
		System.out.printf("Sua Altura: %d cm \n", this.altura);
		System.out.println("Objetivo: " + this.objetivo);
		System.out.println("Biotipo " + this.biotipo);
		System.out.println("Pratica Atividade Fisica: " + this.atividade_fisica);
		
	}
	
	void necessidade() {
		if(this.atividade_fisica == false ) {
			System.out.println("Saúde Instável, pratique atividade Fisíca!");
		}else {
			System.out.println("Excelente! Continue Regularmente");
		}
	}
	
	
	

}
