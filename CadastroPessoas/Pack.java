package cadastro;

public class Pack {
	public static void main(String [] args) {
		Cadastro p1 = new Cadastro();
		p1.nome = "Rodolfo";
		p1.idade = 23;
		p1.peso = 80;
		p1.altura = 180;
		p1.objetivo = "Hipertrofia";
		p1.biotipo = "Endomorfo";
		p1.atividade_fisica = false;
		p1.status();
		p1.necessidade();
		
		
	}

}
