package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import text.Sentence2;

public class Paragraph {

    public List<Sentence2> sentenses;

    public Paragraph(String text) {
        sentenses = new ArrayList<Sentence2>();
        List<String> tSentenses = new ArrayList<String>();
        brokTex(text, tSentenses);
        for (String s : tSentenses) {
            sentenses.add(new Sentence2(s));
        }
    }

    void brokTex(String txt, List<String> tSentenses) {
        StringTokenizer st = new StringTokenizer(txt, "\n");
        while (st.hasMoreTokens()) {
            tSentenses.add(new String(st.nextToken()));
        }
    }

    public String getParagraph() {
        String res = "";
        for (Sentence2 sent : sentenses) {
            res += sent.getSentenseText();
        }
        return res;
    }
}