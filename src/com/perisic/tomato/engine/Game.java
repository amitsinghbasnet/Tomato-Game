package com.perisic.tomato.engine;

import java.awt.image.BufferedImage;

/**
 * A Game is an image (BufferedImage) and an integer. The integer is the
 * solution of the game that is described in the image.
 * 
 * author Amit Singh Basnet
 *
 */
public class Game {

	BufferedImage image = null; // Corrected: Change the type to BufferedImage
	int solution = -1;

	/**
	 * Image of the game and what is the solution to the game.
	 * 
	 * @param img
	 * @param solution2
	 */
	public Game(BufferedImage img, int solution2) {
		super();
		this.image = img;
		this.solution = solution2;
	}

	// Corrected: Removed duplicate constructor with the same signature
	// public Game(BufferedImage img, int solution2) {
	// }

	/**
	 * The image of the game.
	 * 
	 * @return the image of the game.
	 */
	public BufferedImage getImage() { // Corrected: Change the return type to BufferedImage
		return image;
	}

	/**
	 * @return The solution of the game.
	 */
	public int getSolution() {
		return solution;
	}

}
