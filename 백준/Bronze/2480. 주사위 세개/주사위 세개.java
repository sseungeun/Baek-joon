import java.util.Scanner;
public class Main{
    public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int B=in.nextInt();
		int C=in.nextInt();
		
		if(A!=B&&B!=C&A!=C) {
			int max=Math.max(A,Math.max(B, C));
			System.out.println(max*100);
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