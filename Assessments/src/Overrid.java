import java.util.Scanner;

class Parent{
	void show(int p) {
		System.out.print(p+"");
	}
	void print(int q) {
		System.out.print(q+"");
	}
}
class Child extends Parent{
	@Override
	void show(int p) {
		System.out.print(p+"");
	}
	@Override
	void print(int q) {
		System.out.print(q*q+"");
		System.out.println();
	}
}
public class Overrid{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t--> 0) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			int r = sc.nextInt();
			int s = sc.nextInt();
			Parent parentobj = new Parent();
			parentobj.show(p);
			parentobj.print(q);
			Child childobj = new Child();
			childobj.show(r);
			childobj.print(s);
		}
		sc.close();
	}
}