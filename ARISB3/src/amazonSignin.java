import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonSignin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("The Current Title: "+driver.getTitle());
		
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Hello, Sign in"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.name("body")).click();
	}

}
