import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationDriver\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // Load the website
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[text()='Click me!']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(4000);
        
        
        driver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("hjsdfksd");
        Thread.sleep(4000);
        driver.switchTo().alert().accept();
        Thread.sleep(4000);
        
        driver.close();
	}

}
