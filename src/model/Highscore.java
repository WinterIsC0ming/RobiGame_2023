package model;

/**
 * Klasse zur Verwaltung der Highscore daten
 * @author Tommy Winter
 *
 */

public class Highscore {
	
	String name;
	int score;
	
	/**
	 * 
	 * @param name
	 * @param score
	 */
	public Highscore(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}

}
