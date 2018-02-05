package text;

import java.util.List;

public class Word extends Lexema implements Comparable<Word> {

    private List<Character> word;

    public Word() {
    }

    public Word(String text) {
        super(text);
    }

    public List<Character> getWordList() {
        return this.word;
    }

    public int compareTo(Word w) {
        char a = this.getWord().charAt(0);
        char b = w.getWord().charAt(0);
        /*
         * if (a < 'a' && a > 'A') a += 32; else if (b < 'a' && b > 'A') b += 32;
         */
        return a - b;
    }
}
