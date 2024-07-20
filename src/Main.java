public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int[] array = {10000, 9000, 23000, 12000, 30000};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задача 2");



            int sumMax = 1;
            for(final int current:array){
                if(current > sumMax){
                    sumMax = current;
                }
            }
        System.out.println("Максимальная сумма трат за неделю составила " + sumMax + " рублей");

           int sumMin = array[0];
           for (int i = 0;i < array.length; i++){
               if(sumMin > array[i]){
                   sumMin = array[i];
               }
           }
        System.out.println("Минимальная сумма трат за неделю составила " + sumMin + " рублей");

        System.out.println("Задача 3");

        double expensePerWeek = 0;
        double averageExpenses = 0;
        for (int i = 0;i < array.length;i++){
            expensePerWeek += array[i];
        }
        averageExpenses = expensePerWeek / array.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");


        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

















    }
}