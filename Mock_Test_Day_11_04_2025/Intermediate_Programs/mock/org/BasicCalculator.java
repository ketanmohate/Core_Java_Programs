package mock.org;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String s = scanner.nextLine();
        scanner.close();
        
        int num = 0, result = 0, temp = 0;
        char sign = '+';
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');
            }
            
            if (!(c >= '0' && c <= '9') && c != ' ' || i == s.length() - 1) {
                if (sign == '+') {
                    result += temp;
                    temp = num;
                } else if (sign == '-') {
                    result += temp;
                    temp = -num;
                } else if (sign == '*') {
                    temp *= num;
                } else if (sign == '/') {
                    temp /= num;
                }
                sign = c;
                num = 0;
            }
        }
        result += temp;
        
        System.out.println("Result: " + result);
    }
}
