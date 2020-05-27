package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("07700000000"));
        System.out.println(isPhoneNumberValid("6700000000"));

        System.out.println(isPhoneNumberValidPredicate.test("07700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("6700000000"));

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;
}

