package regEx;

public class PhoneSearch extends Search {

    private final String regEx = "8\\(\\d{3}\\)\\d{3}\\-\\d{2}\\-\\d{2}";

    public String getRedEx() {
        return regEx;
    }
}
