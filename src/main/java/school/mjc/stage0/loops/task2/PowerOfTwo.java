package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
            return;
        }
        int n = 0;
        while (n <= power) {
            System.out.println((int)Math.pow(2, n));
            n++;
        }
    }
}
