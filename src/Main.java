public class Main {
    public static void main(String[] args) {
        int customerAccount = 100;
        int refillAmount = 1100;
        int bonus = 0;
        int limit = 1000;

        if (refillAmount >= limit) {
            bonus = refillAmount / 100;
            customerAccount += bonus;
        }

        int result = customerAccount + refillAmount;
        System.out.println("Сумма на счёте: " + result + " рублей");
        System.out.println("Бонусов начислено: " + bonus);
    }
}
