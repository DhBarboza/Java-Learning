package Automovel;

public class Carro {
	public static void main(String [] args) {
		FormatCar c1 = new FormatCar();
		c1.tipo = "Carro";
		c1.modelo = "Siena";
		c1.marca = "Fiat";
		c1.cor = "Azul";
		c1.preco = 15000;
		c1.ano = 2010;
		c1.revisao = false;
		c1.novo= true;
		c1.status();
		c1.manutencao();
		
		FormatCar c2 = new FormatCar();
		c2.tipo ="Ônibus";
		c2.modelo ="S406";
		c2.marca ="Mercedes";
		c2.cor = "Laranja";
		c2.preco = 78000;
		c2.ano = 2007;
		c2.revisao = false;
		c2.novo= false;
		c2.status();
		c2.manutencao();		
		
	}

}
