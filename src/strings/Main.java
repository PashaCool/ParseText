package strings;

import java.util.Comparator;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import regEx.*;
import text.*;

public class Main {

    private static Comparator<? super Lexema> c;

    public static void main(String[] args) {

        // read from file
        BufferedInputFile bif = new BufferedInputFile();
        String m = bif.read("E:\\java\\task02\\text.txt");
        // System.out.println(m);

        /*
         * // search phone numbers Search ps = new PhoneSearch(); ps.find(m);
         * System.out.println(ps.toString());
         * 
         * // search emails Search em = new EmailSearch(); em.find(m);
         * System.out.println(em.toString());
         */

        // replace tabs and spaces
        Replace rp = new Replace();
        m = rp.replaceTab(m);
        m = rp.replaceSpaces(m);
        // System.out.println(m);

        Paragraph pp = new Paragraph(m);
        Sentence2 st = new Sentence2(m);
        List<Lexema> lexList = st.getWordList();
        lexList.sort(c);
        st.printWords(m);
    }
}