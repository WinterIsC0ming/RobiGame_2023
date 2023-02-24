package model;

import java.io.PrintWriter;
import java.util.ArrayList;

public class HighscoreWriter {

	public void scoreWriter(ArrayList<Highscore> scores, String filePath) {

				try {
					PrintWriter prnt = new PrintWriter(filePath);
					
					for (Highscore value : scores) {
						prnt.write(value.name + ";" + value.score + System.lineSeparator());
					}
					prnt.flush();
					prnt.close();
				}
				catch (Exception ex) {
					System.out.println("Putt");
				}
	}
}

