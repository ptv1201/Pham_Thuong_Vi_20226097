package exercises;
import java.util.Scanner;
	public class Matrix {
		    public static void main(String[] args) {
		        try(Scanner scanner = new Scanner(System.in)){

		        System.out.print("Nhập số hàng của ma trận: ");
		        int rows = scanner.nextInt();
		        System.out.print("Nhập số cột của ma trận: ");
		        int cols = scanner.nextInt();

		        int[][] matrix1 = new int[rows][cols];
		        int[][] matrix2 = new int[rows][cols];
		        int[][] result = new int[rows][cols];

		        System.out.println("Nhập các phần tử của ma trận thứ nhất:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print("Phần tử tại [" + i + "][" + j + "]: ");
		                matrix1[i][j] = scanner.nextInt();
		            }
		        }

		        System.out.println("Nhập các phần tử của ma trận thứ hai:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print("Phần tử tại [" + i + "][" + j + "]: ");
		                matrix2[i][j] = scanner.nextInt();
		            }
		        }

		        // Cộng hai ma trận
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                result[i][j] = matrix1[i][j] + matrix2[i][j];
		            }
		        }

		        System.out.println("Ma trận kết quả sau khi cộng hai ma trận:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print(result[i][j] + " ");
		            }
		            System.out.println(); // Xuống dòng sau khi in xong một hàng
		        }
		        }
		    }
}
