import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("The Current Title: "+driver.getTitle());
		
		int psize = driver.findElements(By.tagName("a")).size();
		System.out.println(psize);
		
		for ( int i =0 ; i<psize;i++) {
			String plink = driver.findElements(By.tagName("a")).get(i).getText();
			System.out.println(plink);
			if(plink == "Sign in");
			System.out.println(plink);
			break;
		}
		
		
		driver.close();
		
	}

}
