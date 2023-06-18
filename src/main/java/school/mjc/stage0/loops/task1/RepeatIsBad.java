package school.mjc.stage0.loops.task1;

public class RepeatIsBad {

    @SuppressWarnings("java:S106")
    public void repeatIsBad(){
        printMessage(20);
    }

    private void printMessage(int n) {
        if (n <= 0) {
            return;
        }

        System.out.println("writing the same code doesn't have much impact, and it's also time consuming");

        printMessage(n - 1);
    }
}
