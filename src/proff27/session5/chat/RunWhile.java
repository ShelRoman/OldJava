package proff27.session5.chat;


public class RunWhile {

    private static boolean runWhile = true;

    public static void setRunWhile(boolean runWhile) {
        RunWhile.runWhile = runWhile;
    }

    public static boolean isRunWhile() {
        return runWhile;
    }

    public static void runBreak() {
        System.out.println("Goodbye");
        RunWhile.setRunWhile(false);
        return;
    }
}

