import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindow1 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\AutomationDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		System.out.println("The Current Title: "+driver.getTitle());
		driver.findElement(By.linkText("Help")).click();
		Set<String> pid=driver.getWindowHandles();
		Iterator<String> iid= pid.iterator();
		String Gparent=iid.next();
		String Gchild=iid.next();
		driver.switchTo().window(Gchild);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
