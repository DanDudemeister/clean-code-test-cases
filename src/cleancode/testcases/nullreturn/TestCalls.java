package cleancode.testcases.nullreturn;

import java.util.Date;
import java.util.Optional;
import java.util.function.BiFunction;

public class TestCalls {

    private static final String DATE_AS_STRING = "2018-06-03";
    private TestMethods testMethods;

    public TestCalls() {
        testMethods = new TestMethods();
    }


    private void callMethods() {

        // assignment
        Date date = testMethods.createDateFromString(DATE_AS_STRING);


        // chain call
        long time = testMethods.createDateFromString(DATE_AS_STRING).getTime();


        // chain call in different lines
        time = testMethods
                .createDateFromString(DATE_AS_STRING)
                .getTime();


        // already adapted
        Optional<Date> optionalDate1 = testMethods.createDateFromStringAlreadyRefatored(DATE_AS_STRING);


        // methodreference
        BiFunction<TestMethods, String, Date> createDateFromString1 = TestMethods::createDateFromString;


        // lambda
        BiFunction<TestMethods, String, Long> createDateFromString2 =
                (testMethods1, dateAsString) -> testMethods1.createDateFromString(dateAsString).getTime();


        // if
        if (testMethods.createDateFromString(DATE_AS_STRING) != null) {
            System.out.println("");
        }


        // non-generic Optional
        Optional optionalDate2 = testMethods.createDateFromStringAlreadyRefatored(DATE_AS_STRING);


        // method call inherited from object
        String string = testMethods.createDateFromString(DATE_AS_STRING).toString();


        // method call without any context
        testMethods.createDateFromString(DATE_AS_STRING);
    }
}
