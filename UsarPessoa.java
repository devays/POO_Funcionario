package Ex_Poo_30_03;

public class UsarPessoa {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Funcionario 1", 20, 503234122, 20300);
		Gerente g1 = new Gerente("Gerente 1", 32, 424232, 100, 32);
		
		
		
		f1.status();
		System.out.println();
		g1.status();

	}

}
