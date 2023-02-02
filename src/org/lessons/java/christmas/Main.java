package org.lessons.java.christmas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		ArrayList<String> desideri = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String desiderio;
        
        do {
            System.out.println("Inserisci un nuovo desiderio o scrivi 'stop' per fermarti:");
            desiderio = s.nextLine();
            
            if (!desiderio.equals("stop")) {
                desideri.add(desiderio);
            }
        } while (!desiderio.equals("stop"));
        
        System.out.println("La tua lista dei desideri:");
        
        Collections.sort(desideri);
        
        for (String d : desideri) {
            System.out.println(d);
        }
	        
	        s.close();
	}
}
