package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HighscoreReader {

	public static void main(String[] args) {
	}	
	/**
	 * lese Highscoreliste und gibt ArrayList von Highscore Objekten zurück
	 * @return
	 */
	public ArrayList<Highscore>readHighscores(String filePath){
		
		ArrayList<Highscore> result = new ArrayList<>();
		
		File liste = new File(filePath);
		try {
			FileReader reader = new FileReader(liste);
			BufferedReader bReader = new BufferedReader(reader);
			

			while(bReader.ready()) {
				String zeile = bReader.readLine();
				
				Highscore hs = parseHighscore(zeile);
				result.add(hs);
				
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
		
		return result;
	}
	
	/**
	 * Zeichenkette in Highscore Objekt umwandeln
	 * @param line
	 * @return
	 */
	private Highscore parseHighscore(String line) {
		Highscore result;
		String[] parts = line.split(";");
		result = new Highscore(parts[0],Integer.parseInt(parts[1]));
		
		return result;
	}

}
