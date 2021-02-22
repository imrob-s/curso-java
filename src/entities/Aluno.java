package entities;

public class Aluno {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaTotal() {
		return nota1 + nota2 + nota3;
	}
	
	
	public String result() {
		String resultado;
		double qntFalta = 60 - notaTotal();
		if (notaTotal() < 60) {
			resultado = "FAILED\n" + String.format("MISSING %.2f POINTS", qntFalta);
		} else {
			resultado = "PASS";
		}
		return resultado;
		
	}
}
