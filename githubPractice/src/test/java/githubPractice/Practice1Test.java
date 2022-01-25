package githubPractice;

import org.testng.annotations.Test;

public class Practice1Test {
	@Test(groups = {"smoke"})
	public void demo1() {
		System.out.println("Hello World!");
	}
	
	@Test(groups = {"smoke"})
	public void demo11() {
		System.out.println("Hello World 11");
	}

}
