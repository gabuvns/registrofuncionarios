package empregados;

public class EmpregadoSalarioComissao extends EmpregadoComissao {
	private double salario;
	
	public EmpregadoSalarioComissao(String nome, String sobrenome, String inss, int vendas, double taxa, double salario) {
		super(nome, sobrenome, inss, vendas, taxa);
		this.salario = salario;
		this.salariototal = this.salario +(taxa * vendas); 		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
