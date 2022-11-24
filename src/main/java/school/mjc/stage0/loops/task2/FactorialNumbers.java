package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int n = 0;
        int res = 1;
        while (n <= printToInclusive) {
            res *= n == 0 ? 1 : n;
            System.out.println(res);
            n++;
        }
    }
}
