package text;

public class Punctuation extends Lexema {

    private char punct;

    public Punctuation(String text) {
        super(text);
    }

    public char getPunctChar() {
        return this.punct;
    }

    public String toString() {
        return String.valueOf(punct);
    }

}
