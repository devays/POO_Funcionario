package Ex_Poo_30_03;

public class Gerente extends Funcionario{

	
	private double bonus;
	public double total;
	
	public Gerente(String nome, int idade, int cpf, double salario, double bonus) {
		super(nome, idade, cpf, salario);
		if(bonus > 100) {
			this.bonus = 100;
			total = salario + (salario * (100 / 100));
		} else if (bonus < 0) {
			this.bonus = 0;
			total = salario + (salario * (0 / 100));
		} else {
			this.bonus = bonus;
			total = salario + (salario * (bonus / 100));
		}
		
	}

	private double getBonus() {
		return bonus;
	}

	private void setBonus(double bonus) {
		this.bonus = bonus;
	}

	
	public void status() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("CPF: " + getCpf());
		System.out.println("Salário:" + getSalario());
		System.out.println("Bônus em %: " + getBonus());
		System.out.println("Salário com bônus: " + total);
	}

	
	
	
}
