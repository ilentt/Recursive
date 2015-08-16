package ilentt.ilenlab.com.recursive;

import org.junit.Test;

public class RecursiveCountDownTest {
	
	@Test
	public void testMain() {
		RecursiveCountDown.main(new String[] {});
	}
	
	@Test
	public void testCountDown() {
		RecursiveCountDown r = new RecursiveCountDown();
		r.CountDown(5);
	}

	@Test
	public void testCountDownv2() {
		RecursiveCountDown r = new RecursiveCountDown();
		r.CountDownv2(5);
	}

	@Test
	public void testEuclids() {
		RecursiveCountDown r = new RecursiveCountDown();
		r.Euclids(5, 40);
		r.Euclids(50, 4);
	}

	@Test
	public void testRecursiveFibo() {
		RecursiveCountDown r = new RecursiveCountDown();
		r.RecursiveFibo(0);
		r.RecursiveFibo(10);
	}

	@Test
	public void testFiboNoIF() {
		RecursiveCountDown r = new RecursiveCountDown();
		r.FiboNoIF(10);
	}

	@Test
	public void testFiboGuru() {
		RecursiveCountDown r = new RecursiveCountDown();
		r.FiboGuru(10);
	}

	@Test
	public void testSwapNumber() {
		RecursiveCountDown r = new RecursiveCountDown();
		r.SwapNumber(9, 45);
	}

	@Test
	public void testPerfectQuare() {
		RecursiveCountDown r = new RecursiveCountDown();
		r.PerfectQuare(15);
		r.PerfectQuare(16);
	}

	@Test
	public void testPerfectNumber() {
		RecursiveCountDown r = new RecursiveCountDown();
		r.PerfectNumber(52);
		r.PerfectNumber(6);
	}

	@Test
	public void testPrimeNumer() {
		RecursiveCountDown r = new RecursiveCountDown();
		r.PrimeNumer(52);
	}

}
