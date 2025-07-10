import java.lang.*;
import java.util.*;
public Hwl{
	public static void main(String args[]) {
		Scanner s=new scanner(System.in);
		int[] arr= {1,2,3,4,5};
		System.out.print("Method 1");
		System.out.print(arr[0]);
		System.out.print(arr[1]);
		System.out.print(arr[2]);
		System.out.print(arr[3]);
		System.out.print(arr[4]);
		System.out.print("Method 2");
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]);
		}
		System.out.print("Method 2");
		for(int num:arr) {
			System.out.println(num);
		}
		
	
}
