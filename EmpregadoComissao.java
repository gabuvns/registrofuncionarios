package empregados;

public class EmpregadoComissao extends Funcionario{
	
	protected int vendasSemanais;
	protected double taxaComissao;
	
	
	public EmpregadoComissao(String nome, String sobrenome, String inss, int vendas, double taxa) {
		super(nome, sobrenome, inss);
		// TODO Auto-generated constructor stub
		this.vendasSemanais= vendas;
		this.taxaComissao = taxa;
		this.salariototal = vendas * taxa;
	}

	public int getVendasSemanais() {
		return vendasSemanais;
	}

	public void setVendasSemanais(int vendasSemanais) {
		this.vendasSemanais = vendasSemanais;
	}

	public double getTaxaComissao() {
		return taxaComissao;
	}

	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}

	
}
