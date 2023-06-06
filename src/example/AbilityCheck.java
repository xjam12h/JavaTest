package example;

import java.util.Scanner;

public class AbilityCheck {
    public static void main(String[] args) {
        // fizzbuzz_1();
        // for_2();
        // while_3();
        callLiarBoy_4();
    }

    public static void fizzbuzz_1() {
        Scanner scanner = new Scanner(System.in);
        int inputData = scanner.nextInt();
        if (inputData % 3 == 0 && inputData % 5 == 0) {
            System.out.println("fizz buzz");
        } else if (inputData % 3 == 0) {
            System.out.println("fizz");
        } else if (inputData % 5 == 0) {
            System.out.println("buzz");
        } else {
            System.out.println(inputData);
        }
    }

    public static void for_2() {
        int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf("%3d", A[j][i]);
            }
            System.out.println();
        }
    }

    public static void while_3() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            String inputData = scanner.nextLine();
            if (inputData.length() == 0) {
                break;
            } else if (inputData.length() % 2 == 0) {
                continue;
            }
            count++;
        }
        System.out.println(count);
    }

    public static void callLiarBoy_4() {
        LiarBoy liarBoy = new LiarBoy(10, "竈門炭太郎");

        System.out.println("僕の名前は" + liarBoy.getName() + "だよ");
        System.out.println("僕の年齢は" + liarBoy.getAge() + "だよ");
        liarBoy.lie();
    }

}
