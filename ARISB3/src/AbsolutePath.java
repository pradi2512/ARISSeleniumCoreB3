import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsolutePath 
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		
		System.out.println("It is navigated to: "+driver.getTitle());
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("prad");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("6789");
		driver.findElement(By.xpath("//input[@id='password-visibility-toggle' and @class='button__password-visibility']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		System.out.println("It have navigate to "+driver.getTitle());
		driver.findElement(By.name("userName")).sendKeys("prad@ab.com");
		driver.findElement(By.linkText("Join now")).click();
		System.out.println("It have navigate to "+driver.getTitle());
		
		driver.navigate().to("https://www.amazon.in");
		driver.findElement(By.xpath("//div[@id='nav-main']/div[2]/div/div/a[1]")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
