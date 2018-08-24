/*
 * "Guess the number game"
 *
 * @version 1.1
 *
 * 19.10.2015
 *
 * @author Roman Sheludko
 */
package training.guessthenum;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * GameController class for "Guess the number game"
 * Provides processing of user's inputs
 */
class GameController {

    /**
     * Default constructor
     */
    GameController() {
    }

    /**
     * Main method that provides number input for user
     *
     * @return WRONG_INPUT if not integer was inputed
     */
    int getUserChoice() {
        Scanner scan = new Scanner(System.in);
        try {
            return scan.nextInt();
        } catch (InputMismatchException e) {
            scan.next();
        }
        return Game.WRONG_INPUT;
    }
}
