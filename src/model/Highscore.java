package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Highscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File liste = new File("highscores.txt");
		try {
			FileReader reader = new FileReader(liste);
			BufferedReader bReader = new BufferedReader(reader);
			

			while(bReader.ready()) {
				String zeile = bReader.readLine();
				System.out.println(zeile);
			}
			bReader.close(); //Datei Resource wieder freigegeben.
			
		} catch (FileNotFoundException e) {
			System.out.println("Fehler: Datei nicht gefunden...");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Fehler: Kann Datei nicht lesen...");
			//e.printStackTrace();
		}
		

	}

}
