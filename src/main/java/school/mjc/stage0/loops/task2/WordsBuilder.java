package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int n = 0;
        while (n < chars.length) {
            System.out.print(chars[n]);
            n++;
        }
    }
}
