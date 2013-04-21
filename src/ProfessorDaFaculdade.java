
public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
	private int horasDeAula;

	public void setHorasDeAula(int horasDeAula){
		this.horasDeAula = horasDeAula; 
	}
	
	public int getHorasDeAula(){
		return this.horasDeAula;
	}

	public double getDespesasMensal(){
		return  getSalario() + (this.horasDeAula * 10);
	}
	
	public String getInfo() {
		return "nome: " + getNome() + " com despesa total de " + getDespesasMensal();
	}
	
	
}
