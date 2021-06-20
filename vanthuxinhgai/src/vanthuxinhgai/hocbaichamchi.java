package vanthuxinhgai;

import java.util.Scanner;

public class hocbaichamchi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//khai bao mang
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
        int [] arr = new int[size];
        //nhap mang
        for (int i=0; i < arr.length ; i++) {
        	System.out.print("Enter a["+i+"] :");
        	arr[i]=sc.nextInt();
        }       
        //in mang
        System.out.print("Array: ");
        for (int i=0; i < arr.length ; i++) {
        	System.out.print(arr[i]+" ");
        }
        // tinh trung cong cua mang
        int sum = 0;
        double avg;
        for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}      
        avg= sum/arr.length;
        System.out.println("trung binh cong cua mang la:"+avg);
	}
}
