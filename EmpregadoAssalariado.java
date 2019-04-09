package empregados;

public class EmpregadoAssalariado extends Funcionario {	
	
		public EmpregadoAssalariado(String nome, String sobrenome, String inss, double salariototal) {
			super(nome, sobrenome, inss);
			this.salariototal = salariototal;
					
		}
		
}
