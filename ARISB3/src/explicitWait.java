import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


	

	

		
public class explicitWait {
	
	public static String vText;
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationDriver\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver,20);
        // Load the website
        driver.get("https://www.mortgagecalculator.org/");
        driver.manage().window().maximize();
        driver.findElement(By.id("homeval")).sendKeys("5000");
        driver.findElement(By.name("param[downpayment]")).sendKeys("300");
        driver.findElement(By.name("param[downpayment_type]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("intrstsrate")));
        driver.findElement(By.id("intrstsrate")).sendKeys("5.5");
        driver.findElement(By.name("calculateWRONG")).click();
        driver.close();

	}

}
