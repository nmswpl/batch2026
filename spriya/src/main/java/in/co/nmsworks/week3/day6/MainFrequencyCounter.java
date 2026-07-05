package in.co.nmsworks.week3.day6;

public class MainFrequencyCounter {
    public static void main(String[] args) {

        WordFrequencyCounter counter = new WordFrequencyCounter();

        counter.addExcludedWords();
        counter.readFile();
        counter.printCount();
    }
}
