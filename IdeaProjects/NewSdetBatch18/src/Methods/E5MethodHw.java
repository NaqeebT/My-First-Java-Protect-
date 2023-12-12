package Methods;

public class E5MethodHw {
    // Write a method whether a return number is prime or not?


        public static void main(String[] args) {
            int numberToCheck = 17; // You can change this to any positive integer

            if (isPrime(numberToCheck)) {
                System.out.println(numberToCheck + " is a prime number.");
            } else {
                System.out.println(numberToCheck + " is not a prime number.");
            }
        }

        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false; // Numbers less than or equal to 1 are not prime
            }

            // Check for divisibility from 2 to the square root of the number
            for (int i = 2; i <= (number/2); i++) {
                if (number % i == 0) {
                    return false; // Number is divisible, hence not prime
                }
            }

            return true; // If no divisors found, the number is prime
        }
    }



