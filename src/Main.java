//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int balance = 300;
        int oneBonus = 100;
        int refill = 1_500;
        System.out.println("Внесено на счет: " + refill + " руб");

        int bonus;

        if (refill > 1_000) {
            bonus = refill / oneBonus;
        } else {
            bonus = 0;
        }
        System.out.println("Начислено бонусов: " + bonus + " руб");

        int inTotal = balance + bonus + refill;

        System.out.println("Итого на счету: " + inTotal + " руб");

    }
}