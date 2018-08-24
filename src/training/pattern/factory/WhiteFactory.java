package training.pattern.factory;

/**
 * Created by user on 01/12/2015.
 */
public class WhiteFactory extends BaseFactory {

    public WhiteFactory() {

    }

    @Override
    public Triangle createTriangle() {
        return new WhiteTriangle();
    }

    @Override
    public Circle createCircle() {
        return new WhiteCircle();
    }
}
