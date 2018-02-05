package regEx;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class Search {

    private List<String> findList = new ArrayList<String>();

    public List<String> getFindList() {
        return findList;
    }

    public List<String> find(String text) {
        Pattern pt = Pattern.compile(getRedEx());
        Matcher match = pt.matcher(text);

        while (match.find()) {
            getFindList().add(match.group());
        }
        if (getFindList().isEmpty()) {
            return null;
        } else {
            return getFindList();
        }
    }

    public String toString() {
        String res = "";
        for (String s : getFindList()) {
            res += s + "\n";
        }
        return res;
    }

    abstract public String getRedEx();
}
