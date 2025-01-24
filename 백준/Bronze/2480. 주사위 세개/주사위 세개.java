import java.util.Scanner;
public class Main{
    public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int B=in.nextInt();
		int C=in.nextInt();
		
		if(A!=B&&B!=C&A!=C) {
			int sum;
			if(A>B) {
				if(C>A) {
					sum=C;
				}
				else {
					sum=A;
				}
		}
			else {
				if(C>B) {
					sum=C;
				}
				else {
					sum=B;
				}
			}
			System.out.println(sum*100);
		}
		else {
			if(A==B&&A==C) {
				System.out.println(A*1000+10000);
			}
			else {
				if(A==B||A==C) {
				System.out.println(1000+A*100);
				}
				else {
				System.out.println(1000+B*100);
				}
			}
		}
    }
}