package text;

import java.util.ArrayList;
import java.util.List;

abstract public class Lexema {

    private List<Character> word;

    public Lexema() {
    }

    public Lexema(String text) {
        word = new ArrayList<Character>();
        char[] strArray = text.toCharArray();
        for (char s : strArray) {
            word.add(s);
        }
    }

    public String getWord() {
        String arr = "";
        for (Character c : word) {
            arr += c;
        }
        return arr;
    }

    public List<Character> getWordList() {
        return this.word;
    }

    public String toString() {
        String res = "";
        for (Character c : word) {
            res += c;
        }
        return res;
    }

    public int compareTo(Word w) {
        return (this.getWord().compareToIgnoreCase(w.getWord()));
    }
}
