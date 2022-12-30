public class Main {
    public static void main(String[] args) {
        /*Необходимо реализовать следующий метод:

1. Получаем на входе массив чисел.

2. Все четные числа увеличиваем на единицу.

3. Возвращаем кусок списка с 3-го по 7-й элемент.*/
        int[] array = {0,100, 150,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0) {
                array[i]++;
                System.out.println(array[i]);
            }
        }
        System.out.println();
        int a = 2;
        int[] array2 = new int[5];
        for (int i = 0; i < 5; i++){
            array2[i] = array[a];
            a++;
            System.out.println(array2[i]);
        }
    }
}
