package asg5;
import  java.util.Scanner;
public class longestsub {
	public static void main(String[] args ){
		
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++){
			int n=sc.nextInt();
			arr[i]=n;
				}
		int count=0,result=-100;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]<arr[i+1]){
				count++;
			}
			else{
				if(count>result)
				result=count;
				count=0;
			}
		}
		
		System.out.print(count+1);
			}
}
