public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123321));
    }
    public static boolean isPalindrome(int number){
        if (number < 0) number *= -1;
        int reverse = 0;
        int numberPal = number;
        while (numberPal > 0){
            reverse = reverse * 10;
            int lastDigit = numberPal % 10;
            numberPal /= 10;
            reverse = reverse + lastDigit;
        }
        if (reverse == number) return true;
        return false;
    }
}
