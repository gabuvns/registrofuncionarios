package empregados;


public class Funcionario {
	
	protected String nome;	
	protected String sobrenome;
	protected String inss;
	protected double salariototal;
	
	public double getSalariototal() {
		return salariototal;
	}


	public void setSalariototal(double salariototal) {
		this.salariototal = salariototal;
	}


	//empregadonormal -> superclasse
	public Funcionario(String nome, String sobrenome, String inss) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.inss = inss;		
	}
	
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getInss() {
		return inss;
	}

	public void setInss(String inss) {
		this.inss = inss;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

}

