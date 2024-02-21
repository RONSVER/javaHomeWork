package org.example.algoBackEnd.homeWorkOne;

public class LineIndex {


    public static int targetIndexFunction(int[] array, int target) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (target == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public static short sumSquare(short[] array) {
        short sum = 0;

        for (int num : array) {
            sum += num * num;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] array = {3, 6, 4, 7, 2, 1, 9};
        int target = 2;
        int index = targetIndexFunction(array, target);
        if (index != -1) {
            System.out.println("Индекса числа " + target + " находится под такой цифрой: " + index);
        } else {
            System.out.println("Ошибка мы не смогли обнаружить такой индекс! Статус ошибки: " + index);
        }


        short[] arrayShort = {3, 6, 4, 7, 2, 1, 9};
        short finalSum = sumSquare(arrayShort);
        System.out.println("Сумма квадратов элементов ровна: " + finalSum);

    }
}
