public class Main {
    public static void main(String[] args) {
        int startAmount = 100; //Начальная сумма на счету
        int addAmount = 1100; //Сумма пополнения
        int bonusBase = 100; //Сумма пополнения для начисления 1 руб. бонуса
        int bonus = (addAmount / bonusBase); //Сумма начисленных бонусов
        if (addAmount > 1000) {
            System.out.println("Получено бонусов " + bonus);
            System.out.println("Баланс счета " + (startAmount + addAmount + bonus));
        } else {
            System.out.println("Получено бонусов " + "0");
            System.out.println("Баланс счета " + (startAmount + addAmount));
        }
    }
}