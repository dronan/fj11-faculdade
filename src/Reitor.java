public class Reitor extends EmpregadoDaFaculdade {


	public double getDespesasMensal() {
		return getSalario() + 1000;
	}
	
	public String getInfo() {
		return "nome: " + getNome() + " com despesa total de " + getDespesasMensal();
	}

}
