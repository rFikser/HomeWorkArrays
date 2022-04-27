
import java.util.Arrays;

public class HomeWorkArrays {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, 4, 5};
        int firstNumber = myArray[0];
        System.out.println("Оригинальный массив " + Arrays.toString(myArray));
        myArray[0] = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = firstNumber;
        System.out.println("Изменённый массив " + Arrays.toString(myArray));
        int sum = myArray[0] + myArray[myArray.length / 2];
        System.out.println("Первый элемент " + myArray[0] + " Второй элемент " + myArray[myArray.length / 2]);
        System.out.println("Сумма первого и среднего элемента = " + sum);
    }
}
