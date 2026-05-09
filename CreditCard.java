//  Credit Card Validation using "Luhn Algorithm":
// Given a string cardNumber representing a 16-digit credit card number, determine whether it is valid using the Luhn Algorithm.

// The validation rules are:

// Starting from the left (for 16-digit cards), double every alternate digit.
// If the doubled value becomes greater than 9, subtract 9 from it.
// Add all digits together.
// If the total sum is divisible by 10, the card is valid.

// Return:

// "Valid Credit Card" if valid
// "Invalid Credit Card" otherwise

// Example 1:

// Input
// str = "4532015172830366"
// Output
// Valid Credit Card

// Explanation

// After applying the Luhn Algorithm:

// Total sum becomes divisible by 10
// Therefore, the card is valid.
// Example 2
// Input
// str = "1234567890123456"
// Output
// Invalid Credit Card
// Explanation

// After processing all digits:

// Final sum is not divisible by 10
// Therefore, the card is invalid.
// Constraints
// str.length == 16
// str contains only digits


public class CreditCard {
    public static void main(String[] args) {
        if (str.length() != 16) {
            System.out.println("Invalid Credit Card");
            return;
        }

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            int digit = str.charAt(i) - '0';

            // Double alternate digits
            if (i % 2 == 0) {

                digit = digit * 2;

                // If digit becomes > 9
                if (digit > 9) {
                    digit = digit - 9;
                }
            }

            sum += digit;
        }

        if (sum % 10 == 0) {
            System.out.println("Valid Credit Card");
        } else {
            System.out.println("Invalid Credit Card");
        }
    }
}