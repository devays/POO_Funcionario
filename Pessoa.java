package Ex_Poo_30_03;

public abstract class Pessoa {


	private String nome;
	private int idade;
	private int cpf;
	
	public Pessoa(String nome, int idade, int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected int getIdade() {
		return idade;
	}
	protected void setIdade(int idade) {
		this.idade = idade;
	}
	protected int getCpf() {
		return cpf;
	}
	protected void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
	
}
