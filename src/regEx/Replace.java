package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace {

    public String replaceTab(String text) {
        Pattern pat = Pattern.compile("\t");
        Matcher match = pat.matcher(text);
        String newStr = match.replaceAll(" ");
        return newStr;
    }

    public String replaceSpaces(String text) {
        Pattern pat = Pattern.compile("( )+");
        Matcher match = pat.matcher(text);
        String newStr = match.replaceAll(" ");
        return newStr;
    }
}
