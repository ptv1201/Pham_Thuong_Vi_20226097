package exercises;
	import java.util.Scanner;
	public class Triangle {

		public static void main(String[] args) {
			try(Scanner input = new Scanner(System.in)) {	
				System.out.print("input n: ");
				int n = input.nextInt();  
				double deltaa = 1+8*n;
				double CanDelta = (Math.sqrt(deltaa));
				double x1= (-1+CanDelta)/2;
				double x2= (-1-CanDelta)/2;
				double d;
				if(x1==(int)x1||x2==(int)x2) {
					if(x1>0) d=x1;
					else d=x2;
					for (int i = 1; i <= d; i++) {
			            // In khoảng trắng trước các dấu *
			            for (int j = 1; j <= d - i; j++) {
			                System.out.print(" ");
			            }
			            // In các dấu *
			            for (int k = 1; k <= 2 * i - 1; k++) {
			                System.out.print("*");
			            }
			            // Xuống dòng sau khi hoàn thành mỗi dòng
			            System.out.println();
			        }
				}
				else System.out.print("input n sao cho n=(d+1)*d/2 voi d la int");
				
				 
	}
	}
	}

