package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
        } else {
            int n = 0;
            while (n <= Math.abs(multiplyByAndToInclusive)) {
                System.out.println(n * multiplyByAndToInclusive);
                n++;
            }
        }
    }
}
