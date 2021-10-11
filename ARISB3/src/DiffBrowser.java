import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DiffBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);
		System.out.println("\n\t *** Select the browser *** \t\n ");
		System.out.println("\n 1.Chrome \n 2. Edge" );
		System.out.println("Enter the Browser Name: ");
		int Browser = myObj.nextInt();
		
		switch(Browser) {
		case 1:
			System.setProperty("webdriver.chrome.driver", "D:\\AutomationDriver\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.google.com");
			String vTitle = driver.getTitle();
			System.out.println(vTitle);
			driver.close();
		
		break;
		case 2:
			
		System.setProperty("webdriver.edge.driver", "D:\\AutomationDriver\\edgedriver_win32\\msedgedriver.exe");
		WebDriver edriver = new EdgeDriver();
		edriver.get("http://www.google.com");
		String evTitle = edriver.getTitle();
		System.out.println(evTitle);
		edriver.close();
		break;
		default:
			System.out.println("Browser Not supported");
		}
		
	}

}
