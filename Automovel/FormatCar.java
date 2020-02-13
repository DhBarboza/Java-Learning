package Automovel;

public class FormatCar {
	String tipo;
	String marca;
	String modelo;
	String cor;
	int preco;
	int ano;
	boolean novo;
	boolean revisao;
	
	void status() {
		System.out.println("Automóvel: "+ this.tipo);
		System.out.println("Automóvel marca: " + this.marca);
		System.out.println("Automóvel modelo: " + this.modelo);
		System.out.println("Automóvel cor: " + this.cor);
		System.out.println("Automóvel preço: " +this.preco);
		System.out.println("Automóvel ano: " + this.ano);
		System.out.println("Automóvel revisado: " + this.revisao);
		System.out.println("Automóvel novo: " + this.novo);
	
	}
	
	
	void manutencao() {
		if(this.revisao == false) {
			System.out.println("Precisa de Revisão!");
		}else {
			System.out.println("Automovel em dia");
		}
		
	}	
	
}
	
