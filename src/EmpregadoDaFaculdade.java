public class EmpregadoDaFaculdade {
	private String nome;
	private double salario;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return this.salario;
	}

	public double getDespesasMensal() {
		return this.salario;
	}

	public String getInfo() {
		return "nome: " + this.nome + " com salario de " + this.salario;
	}

}
