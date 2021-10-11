import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\AutomationDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		driver.findElement(By.id("food")).sendKeys("2000");
		driver.findElement(By.id("clothing")).sendKeys("3000");
		driver.findElement(By.id("shelter")).sendKeys("5000");
		driver.findElement(By.id("monthlyPay")).sendKeys("15000");
		driver.findElement(By.id("monthlyOther")).sendKeys("2000");
		String TME=driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		String TMI=driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		String UOB=driver.findElement(By.id("underOverBudget")).getAttribute("value");
		System.out.println("Your Total Monthly Expenses are " + TME);
		System.out.println("Your Total Monthly Income is " + TMI);
		System.out.println("Your Under/Over budget is " + UOB);
		driver.close();
	}

}
