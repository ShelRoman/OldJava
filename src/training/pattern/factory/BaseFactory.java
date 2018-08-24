package training.pattern.factory;

/**
 * Created by user on 01/12/2015.
 */
public abstract class BaseFactory {

    public BaseFactory() {

    }

    public abstract Circle createCircle();

    public abstract Triangle createTriangle();

}
