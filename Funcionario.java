package Ex_Poo_30_03;

public class Funcionario extends Pessoa{

	private double salario;
	
	
	public Funcionario(String nome, int idade, int cpf, double salario) {
		super(nome, idade, cpf);
		this.salario = salario;
	}


	protected double getSalario() {
		return salario;
	}
	protected void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	public void status() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("CPF: " + getCpf());
		System.out.println("Salário: " +  getSalario());
	}

	
	
	
}
