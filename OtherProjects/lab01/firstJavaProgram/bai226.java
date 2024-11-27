package firstJavaProgram;

	import java.util.Scanner;
	import java.lang.Math;
	public class bai226 {

		public static void main(String[] args) {
			try(Scanner input = new Scanner(System.in)) {	
				
				System.out.println("nhap he so phuong trinh bac nhat mot an");
				System.out.print("number a: ");
				double a = input.nextDouble();
				System.out.print("number b: ");
				double b = input.nextDouble();
				double x = -b/a;
				if(a!=0) System.out.print("nghiem cua "+a+"x + "+b+"=0 la: "+x);
				else System.out.print("error a=0 \n");
				
				System.out.println("\n nhap he so he phuong trinh bac nhat mot an");
				System.out.print("number a1: ");
				double a1 = input.nextDouble();
				System.out.print("number b1: ");
				double b1 = input.nextDouble();
				System.out.print("number c1: ");
				double c1 = input.nextDouble();
				System.out.print("number a2: ");
				double a2 = input.nextDouble();
				System.out.print("number b2: ");
				double b2 = input.nextDouble();
				System.out.print("number c2: ");
				double c2 = input.nextDouble();
				
				double aa=a1/a2;
				double bb=b1/b2;
				double cc=c1/c2;
				
				if(aa!=bb){
				b1 = a2*b1;
				b2 =a1*b2;
				c1 =a2*c1;
				c2 =a1*c2;
			    a1 = a1*a2;
			    a2 = a1;
			   
			    double x2 = (c1-c2)/(b1- b2);
				double x1 = (c1-x2*b1)/a1;   
				
				System.out.print("nghiem cua he phuong trinh \n"+ a1 +"x1"+b1+"x2="+c1+"\n"+a2+"x1"+b2+"x2="+c2+"\n là: x1= "+x1+" và x2= "+x2);
	}
				else if(aa==bb&&bb==cc)System.out.print("he vo so nghiem");
				else if (aa==bb && bb!=cc)System.out.print("he vo nghiem");
				
				System.out.println("\n nhap he so phuong trinh bac hai mot an");
				System.out.print("number a12: ");
				double a12 = input.nextDouble();
				System.out.print("number b12: ");
				double b12 = input.nextDouble();
				System.out.print("number c12: ");
				double c12 = input.nextDouble();
				System.out.print("phuong trinh bac 2 mot an: "+a12+"x^2 + "+b12+"x + "+c12+"=0");
				
				double deltaa = b12*b12 - 4*a12*c12;
				
				if(deltaa < 0) System.out.print("\n phuong trinh vo nghiem");
				else if(deltaa == 0) {
					double xx= -b12/(2*a12);
					System.out.print("\n phuong trinh co nghiem kep x= "+xx);
					}
				else {
				double CanDelta = (Math.sqrt(deltaa));
				double x12= (-b12+CanDelta)/(2*a12);
				double x22= (-b12-CanDelta)/(2*a12);
				System.out.print("\n phuong trinh co hai nghiem x1= "+x12+"va x2= "+x22);
				
				}
				
	}			
	}
	}
