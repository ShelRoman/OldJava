package training.pattern.factory;

import java.awt.Color;

/**
 * @author Roman
 * a class that is used to get the needed color factory
 */
public abstract class AbstractFactory {

    /**
     * @param color - color for shapes to be created by the returned factory
     * @return a factory that creates shapes of given in the parameter color
     * or null if such factory doesn't exist
     */
    public static BaseFactory getFactory(Color color) {

        // return a black factory
        if (color == Color.BLACK) {
            return new BlackFactory();
        }

        //return a white factory
        else if (color == Color.WHITE) {
            return new WhiteFactory();
        }

        return null;
    }
}
