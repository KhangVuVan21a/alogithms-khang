package devfast_thuctap;

public class Bai22calMonth {
	public static void main(String[] args) {
		System.out.println(callMonth(1000,0.05));
		System.out.println(callMonth1(1000,0.05,0));
		
	}
	public static int callMonth(double money,double rate) {
		int month=0;
		double summoney=money;
		while(summoney<money*2) {
			summoney=summoney*(1+rate);
			month++;
		}
		return month;
	}
	public static int callMonth1(double money,double rate,int month) {
		int Month=month;
		double summoney=money;
		while(Month>0) {
			summoney=summoney*(1+rate);
			Month--;
		}
		if(summoney>=2*money) {
			return month;
		}
		else {
			return callMonth1(summoney, rate, month+1);
		}
	}
	
}
