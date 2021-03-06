package ex1;

import java.util.ArrayList;

public class Banque implements Comparable<Banque>{

	String nom;
	ArrayList<Compte> Comptes;
	
	public Banque(String nom, ArrayList<Compte> comptes) {
		super();
		this.nom = nom;
		Comptes = comptes;
	}
	
	
	public ArrayList<Compte> getComptes() {
		return Comptes;
	}


	public void setComptes(ArrayList<Compte> comptes) {
		Comptes = comptes;
	}


	public void creerCompte(int num,double solde){
		Compte C = new Compte(num,solde);
		Comptes.add(C);
	}
	
	public void affiche(){
		for(int i=0;i<Comptes.size();i++){
			System.out.print(Comptes.get(i).toString());
		}
		
	}
	
	@Override
	public int compareTo(Banque o) {
		return this.compareTo(o);
	}


}
