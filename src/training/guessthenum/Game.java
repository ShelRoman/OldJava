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

/**
 * Game class provides main functions of the game
 */
public class Game {

    /**
     * Field that contains value to immediately end the game
     */
    static final int QUIT_NUMBER = 666;
    /**
     * Field that contains value that refers to wrong input
     */
    static final int WRONG_INPUT = -666;
    /**
     * Field that contains maximum value for number to guess
     */
    private final int RAND_MAX = 100;
    /**
     * Field that contains maximum value for number to guess
     */
    private final int RAND_MIN = 0;
    /**
     * Field that provides running of startGame method if equals to false - game
     * over
     */
    private boolean runWhile = true;
    /**
     * Field that equals true if game was finished properly or false if game was
     * aborted
     */
    private boolean isGoalAchieved;
    /**
     * Array that contains min and max value of numbers range to guess
     */
    private int[] gameRange;
    /**
     * Field that contains number which user need to guess to win the game
     */
    private int goalNumber;
    /**
     * Field that refers to class which contains game statistic and info
     * messages
     */
    private GameInfo info = new GameInfo();
    /**
     * Field that refers to class which provides input to Game class
     */
    private GameController controller = new GameController();

    /**
     * Default constructor
     */
    Game() {
        goalNumber = rand();
        gameRange = new int[]{RAND_MIN, RAND_MAX};
    }

    /**
     * Constructor with parameters
     *
     * @param min - integer that refers to lower border of numbers range
     * @param max - integer that refers to upper border of numbers range
     */
    Game(int min, int max) {
        goalNumber = rand(min, max);
        gameRange = new int[]{min, max};
    }

    /**
     * Method that provides random number for goalNumber
     *
     * @return pseudorandom integer within 0 to 100 range
     */
    private int rand() {
        return (int) (RAND_MAX * Math.random());
    }

    /**
     * Method with parameters that provides random number for goalNumber
     *
     * @param min - integer that refers to lower border of numbers range
     * @param max - integer that refers to lower border of numbers range
     * @return pseudorandom integer within min to max range
     */
    private int rand(int min, int max) {
        if (max > RAND_MAX) {
            max = RAND_MAX;
        } else if (min < RAND_MIN) {
            min = RAND_MIN;
        }
        return ((int) (Math.random() * ((max) - min))) + min;
    }

    /**
     * Main method of the class which launches the game and analyze user's
     * attempts
     */
    void startGame() {
        info.printGreetings();
        while (runWhile) {
            info.printCurrentStats(gameRange);
            info.printAttemptMessage();
            processChoice(controller.getUserChoice());
        }
        info.printEndGameStats(isGoalAchieved);
    }

    /**
     * Method that handles user's inputted number
     *
     * @param userChoice - user's inputted number
     */
    private void processChoice(int userChoice) {
        if (isWrongInput(userChoice)) {
            info.printNaNMessage();
            return;
        }
        if (isQuitNumber(userChoice)) {
            endGame();
        } else if (isNotInRange(userChoice)) {
            info.printOutOfRangeMessage();
        } else {
            if (userChoice == goalNumber) {
                info.addAttempt(userChoice);
                isGoalAchieved = true;
                endGame();
            } else {
                info.addAttempt(userChoice);
                info.printTip(userChoice, goalNumber);
                changeRange(userChoice);
            }
        }
    }

    /**
     * Method that checks number for being equal to wrong input number
     *
     * @param userChoice - user's inputed number
     * @return true if user's number equal to wrong input number
     */
    private boolean isWrongInput(int userChoice) {
        return userChoice == WRONG_INPUT;
    }

    /**
     * Method that checks number for being equal to quit number
     *
     * @param userChoice - user's inputed number
     * @return true if user's number equal to quit number
     */
    private boolean isQuitNumber(int userChoice) {
        return userChoice == QUIT_NUMBER;
    }

    /**
     * Method that checks number for being in game range
     *
     * @param userChoice - user's inputed number
     * @return true if number is out of range
     */
    private boolean isNotInRange(int userChoice) {
        return userChoice < gameRange[0] || userChoice > gameRange[1];
    }

    /**
     * Method that stops game
     */
    private void endGame() {
        runWhile = false;
    }

    /**
     * Method that changes game range based on user's inputed number
     *
     * @param userChoice - user's inputed number
     */
    private void changeRange(int userChoice) {
        if (userChoice < goalNumber) {
            gameRange[0] = userChoice;
        } else {
            gameRange[1] = userChoice;
        }
    }

}
