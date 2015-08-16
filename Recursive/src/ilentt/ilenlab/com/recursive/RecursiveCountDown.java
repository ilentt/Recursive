package ilentt.ilenlab.com.recursive;

public class RecursiveCountDown {
	
	public RecursiveCountDown() {
		// constructor
	}
	
	public void CountDown(int n) {
		if(n<0)
			System.out.println("Action!...");
		else {
			System.out.println("N = "+n);
			CountDown(n-1);
		}
	}
	
	public void CountDownv2(int n) {
		for(int i =n; i>-1; i--) {
			System.out.println("N = "+i);
			if(i<1)
				System.out.println("Action!...");
		}
	}
	
	// BCLN(a,b) = a*b/UCNN(a,b)
	public int Euclids(int a, int b) {
		if(a>b)
			return Euclids(a-b,b);
		else if(b>a)
			return Euclids(a,b-a);
		else
			return a;
	}
	
	public int RecursiveFibo(int n) {
		if(n==0)
			return 0;
		if(n==1 || n==2)
			return 1;
		else
			return RecursiveFibo(n-2) + RecursiveFibo(n-1);
	}
	
	public void FiboNoIF(int n) {
		int a = 0;
		int b = 1;
		for(int i=1; i<=n; i++){
			a=a+b;
			b=a-b;
			System.out.print(a+" ");
		}
	}
	
	public void FiboGuru(int n) {
		int a = 0;
		int s=0;
		for(int i=1; s<n; i = a+(a=i)) {
			System.out.print(i + " ");
			s++;
		}
	}
	
	public void SwapNumber(int a, int b) {
		System.out.println("Before swap: a = " + a + " b = " + b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swap: a = " + a + " b = " + b);
	}
	
	// check perfect square
	public boolean PerfectQuare(int n) {
		int i = 1;
		boolean flag = false;
		while(i<n/2){
			if(i*i==n)
				flag = true;
			i++;
		}
		return flag;
	}
	
	// check perfect number
	public boolean PerfectNumber(int n) {
		boolean flag = false;
		int sum = 0;
		for(int i=1; i<n;i++) {
			if(n%i==0)
				sum+=i;
		}
		if(sum == n)
			flag = true;
		return flag;
	}
	
	// check prime number
	public boolean PrimeNumer(int n) {
		boolean flag = true;
		for(int i =2; i<=n/2; i++)
			if(n%i==0)
				flag = false;
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RecursiveCountDown r = new RecursiveCountDown();
		//r.CountDown(5);
		//r.CountDownv2(5);
		//System.out.println("Result: "+r.Euclids(15, 17));
		//r.RecursiveFibo(0);
		//r.FiboNoIF(10);
		//r.SwapNumber(5, 9);
		//r.FiboGuru(10);
		//r.FiboNoIF(10);
		/*
		int n = 0;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Enter a number ");
			n = s.nextInt();
		}while(n<2);
		for(int i=0; i<=n; i++) {
			System.out.print(r.RecursiveFibo(i) + " ");
		}
		*/
		int n = 13;
		System.out.println(n+" is a perfect number: "+r.PrimeNumer(n));
	}
}
