import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Введите положительное целое число: ");
        int n = scanner.nextInt();
        if (n < 0){
            System.out.println("Вы ввели отрицательное число, попробуйте снова..");
        }
        else{
            while (n > 0){
                if (n % 2 != 0){ //Если n четное, то добавляем к sum значение n.
                    sum += n;
                }
                n--; //Уменьшаем n на 1, чтобы прервать цикл когда дойдем до 0.
            }
            System.out.println("Сумма нечетных чисел равна: " + sum);
        }
    }
}
