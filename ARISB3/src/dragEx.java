import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragEx {
	
	public static String vText;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\AutomationDriver\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // Load the website
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(4000);
        driver.manage().window().maximize();
        System.out.println("It is navigated to: "+driver.getTitle());
        vText = driver.findElement(By.className("entry-title")).getText();
        System.out.println(vText);
        
        
        int frmsize = driver.findElements(By.tagName("iframe")).size();
        System.out.println(frmsize);
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        
        vText = driver.findElement(By.id("draggable")).getText();
        System.out.println(vText);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement dest = driver.findElement(By.id("droppable"));
        
        Actions act =new Actions(driver);
        act.dragAndDrop(source, dest).build().perform();
        
        driver.switchTo().defaultContent();
        vText= driver.findElement(By.className("entry-title")).getText();
        System.out.println(vText);
        Thread.sleep(4000);
        driver.close();
		
	}

}
