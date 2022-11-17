//1.
//        - ћассив размерностью 20
//        - ќн заполн€етс€ случайными целыми числами от -10 до 10
//        - Ќужно найти максимальный отрицательный и минимальный положительный элементы массива
//        - ѕомен€ть их местами.

package randomArray;

public class CreateArray {

    static final int ARRAY_LENGTH = 20;
    static final int MAX = 10;
    static final int MIN = -10;
    static int[] arr = new int[ARRAY_LENGTH];

    public static void main(String[] args) {
        //ѕеременные хранини€ максимального отрицательного/минимального положительного
        int maxNegative = -11;
        int minPositive = 11;
        System.out.print("—генерированный массив: ");
        //Ќаполн€ем массив и печатаем его
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arr[i] = (int) ((Math.random() * ((MAX - MIN) + 1)) + MIN);
            System.out.printf("[%d]:%d ", i, arr[i]);
            //¬ы€сн€ем €вл€етс€ ли значение массива максимальным отрицательным/минимальным положительным, если да обновл€ем переменную
            if (arr[i] == 0) continue;
            if (arr[i] / Math.abs(arr[i]) == 1) {
                if (arr[i] < minPositive) minPositive = arr[i];
            } else if (arr[i] / Math.abs(arr[i]) == -1) {
                if (arr[i] > maxNegative) maxNegative = arr[i];

            } else
                System.out.println("Ќи отрицательное,  ни положительное, ни ноль... »ли в коде или в мироздании ошибка");
        }
        //ћен€ем макс отрицательные и мин положительные местами
        if ((maxNegative != -11 & minPositive != 11)) { //≈сли вдруг все нули
            for (int i = 0; i < ARRAY_LENGTH; i++) {
                if (arr[i] == maxNegative) {
                    arr[i] = minPositive;
                    System.out.printf("\n¬ €чейке [%d] максимальное отрицательное значение %d было помен€но на минимальное положительное значение %d", i, maxNegative, minPositive);
                    continue;
                }
                if (arr[i] == minPositive) {
                    arr[i] = maxNegative;
                    System.out.printf("\n¬ €чейке [%d] минимальное положительное значение %d было помен€но на максимальное отрицательное значение %d", i, minPositive, maxNegative);

                }
            }
        } else System.out.println("Ќе было ни одного отрицательниого или ни одного положительного числа");
        //ѕечатаем итоговый массив
        System.out.print("\n»тоговый массив: ");
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            System.out.printf("[%d]:%d ", i, arr[i]);
        }

    }


}


