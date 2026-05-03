package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicTest {

	@Test
	public void testCase01() {
		System.out.println("---------- Testcase started..!!! ------------");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");

		System.out.println("---------- Testcase finished..!!! ------------");
	}

}
