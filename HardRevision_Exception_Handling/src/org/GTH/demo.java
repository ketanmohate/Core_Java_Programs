// Step 1: Create custom exception
class AgeInvalidException extends Exception {
    public AgeInvalidException(String message) {
        super(message);
    }
}

// Step 2: Use it in code
public class UserExceptionDemo {
    public static void checkAge(int age) throws AgeInvalidException {
        if (age < 18) {
            throw new AgeInvalidException("Age must be 18 or older");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeInvalidException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}
