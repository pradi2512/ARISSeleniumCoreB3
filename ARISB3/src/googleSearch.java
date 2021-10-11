import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Scanner myObj = new Scanner(System.in);
		System.out.println("\n\t *** Enter the text to be searched *** \t\n ");
		String setext = myObj.nextLine();
		driver.findElement(By.name("q")).sendKeys(setext);
		driver.findElement(By.xpath("//input[@value='Google Search' and  @name='btnK']")).click();
		

	}

}
