public class Main {
    public static void main(String[] args) {
        long balance = 500;
        long refill = 2000;
        long bonus = refill / 100;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}
