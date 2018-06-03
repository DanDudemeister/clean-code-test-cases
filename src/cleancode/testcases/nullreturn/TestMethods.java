package cleancode.testcases.nullreturn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestMethods {

    // wrapper classes
    public Integer getAnInteger() {
        return null;
    }

    // string
    public String getAString() {
        return null;
    }

    // collections
    public List<String> getAList() {
        return null;
    }

    public Map<String, String> getAMap() {
        return null;
    }

    public Set<String> getASet() {
        return null;
    }

    public Iterator<String> getAnIterator() {
        return null;
    }

    // arrays
    public String[] getAnArray() {
        return null;
    }

    public String[][] getATwoDimensionalArray() {
        return null;
    }

    public String[][][] getAThreeDimensionalArray() {
        return null;
    }

    // other types
    public Date createDateFromString(String dateAsString) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            return formatter.parse(dateAsString);
        } catch (ParseException e) {
            return null;
        }
    }

    // declaration
    public String getAStringDeclaredWithNull() {
        String string = null;
        return string;
    }

    // multiple declarations at once
    public String getAStringMultipleDeclarations() {
        String a, b, c;
        b = null;
        return b;
    }

    // assignment
    public String getAStringLaterAssignedAsNull() {
        String string;
        string = null;
        return string;
    }

    // multiple assignments at once
    public String getAStringMultipleAssignments() {
        String a, b, c;
        a = b = c = null;
        return b;
    }

    // ternary Expression
    public String getAStringWithTernaryOperator(boolean bool) {
        return bool ? "true" : null;
    }

    // already refactored
    public String getAStringAlreadyRefactored() {
        return "";
    }

    public List<String> getAListAlreadyRefactored() {
        return Collections.emptyList();
    }

    public Optional<Date> createDateFromStringAlreadyRefactored(String dateAsString) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            return Optional.ofNullable(formatter.parse(dateAsString));
        } catch (ParseException e) {
            return null;
        }
    }
}
