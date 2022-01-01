public class HappyNumber {


    public int getNext(int n) {
        int totalSum = 0;

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            totalSum += Math.pow(digit, 2);
        }
        return totalSum;
    }

    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = getNext(n);
        }
        return n == 1;
    }
}
