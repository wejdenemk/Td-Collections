package ex1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		
		Compte C1 = new Compte(1,1.22);
		Compte C2 = new Compte(2,2.65);
		
		Compte C4 = new Compte(4,0.21);
		Compte C5 = new Compte(5,5.1);
		
		ArrayList<Compte> list = new ArrayList<>();
		list.add(C1);
		list.add(C2);
		
		Banque CBanque = new Banque("compteB1",list);
		
		System.out.print("Liste des comptes du banque : \n  ");
		CBanque.affiche();
		System.out.print("\n");
		CBanque.creerCompte(3,5.1);
		System.out.print("Creation du nouveau compte : \n  ");
		CBanque.affiche();
		
		System.out.print("\n");
		System.out.print("\n");
		
		HashSet<Compte> listH = new HashSet<>();
		listH.add(C4);
		listH.add(C5);
		
		Titulaire Titul = new Titulaire("compteT1",listH);
		System.out.print("liste des comptes du titulaire 1 : \n  ");
		Titul.afficher();
		System.out.print("\n");
		Titul.ajoutCompte(7,5.68);
		System.out.print("Ajout d'un compte : \n  ");
		Titul.afficher();
		System.out.print("\n");
		System.out.print("Retrait depuis un compte : \n  ");
		Titul.ret(4,0.21);
		Titul.afficher();
		System.out.print("\n");
		Titul.dep(4,3.5);
		System.out.print("Depot dans un compte : \n  ");
		Titul.afficher();
		System.out.print("\n");
		
		System.out.print("le num du compte qui a le max solde : "+Titul.max());
			
		
	}
}
