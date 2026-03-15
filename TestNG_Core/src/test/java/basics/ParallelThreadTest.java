package basics;

import org.testng.annotations.Test;

public class ParallelThreadTest {

	@Test
	public void test1() {
		System.out.println("Test-1 " +Thread.currentThread());
	}
	
	@Test
	public void test2() {
		System.out.println("Test-2 " +Thread.currentThread());
	}
	
	@Test
	public void test3() {
		System.out.println("Test-3 " +Thread.currentThread());
	}
}
