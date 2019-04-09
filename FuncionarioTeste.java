package empregados;

import java.util.ArrayList;
import java.util.Scanner;


public class FuncionarioTeste {
	
	
	
	private static Scanner leitor;

	protected static void printMenu() {
		System.out.println("Bem vindo, escolha uma das opcoes:");
		System.out.println("1.)Empregado normal");
		System.out.println("2.)Empregado por hora");
		System.out.println("3.)Empregado comissionado");
		System.out.println("4.)Empregado assalariado/comissionado");
		System.out.println("5.)Listar os funcionarios");
		System.out.println("6.)Sair");
	}
	
	//Funcao generalista
	protected static String getInput() {
		leitor = new Scanner(System.in);
		String input = leitor.nextLine();
		return input;
	}
	
	//Lista funcionarios
	protected static void listafuncionarios(ArrayList<EmpregadoAssalariado> arraysalario,
			ArrayList<EmpregadoHora> arrayhora, ArrayList<EmpregadoComissao> arraycomissao, 
			ArrayList<EmpregadoSalarioComissao> arraysalariocomissao){
			
		//Printa os funcionarios, se houver, dependendo do tipo
		for(EmpregadoAssalariado x: arraysalario){
			System.out.println("===================================");
			System.out.println("Funcionario Assalariado Padrão");
			System.out.println("Nome: " + x.getNome());
			System.out.println("Sobrenome: " + x.getSobrenome());
			System.out.println("Inss: " + x.getInss());
			System.out.println("Salario: " + x.getSalariototal());
			System.out.println("===================================");
			
		}
		
		for(EmpregadoHora x: arrayhora){
			System.out.println("===================================");
			System.out.println("Funcionario Assalariado Padrão");
			System.out.println("Nome: " + x.getNome());
			System.out.println("Sobrenome: " + x.getSobrenome());
			System.out.println("Inss: " + x.getInss());
			System.out.println("Horas: " + x.getHoras());
			System.out.println("Salario por hora: " + x.getsalariohora());
			System.out.println("Salario final: " + x.getSalarioTotal());
			System.out.println("===================================");
			
		}
		
		for(EmpregadoComissao x: arraycomissao){
			System.out.println("===================================");
			System.out.println("Funcionario Assalariado Padrão");
			System.out.println("Nome: " + x.getNome());
			System.out.println("Sobrenome: " + x.getSobrenome());
			System.out.println("Inss: " + x.getInss());
			System.out.println("Vendas semanais: " + x.getVendasSemanais());	
			System.out.println("Taxa comissao: " + x.getTaxaComissao());
			System.out.println("Salario final: " + x.getSalariototal());
			System.out.println("===================================");
			
		}
		
		for(EmpregadoSalarioComissao x: arraysalariocomissao){
			System.out.println("===================================");
			System.out.println("Funcionario Assalariado Padrão");
			System.out.println("Nome: " + x.getNome());
			System.out.println("Sobrenome: " + x.getSobrenome());
			System.out.println("Inss: " + x.getInss());
			System.out.println("Salario base:" + x.getSalario());
			System.out.println("Vendas semanais: " + x.getVendasSemanais());	
			System.out.println("Taxa comissao: " + x.getTaxaComissao());
			System.out.println("Salario final: " + x.getSalariototal());
			System.out.println("===================================");
			
		}
		System.out.println("Aperte 5 para continuar");
		getInput();
		
	}
	
	//Passamos arrays com cada tipo de funcionario
	protected static void criaFuncionario(int opcao, ArrayList<EmpregadoAssalariado> arraysalario,
			ArrayList<EmpregadoHora> arrayhora, ArrayList<EmpregadoComissao> arraycomissao, 
			ArrayList<EmpregadoSalarioComissao> arraysalariocomissao){

		
		if(opcao == 5) {
			listafuncionarios(arraysalario, arrayhora, arraycomissao, arraysalariocomissao);
		}
		
		else {
			String nome;
			String sobrenome;
			String inss;
			
			System.out.println("Digite o primeiro nome do funcionario: ");
			nome = getInput();
			
			System.out.println("Digite o sobrenome do fucncionario: ");
			sobrenome = getInput();
			
			System.out.println("Digite o inss do funcionario: ");
			inss = getInput();
			
			 
			
			//Empregado Assalariado
			  if(opcao == 1) {
				System.out.println("Digite o salario do funcionario: ");
				double salario = Double.parseDouble(getInput());
				EmpregadoAssalariado n1 = new EmpregadoAssalariado(nome, sobrenome, inss, salario);
				arraysalario.add(n1);
			
			}
			
			//Empregado por hora
			else if (opcao == 2) {
				System.out.println("Digite quantas horas este funcionario trabalhou: ");
				int horas = Integer.parseInt(getInput());
				
				System.out.println("Digite quantos reais ele ganha por hora: ");
				double salariohora = Double.parseDouble(getInput());
				
				EmpregadoHora n2 = new EmpregadoHora(nome, sobrenome, inss, salariohora, horas);
				arrayhora.add(n2);
				
			}
			
			//Empregado comissionado(super) e o salario+comissao(sub)
			else if(opcao == 3 || opcao == 4) {
				System.out.println("Digite o valor total das vendas: ");
				int vendas = Integer.parseInt(getInput());
				
				System.out.println("Digite a taxa de comissao: ");
				double taxa = Double.parseDouble(getInput());
				
				if(opcao == 3) {
					EmpregadoComissao n3 = new EmpregadoComissao(nome, sobrenome, inss, vendas, taxa);
					arraycomissao.add(n3);				
				}
				else if (opcao == 4) {
					System.out.println("Digite o Salario base deste funcionario: ");
					double salario = Double.parseDouble(getInput());
				
					EmpregadoSalarioComissao n4 = new EmpregadoSalarioComissao(nome, sobrenome, inss, vendas, taxa, salario);
					arraysalariocomissao.add(n4);
				}
			}	
		}
	}
	
	 static void  menu() {
		printMenu();
		int input = Integer.parseInt(getInput());
		
		ArrayList<EmpregadoAssalariado>  arempregadoassalariado = new ArrayList<EmpregadoAssalariado>();
		ArrayList<EmpregadoHora>  arempregadohora = new ArrayList<EmpregadoHora>();
		ArrayList<EmpregadoComissao>  arempregadocomissao = new ArrayList<EmpregadoComissao>();
		ArrayList<EmpregadoSalarioComissao>  empregadosalariocomissao= new ArrayList<EmpregadoSalarioComissao>();
		
		while(input != 6) {
			if(input != 1 && input != 2 && input != 3 && input != 4 && input != 5){
				System.out.println("Por favor, digite uma opcao valida(1-6)");
				input = Integer.parseInt(getInput());
			}
			
			else {
				criaFuncionario(input, arempregadoassalariado, arempregadohora, arempregadocomissao, empregadosalariocomissao);
				
				printMenu();
				input = Integer.parseInt(getInput());
			}

		}

	}
	
	public static void main(String[] args) {
		menu();
		
		System.out.println("Programa encerrado");
	}

}
