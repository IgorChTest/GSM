public class Main {
    public static void main(String[] args) {
        int a = 100; //Начальная сумма на счету
        int y = 1100; //Сумма пополнения
        int z = 100; //Сумма пополнения для начисления 1 руб. бонуса
        int x = (y / z); //Сумма начисленных бонусов
        if (y > 1000) {
            System.out.println(a + y + x);
        } else {
            System.out.println(a + y);
        }
    }
}