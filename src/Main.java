public class Main {
    public static void main(String[] args) {
        int initialAmount = 100; // a - сумма начального счета
        int refillAmount = 1300; // b - сумма пополнения
        int bonus = 0;
        if (refillAmount > 1000); {
        bonus = refillAmount / 100;
        }
        int finalAmount = initialAmount + refillAmount + bonus; // c - итоговый счет
        System.out.println("Бонус - " + bonus + " рублей");
        System.out.println("Итоговый счет - " + finalAmount + " рублей");
    }
}
