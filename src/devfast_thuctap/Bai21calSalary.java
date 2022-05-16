package devfast_thuctap;

public class Bai21calSalary {
	public static void main(String[] args) {
		System.out.println(calSalary(1000, 2));
		System.out.println(calSalary1(1000, 2));
	}
	public static double calSalary(double salary,int n) {
		if(n==0)
			return salary;
		return calSalary(salary+salary*0.1, n-1);
	}
	public static double calSalary1(double salary,int n) {
		while(n>0) {
			salary+=salary*0.1;
			n--;
		}
		return salary;
	}
}
