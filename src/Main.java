public class Main {
    public static void main(String[] args) {
        // Задача 1, задание 1.
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }
        // Задача 1, задание 2.
        double[] numbersD = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.println(numbersD[i]);
        }
        // Задача 1, задание 3.
        int[] numbersX = {4, 5, 6};
        for (int i = 0; i < 3; i++) {
            System.out.println(numbersX[i]);
        }
        System.out.println("");
        // Задача 2.
        int[] numbersQ = new int[3];
        numbersQ[0] = 1;
        numbersQ[1] = 2;
        numbersQ[2] = 3;
        for (int i = 0; i < numbersQ.length; i++) {
            if (i == numbersQ.length - 1) {
                System.out.println(numbersQ[i]);
            } else System.out.print(numbersQ[i] + ", ");
        }
        double[] numbersW = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbersW.length; i++) {
            if (i == numbersW.length - 1) {
                System.out.println(numbersW[i]);
            } else System.out.print(numbersW[i] + ", ");
        }
        int[] numbersE = {4, 5, 6};
        for (int i = 0; i < numbersE.length; i++) {
            if (i == numbersE.length - 1) {
                System.out.println(numbersE[i]);
            } else System.out.print(numbersE[i] + ", ");
        }

        // Задача 3.
        System.out.println("");

        int[] numbersR = new int[3];
        numbersR[0] = 1;
        numbersR[1] = 2;
        numbersR[2] = 3;
        for (int i = numbersR.length - 1; i >= 0; i--) {
            if (i == numbersR.length - 3) {
                System.out.println(numbersR[i]);
            } else System.out.print(numbersR[i] + ", ");
        }

        double[] numbersT = {1.57, 7.654, 9.986};
        for (int x = numbersT.length - 1; x >= 0; x--) {
            if (x == numbersT.length - 3) {
                System.out.println(numbersT[x]);
            } else System.out.print(numbersT[x] + ", ");
        }

        int[] numbersY = {4, 5, 6};
        for (int y = numbersY.length - 1; y >= 0; y--) {
            if (y == numbersY.length - 3) {
                System.out.println(numbersY[y]);
            } else System.out.print(numbersY[y] + ", ");
        }


        // Задача 4.
        System.out.println("");
        int[] numbersA = new int[3];
        numbersA[0] = 1;
        numbersA[1] = 2;
        numbersA[2] = 3;
        for (int c = 0; c < numbersA.length; c++) {
            if (numbersA[c] % 2==0) {
                System.out.println(numbersA[c]);
            } else  System.out.println(numbersA[c] +1);

        }

    }
}