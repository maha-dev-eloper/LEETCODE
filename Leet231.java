// finding if a number is a power of two -- LeetCode 231
public class Leet231 {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            while (n % 2 == 0) {
                n = n / 2;

            }
            if (n == 1) {
                return true;
            } else {
                return false;
            }

        }
    }
    public static void main(String[] args) {
        Leet231 l = new Leet231();
        int number = 16;
        boolean result = l.isPowerOfTwo(number);
        System.out.println(result);
    }

}
