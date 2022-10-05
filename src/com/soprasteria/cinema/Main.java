package com.soprasteria.cinema;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int etaUtente, prezzoBiglietto = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Quanti anni hai?: ");
		etaUtente = s.nextInt();
		s.nextLine();
		
		if(etaUtente < 7) {
			prezzoBiglietto = 0;
		} else if(etaUtente >= 7 && etaUtente < 15) {
			prezzoBiglietto = 6;
		} else if(etaUtente >= 15) {
			prezzoBiglietto = 10;
		}
		
		System.out.println("Il prezzo del biglietto è: " + prezzoBiglietto);
	}

}
