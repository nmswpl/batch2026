package in.co.nmsworks.training.week3.day6.word;

public class WordPair {
    private String word;
    private int count;

    WordPair(String word, int count){
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "WordPair{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}';
    }
}
