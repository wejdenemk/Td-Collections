package ex1;

import java.util.HashSet;

public class Titulaire {

	String nom;
	HashSet<Compte> MesComptes;
	
	public Titulaire(String nom, HashSet<Compte> mesComptes) {
		super();
		this.nom = nom;
		MesComptes = mesComptes;
	}
	
	public void ajoutCompte(int num,double solde){
		Compte C = new Compte(num,solde);
		MesComptes.add(C);
	}
	
	public void afficher(){
		for(Compte i : MesComptes ){
			System.out.print(i.toString());
		}
	}
	
	void ret(int num, double m){
		for(Compte i : MesComptes ){
			if(i.getNumero() == num) {
				i.retrait(m);
			}
		}
	}
	
	void dep(int num, double m){
		for(Compte i : MesComptes ){
			if(i.getNumero() == num) {
				i.depot(m);
			}
		}
	}
	
	int max(){
		int num=0;
		for (Compte i : MesComptes) {
			for(Compte j : MesComptes) {
		      if(i.getSolde()< j.getSolde()) {
		    	  num = j.getNumero();	     
		      } 
		    }
		}
		return num;
	}
	
}
