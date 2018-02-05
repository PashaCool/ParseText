package text;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import regEx.*;

public class Sentence2 {
    private static Comparator<? super Lexema> c;

    private List<Lexema> words;

    public Sentence2() {
    }

    public Sentence2(String text) {
        words = new ArrayList<Lexema>();
        List<String> tWords = new ArrayList<String>();
        brokenParagraph(text, tWords);
        for (String s : tWords) {
            // System.out.println("add word: " + new Word(s));
            words.add(new Word(s));
        }
    }

    public List<Lexema> getWordList() {
        return words;
    }

    public void brokenParagraph(String txt, List<String> tWords) {
        /*Search sh = new EmailSearch();
        List<String> mails = sh.find(txt);
        tWords.addAll(mails);*/
        StringTokenizer st = new StringTokenizer(txt, " +\\.,!?\n");
        // StringTokenizer st = new StringTokenizer(txt, "^\\S+ {1}");
        while (st.hasMoreTokens()) {
            tWords.add(new String(st.nextToken()));
        }
    }

    public String toString() {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < words.size(); i++) {
            if (!(words.get(i) instanceof Punctuation)) {
                res.append(" ");
            }
            res.append(words.get(i).toString().trim());
        }
        return res.toString().trim();
    }

    public String getSentenseText() {
        String res = "";
        for (Lexema w : words) {
            res += w.getWord();
        }
        return res;
    }

    public void printWords(String m) {
        //System.out.print(words.contains(new Word("At")));
        words.sort(c);
        System.out.println("All words: ");
        for (int i = 1; i < getWordList().size(); i++) {
            char frstLit = getWordList().get(i - 1).toString().charAt(0);
            char next = getWordList().get(i).toString().charAt(0);
            if (frstLit != next) {
                System.out.print("\n");
            }
            System.out.print(getWordList().get(i) + " ");
        }
    }
}
