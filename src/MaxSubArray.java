import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class MaxSubArray {

	//private static int arrInp[];
	
	public static void main(String args[]){
		System.out.println("Enter the size of array");
		Scanner in = new Scanner(System.in);
		int arrSize = in.nextInt();
		
		int[] arrInp = new int[arrSize];
		System.out.println("Enter the sequence of numbers of which max subarray needs to be determined");
		//InputStreamReader isr = new InputStreamReader(System.in);
		
		
		
		//Scanner scan = new Scanner(isr);
		Scanner scan = new Scanner(System.in);
		int i=0;
		
		try{
			while(i < arrSize && scan.hasNextInt()){
				arrInp[i] = scan.nextInt();
				++i;
			}
		}
		
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Program will exit..");
			System.exit(1);
		}
		
		
		MaxSubArray obj1 = new MaxSubArray();
		int result = obj1.CalculateMaxSubArray(arrInp);
		
		System.out.println("The max sum of this array is "+result);
	}
	
	public int CalculateMaxSubArray(int[] inp){
		int max_so_far=0;
		int max_ending_here = 0;
		
		for (int i = 0; i < inp.length; i++) {
			max_ending_here = Math.max(0, max_ending_here + inp[i]);
			max_so_far = Math.max(max_so_far, max_ending_here);
		}
		//System.out.println("The value of var 1 is "+max_ending_here);
		return max_so_far;
	}
	
}
