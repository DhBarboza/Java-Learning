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
		System.out.println("Autom�vel: "+ this.tipo);
		System.out.println("Autom�vel marca: " + this.marca);
		System.out.println("Autom�vel modelo: " + this.modelo);
		System.out.println("Autom�vel cor: " + this.cor);
		System.out.println("Autom�vel pre�o: " +this.preco);
		System.out.println("Autom�vel ano: " + this.ano);
		System.out.println("Autom�vel revisado: " + this.revisao);
		System.out.println("Autom�vel novo: " + this.novo);
	
	}
	
	
	void manutencao() {
		if(this.revisao == false) {
			System.out.println("Precisa de Revis�o!");
		}else {
			System.out.println("Automovel em dia");
		}
		
	}	
	
}
	
