package cleancode.testcases.nullreturn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestMethods {

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
    public Optional<Date> createDateFromStringAlreadyRefactored(String dateAsString) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            return Optional.ofNullable(formatter.parse(dateAsString));
        } catch (ParseException e) {
            return null;
        }
    }

    // misleadingly marked by the plugin
    public Date createDateFromStringNonNull(String dateAsString) {
        Date parsedDate = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            parsedDate = formatter.parse(dateAsString);
        } catch (ParseException e) {
            parsedDate = new Date();
        }

        return parsedDate;
    }
}
