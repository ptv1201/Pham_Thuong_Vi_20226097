package exercises;
	import java.util.Arrays;
	import java.util.Scanner;
	public class Array {
		
		    public static void main(String[] args) {
		       try( Scanner scanner = new Scanner(System.in)){
		        System.out.print("Nhập số lượng phần tử của mảng: ");
		        int n = scanner.nextInt();
		        double[] numbers = new double[n];
		        System.out.println("Nhập các phần tử của mảng:");
		        for (int i = 0; i < n; i++) {
		            numbers[i] = scanner.nextDouble();
		        }

		        // Sắp xếp mảng
		        Arrays.sort(numbers);

		        // Tính tổng và giá trị trung bình
		        double sum = 0;
		        for (double x : numbers) {
		            sum += x;
		        }
		        double average = sum / n;

		        // Hiển thị kết quả
		        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(numbers));
		        System.out.println("Tổng các phần tử của mảng: " + sum);
		        System.out.println("Giá trị trung bình của mảng: " + average);

		       }
		    }

}
