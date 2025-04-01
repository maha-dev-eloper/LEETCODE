public class Leet9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        int original = x;
        int reverseNumber = 0;
        
        while (x > 0) {
            int d = x % 10;
            reverseNumber = reverseNumber * 10 + d;
            x = x / 10;
        }

        return reverseNumber == original;
    }

    public static void main(String[] args) {
        Leet9 l = new Leet9();
        int number = 121; 
        boolean result = l.isPalindrome(number);
        System.out.println(result);  
    }
}
