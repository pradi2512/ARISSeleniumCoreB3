import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		driver.findElement(By.id("homeval")).sendKeys("5000");
		driver.findElement(By.name("param[downpayment]")).sendKeys("300");
		driver.findElement(By.name("param[downpayment_type]")).click();
		driver.findElement(By.id("intrstsrate")).sendKeys("5.5");
		driver.findElement(By.name("cal")).click();
		String vpay = driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[3]/div[1]/h3")).getText();
		System.out.println(vpay);
		driver.close();
				}

}
