public class Jogador {
	String nome;
	String idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public Jogador(String nome, String idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return nome + "|" + " idade = " + idade;
	}
}
