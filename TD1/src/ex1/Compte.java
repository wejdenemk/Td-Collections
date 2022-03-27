package ex1;

public class Compte{

	int numero;
	double solde;
	
	public Compte(int numero, double solde) {
		super();
		this.numero = numero;
		this.solde = solde;
	}
	
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}


	void retrait(double m) {
		solde = solde - m;
		}
	
	void depot(double m){
		solde = solde + m;
		}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + "]";
	}
	
}
