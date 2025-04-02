// fibonacci number -- LeetCode 509
public class Leet509 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int firstterm = 0;
        int secondterm = 1;

        for(int i=1; i <= n; i++){
            int thirdterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = thirdterm;
        }
        return firstterm;
    } 
    public static void main(String[] args) {
        Leet509 l = new Leet509();
        int number = 4;
        int result = l.fib(number);
        System.out.println(result);
    }
}
        