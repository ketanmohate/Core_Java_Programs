package oop.org;
interface StringTemplate {
    void setString(String str);
    int getResult();
}

// Class to extract digits and return their sum
class ExtractDigit implements StringTemplate {
    String str;

    public void setString(String str) {
        this.str = str;
    }

    public int getResult() {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += ch - '0'; // Convert char to int
            }
        }
        return sum;
    }
}

// Class to count vowels in the string
class CountVowel implements StringTemplate {
    String str;

    public void setString(String str) {
        this.str = str.toLowerCase();
    }

    public int getResult() {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}

// Helper class to call getResult dynamically
class StringHelper {
    void performOperation(StringTemplate template) {
        int result = template.getResult();
        System.out.println("Result: " + result);
    }
}

// Main application class
public class StringWithDynamicPolyApp {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        StringHelper helper = new StringHelper();
        StringTemplate template;

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        System.out.println("Enter choice:\n1. Extract Digit Sum\n2. Count Vowels");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                template = new ExtractDigit(); // upcasting
                break;
            case 2:
                template = new CountVowel(); // upcasting
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        template.setString(input);
        helper.performOperation(template);
    }
}
