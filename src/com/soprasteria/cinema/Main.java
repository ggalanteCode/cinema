package com.soprasteria.cinema;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int etaUtente, prezzoBiglietto = 0, sconto = 2;
		String giorno;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Quanti anni hai?: ");
		etaUtente = s.nextInt();
		s.nextLine();
		System.out.print("Che giorno è?: ");
		giorno = s.nextLine();
		
		if(etaUtente < 7) {
			prezzoBiglietto = 0;
		} else if(etaUtente >= 7 && etaUtente < 15) {
			prezzoBiglietto = 6;
		} else if(etaUtente >= 15) {
			prezzoBiglietto = 10;
		}
		
		if(giorno.equalsIgnoreCase("mercoledi")) {
			prezzoBiglietto -= sconto;
		}
		
		System.out.println("Il prezzo del biglietto è: " + prezzoBiglietto);
	}

}
