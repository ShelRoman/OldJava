package training.innerclasses;

/**
 * Created by user on 21/11/2015.
 */
public class Airplane {


    private AirplaneEngine apEngine;
    private boolean isFlying;

    public Airplane() {
    }

    @Override
    public Airplane clone() {
        return this;
    }

    private class AirplaneEngine implements IEngine {

        private Engine engine;

        private AirplaneEngine() {
            engine = new Engine();
        }

        public Engine getEngine() {
            return engine;
        }

        @Override
        public void turnOn() {
            if (!engine.getEngineStatus()) {
                engine.setEngineStatus(true);
                System.out.println("Dyr-dyr-dyr-dyr");
            } else {
                System.out.println("Engine is already working");
            }
        }

        @Override
        public void turnOff() {
            if (engine.getEngineStatus()) {
                engine.setEngineStatus(false);
                System.out.println("Engine has been turned off");
            } else {
                System.out.println("Engine is already turned off");
            }
        }

        private class Engine {

            private boolean engineStatus;

            public boolean getEngineStatus() {
                return engineStatus;
            }

            public void setEngineStatus(boolean status) {
                engineStatus = status;
            }
        }

    }
}
