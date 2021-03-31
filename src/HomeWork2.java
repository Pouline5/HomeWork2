public class HomeWork2
    //Написать метод, принимающий на вход два целых числа и проверяющий,
        // что их сумма лежит в пределах от 10 до 20 (включительно),
        // если да – вернуть true, в противном случае – false.
{
    public static void main(String[] args)
    {
        System.out.println("Сумма п ределах между 10 и 20");
        int a = 9;
        int b = 3;
        boolean isBetween = isSumBetween10And20(a, b);
        System.out.println(isBetween);

        //Написать метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль,
        // положительное ли число передали или отрицательное.
        // Замечание: ноль считаем положительным числом.

        System.out.println("Положительное или отрицательлное");
        printSignOf(-8);

        //Написать метод, которому в качестве параметра передается целое число.
        // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

        System.out.println("Возврат отрицательного или положительного числа");
        boolean isNegative = isNegative(0);
        System.out.println(isNegative);

        //Написать метод, которому в качестве аргументов передается строка и число,
        // метод должен отпечатать в консоль указанную строку, указанное количество раз;

        System.out.println("Строка");
        print("Hello world!", 2);
    }

    public static boolean isSumBetween10And20(int left, int right)
    {
        int sum = left + right;
        return 10 < sum && sum <= 20;
    }

    public static void printSignOf(int number)
    {
        if (number >= 0)
        {
            System.out.println("Число положительное!");
        }
        else
        {
            System.out.println("Число отрицательное!");
        }
    }

    public static boolean isNegative(int number)
    {
        return number < 0;
    }

    public static void print(String message, int count)
    {
        for (int i = 0; i < count; i++)
        {
            System.out.println(message);
        }
    }
}
