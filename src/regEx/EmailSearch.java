package regEx;

public class EmailSearch extends Search {

    private final String regEx = "\\w+([\\.-]?\\w+)*@\\w+([\\.-]?w+)*\\.(\\w{2,4})+";

    public String getRedEx() {
        return regEx;
    }
}
