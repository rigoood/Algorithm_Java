import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int b1 = B % 10;
		int b2 = B / 10 % 10;
		int b3 = B / 100 % 10;
		System.out.println(A*b1);
		System.out.println(A*b2);
		System.out.println(A*b3);
		System.out.println(A*B);
	}
}
