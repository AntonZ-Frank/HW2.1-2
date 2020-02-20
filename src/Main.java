public class Main {

    public static void main(String[] args) {
        int score = 100; // Начальные данные, 100р на счете клиента оператора.
        int payment = 1093; // Вносимый платеж клиента
        int condition = 1000; //условие получения бонуса
        int bonus = 0;
        if (payment > condition) // проверка условия получения бонуса
        {bonus = payment / 100;} // расчет суммы бонуса
        else {bonus = 0;}
        int scoreTotal = (score + payment + bonus); // На счету после зачисления
        System.out.println ("Баланс: поступил платеж на сумму " + payment);
        System.out.println ("Начисленно бонусных рублей: " + bonus);  // приложение, выводящее итоговый бонус.
        System.out.println ("Всего на счету: " + scoreTotal);
    }
}