
public class Executa {

	public static void main(String[] args) {
		ProfessorDaFaculdade renan = new ProfessorDaFaculdade();
		renan.setSalario(1);
		renan.setNome("renan");
		renan.setHorasDeAula(180);
		
		ProfessorDaFaculdade diego = new ProfessorDaFaculdade();
		diego.setSalario(2);
		diego.setNome("diego");
		diego.setHorasDeAula(180);
		
		EmpregadoDaFaculdade felipe = new Reitor();
		felipe.setSalario(100);
		felipe.setNome("felipe");
		
		Programador p = new Programador();
		p.setNome("diogo");
		p.setSalario(100);
		
		Relatorio relatorio = new Relatorio();
		relatorio.adiciona(renan);
		relatorio.adiciona(diego);
		relatorio.adiciona(felipe);
		relatorio.adiciona(p);
		
		relatorio.gerar();
	}
	
}
