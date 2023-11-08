package work01;

public class Utilitor {
    /*
           1.1 Create a public utility class named "Utilitor" in package named "work01Utilitor".
           1.2 Create a public method named "testString" in "Utilitor" class.
               This method receives a parameter of type "String"
               named "value" and it returns the "value" if nothing is wrong.
               However, if the "value" is null, it throws NullPointerException.
               If the "value" is a blank string, it throws IllegalArgumentException.
           1.3 Create a public method named "testPositive" in "Utilitor" class.
               This method receives a parameter of type "double" named "value"
               and it returns the "value" if this "value" is a positive value.
               Otherwise, it throws IllegalArgumentException.
           1.4 Create a public method named "computeIsbn10" in "Utilitor" class.
               This method recieves a parameter of type "long" named "isbn10"
               and it returns the value of "isbn10" whose last digit is modified
               to make it a valid ISBN-10.
    
               The ISBN-10 code instead uses modulo 11, which is prime,
               and all the number positions have different weights 1, 2, ... 10.
               This system thus detects all single-digit substitution and transposition errors
               (including jump transpositions), but at the cost of the check digit possibly being 10, represented by "X".
               (An alternative is simply to avoid using the serial numbers which result in an "X" check digit.)
    
               ** You must use loop to calculate the ISBN-10 check-digit. **
           1.5 Show in this "work01Utilitor" method how to use 1.2-1.4 and
               check their correctness. */
    public String testString(String value) {
        if (value == null) {
            throw new NullPointerException("Value cannot be null");
        }
        if (value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be an empty string");
        } else {
            return value;
        }
    }

    public double testPositive(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be positive");
        }
        return value;
    }

    public int computeIsbn10(long isbn10) {
        if (isbn10 < 0 || isbn10 > 1000000000) {
            throw new IllegalArgumentException("ISBN-10 value must be non-negative and is not 9 digits");
        }

//        int[] digits = new int[10];
//        //0 1 2 3 4 5 6 7 8 9
//        int i = 9;
//        while (isbn10 > 0) {
//            digits[i] = (int) (isbn10 % 10);
//            isbn10 /= 10;
//            i--;
//        }
//
//        int checkDigit = 0;
//        for (i = 0; i < 10; i++) {
//            checkDigit += (i + 1) * digits[i];
//        }
//        checkDigit %= 11;
//        return checkDigit;
        //FIXME: explain method
        int result = 0;
        for (int i = 2; i < 10; i++) {
            int digit = (int) isbn10 % 10;
            result += digit*i;
            isbn10/=10;
        }
        return (11- (result%11)) %11;



    }
}
