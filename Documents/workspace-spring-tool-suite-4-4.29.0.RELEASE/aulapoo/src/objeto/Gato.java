package objeto;

public class Gato {

	private String nome;
	private int idade;
	private String raca;
	private String cor;

	
	
	public Gato(String nome, int idade, String raca, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		this.cor = cor; // instancia o objeto - fica obrigatório preencher
	}
	
	public Gato() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCorString() {
		return cor;
	}

	public void setCorString(String corString) {
		this.cor = corString;
	}

	public void miar() {
		System.out.println("Miauuu! ");
	}

	public void comer() {
		System.out.println("wiwiwi");
	}

	public void pular() {
		System.out.println("Derrubou tudo! ");
	}
	
	public void visualizar() {
		System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cor: " + cor);
        System.out.println("Raça :" + raca);
	}
}
