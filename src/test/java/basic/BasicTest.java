package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest {

	public static void main(String[] args) {
		System.out.println("---------- Testcase started..!!! ------------");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		
		System.out.println("---------- Testcase finished..!!! ------------");
	}

}
