import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Arithemetic
 {
	 double num1;
	 double num2;
	 
	
	 public void  display()
	 {
		 System.out.println(num1);
		 System.out.println(num2);
		 
	 }
	 abstract double calculate();
	 Arithemetic(double num1,double num2)
	 {
		 super();
		 this.num1=num1;
		 this.num2=num2;
		 
	 }
	 
 }
 
 class Addition extends Arithemetic
 {
	

	Addition(double num1, double num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculate() {
		
		return this.num1+this.num2;
	}
	 
 }
 
 class subtract extends Arithemetic
 {
	 subtract(double num1, double num2) {
		super(num1, num2);
		
	}

	@Override
		double calculate() {
			
			return this.num1-this.num2;
		}
 }
 class multiply extends Arithemetic
 {
	 multiply(double num1, double num2) {
		super(num1, num2);
		
	}

	@Override
		double calculate() {
			
			return this.num1*this.num2;
		}
 }
 class divide extends Arithemetic
 {
	 divide(double num1, double num2) {
		super(num1, num2);
		
	}

	@Override
		double calculate() {
			
			return this.num1/this.num2;
		}
 }
public class Calculator {
	
	public static void main(String[] args) throws IOException{
		 double result=0;
		
		System.out.println("CALCULATOR");
		System.out.println("please entered 2 number");

		InputStreamReader isr= new  InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		double x1=Double.parseDouble(br.readLine());
		double x2=Double.parseDouble(br.readLine());
		
		System.out.println("please entered your choice::::"
				+ "  1-addition"
				+ "  2-subtraction"
				+ "  3-multiplication"
				+ "  4-division");
		int choice=Integer.parseInt(br.readLine());
		
		Arithemetic ar[]= {new Addition(x1,x2),new subtract(x1,x2),new multiply(x1,x2),new divide(x1,x2)};
		
				 result= ar[choice-1].calculate();
			
		

		System.out.println("result is: "+result);
	}

}
