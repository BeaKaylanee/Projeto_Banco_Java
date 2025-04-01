package herancapolimorfismo;

public class Barco extends Transporte {

	private String casco;
	private boolean vela;

	public Barco(String marca, int capacidade, int velocidade, String casco, boolean vela) {
		super(marca, capacidade, velocidade);
		this.casco = casco;
		this.vela = vela;
	}

	public String getCasco() {
		return casco;
	}

	public void setCasco(String casco) {
		this.casco = casco;
	}

	public boolean isVela() {
		return vela;
	}

	public void setVela(boolean vela) {
		this.vela = vela;
	}
	
	public void visualizar() {
		super.visualizar();
		
		System.out.println("\n\n************************************************************");
		System.out.println("Dados do Meio de Transporte:");
		System.out.println("****************************************************************");
		System.out.println("Casco: " + this.casco);
		System.out.println("Contém vela:  " + this.vela);
	}

}
