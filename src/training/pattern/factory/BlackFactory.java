package training.pattern.factory;

/**
 * Created by user on 01/12/2015.
 */
public class BlackFactory extends BaseFactory {

    public BlackFactory() {

    }

    @Override
    public Circle createCircle() {
        return new BlackCircle();
    }

    @Override
    public Triangle createTriangle() {
        return new BlackTriangle();
    }
}
