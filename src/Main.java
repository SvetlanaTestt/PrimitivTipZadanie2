public class Main {
    public static void main(String[] args) {

        int account = 243;
        int replenishment = 1300;
        int iBonus = 0;

        int bonus;
        int outcome;
        if (replenishment >= 1000) {
            bonus = replenishment / 100 * 1;
            outcome = account + replenishment + bonus;
            System.out.println("Итоговая сумма на счету: " + outcome);
            System.out.printf("Из них бонусов: " + bonus);
        } else {

            bonus = 0;
            outcome = account + replenishment + bonus;

            System.out.println("Итоговая сумма на счету: " + outcome);
            System.out.printf("Из них бонусов: " + iBonus);
        }
    }
}