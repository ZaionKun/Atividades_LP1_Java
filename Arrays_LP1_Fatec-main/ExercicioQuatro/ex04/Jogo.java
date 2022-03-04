public class Jogo {
	String nome;
	String genero;
	String classificacaoIdade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getClassificacaoIdade() {
		return classificacaoIdade;
	}
	public void setClassificacaoIdade(String classificacaoIdade) {
		this.classificacaoIdade = classificacaoIdade;
	}
	
	public Jogo(String nome, String genero, String classificacaoIdade) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.classificacaoIdade = classificacaoIdade;
	}
	
	@Override
	public String toString() {
		return "Jogo: " + nome + " | genero = " + genero + " | classsificacaoIdade = " + classificacaoIdade;		
	}
	
	
}
