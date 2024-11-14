public class Main {
    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 1");
        int[] amountOfCosts = new int[]{200, 400, 100, 500, 600};
        int totalCosts = 0;
        for (int i = 0; i < amountOfCosts.length; i++) {
            totalCosts += amountOfCosts[i];
        }
        System.out.println("«Сумма трат за месяц составила " + totalCosts + " рублей»");
        //Задача 2
        System.out.println("Задача 2");
        int[] expenses = new int[]{200, 400, 100, 500, 600};
        int totalExpenses = 0;
        int minExpenses = expenses[0];
        int maxExpenses = expenses[0];
        for (int el : expenses) {
            totalExpenses += el;
            if (el < minExpenses) {
                minExpenses = el;
            }
            if (el > maxExpenses) {
                maxExpenses = el;
            }
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxExpenses + " рублей");
        // Задача 3
        System.out.println("Задача 3");
        int[] expens = new int[] {200, 400, 100, 500, 600};
        int sum = 0;
        for (int i = 0; i < expens.length; i++) {
            sum += expens[i];
        }
        double avarege = (double) sum / expens.length;
        System.out.println("Средняя сумма трат за месяц составила " +avarege + " рублей");
        // Задача 4
        System.out.println("Задача 4");
        char[] reversFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reversFullName.length; i > 0; i--) {
            System.out.print(reversFullName[i-1]);
        }

    }
}