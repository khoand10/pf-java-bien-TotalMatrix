import java.util.Scanner;

public class TotalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HeightWidth;
        System.out.println("Enter width and height :");
        HeightWidth = sc.nextInt();
        int[][] array1 = new int[HeightWidth][HeightWidth];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print("Enter element int row :" + (i + 1));
                array1[i][j] = sc.nextInt();
            }
            System.out.println("\n");
        }

        int[][] array2 = new int[HeightWidth][HeightWidth];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print("Enter element int row :" + (i + 1));
                array2[i][j] = sc.nextInt();
            }
            System.out.println("\n");
        }

        int[][] array3 = new int[HeightWidth][HeightWidth];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }
        for (int[] a : array3) {
            for (int b : a) {
                System.out.print(b);
            }
            System.out.print("\n");
        }
    }
}

