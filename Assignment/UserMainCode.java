import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserMainCode {
	public static boolean checkTripplets(int array[])
	{
		if(array.length<2)
		return false;
		else
		{
			for (int i = 2; i < array.length; i++) {
				if(array[i] == array[i-1] && array[i - 1] == array[i - 2]) {
					return true;
				}
			}
			return false;
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr= new  InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		int array[];
		System.out.println("please enter the limit");
		int x1=Integer.parseInt(br.readLine());
		array =new int[x1];

				for(int i=0;i<x1;i++) {
			
		System.out.println("please enter number");
		int x2=Integer.parseInt(br.readLine());
		array[i]=x2;
		}
		if(checkTripplets(array))
		System.out.println("have Triplets");
		else
			System.out.println("dont have triplets");
		
		
	}

}
