import java.util.Scanner;
public class Main{
    public static void main(String args[]){
    	
		Scanner in=new Scanner(System.in);
		int c=in.nextInt();
		int arr[]=new int[c];
		
		for(int i=0;i<c;i++) {
			int a=in.nextInt();
			int b=in.nextInt();
			arr[i]=a+b; //a와 b를 더하여 i번째 배열에 저장
		}
		
		for(int k:arr) {
			System.out.println(k);
		}
		
    }
}
