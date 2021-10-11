import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.setProperty("webdriver.chrome.driver", "D:\\AutomationDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String vTitle = driver.getTitle();
		System.out.println(vTitle);
		driver.close();*/

		
		System.setProperty("webdriver.edge.driver", "D:\\AutomationDriver\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com");
		String vTitle = driver.getTitle();
		System.out.println(vTitle);
		driver.close();

	}

}
