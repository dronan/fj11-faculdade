public class Relatorio {

	EmpregadoDaFaculdade [] emp;
	int i = 0;
	
	
	public Relatorio() {
		emp = new EmpregadoDaFaculdade[100];
	}

	
	public void adiciona(EmpregadoDaFaculdade e) {
		emp[i] = e;
		i++;
	}
	
	public void gerar() {
		for (EmpregadoDaFaculdade e : emp) {
			if(e != null) {
				System.out.println(e.getInfo());
			}
		}
		
	}

}