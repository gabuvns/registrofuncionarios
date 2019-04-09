package empregados;

public class EmpregadoHora extends Funcionario{
	
	private int horas;
	private double salariohora;
	
	
	public EmpregadoHora(String nome, String sobrenome, String inss, double salario, int horas){
		super(nome, sobrenome, inss);
		// TODO Auto-generated constructor stub
		this.horas = horas;
		this.salariohora = salario;
		this.salariototal = this.horas*salariohora;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getsalariohora() {
		return salariohora;
	}

	public void setsalariohora(double salariohora) {
		this.salariohora = salariohora;
	}

	public double getSalarioTotal() {
		return salariototal;
	}
	
}