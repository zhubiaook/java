package flow;

public class ForStruct {
    public static void main(String[] args) {
        int num1, num2, result;

        // while
        num1 = 1;
        while (num1 <= 9) {
            num2 = 1;
            while (num2 <= num1) {
                result = num1 * num2;
                System.out.printf("%d * %d = %-3d", num1, num2, result);
                num2++;
            }
            num1++;
            System.out.println();
        }

        // do..while
        num1 = 1;
        do {
            num2 = 1;
            do {
                result = num1 * num2;
                System.out.printf("%d * %d = %-3d", num1, num2, result);
                num2++;
            } while (num2 <= num1);
            num1++;
            System.out.println();
        } while (num1 <= 9);

        // for
        for (num1 = 1; num1 <= 9; num1++) {
            for (num2 = 1; num2 <= num1; num2++) {
                result = num1 * num2;
                System.out.printf("%d * %d = %-3d", num1, num2, result);
            }
            System.out.println();
        }

        int[] arr = new int[20];
        for (int i = 0; i < 20 ; i++) {
            arr[i] = i*i;
        }

        // foreach
        for (int j : arr) {
            System.out.println(j);
        }

        // break
        // Find the first number from 1 to 20 that can be divided by 3 and great than 7
        for (int num = 1; num <= 20; num++) {
            if ((num > 7) && (num % 3 == 0)) {
                System.out.println("num = " + num);
                break;
            }
        }

        // continue
        // Find all numbers from 1 to 20 that can be divided by 3
        for (int num = 1; num <= 20; num++) {
            if (num % 3 != 0) {
                continue;
            }
            System.out.println("num = " + num);
        }
    }
}
