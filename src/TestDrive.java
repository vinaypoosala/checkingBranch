import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDrive 
{

public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	driver.findElement(By.name("firstName")).sendKeys("vinay");
	driver.findElement(By.name("lastName")).sendKeys("poosala");
	Thread.sleep(2000);

//	driver.findElement(By.name("userName")).sendKeys("vinaykumarpoosala970126");
	Thread.sleep(2000);

	driver.findElement(By.name("Passwd")).sendKeys("poosala@123");
	Thread.sleep(2000);

	driver.findElement(By.id("accountDetailsNext")).click();
	//*[@id="confirm-passwd"]/div[1]/div/div[1]/input
	Thread.sleep(3000);
	WebElement err = driver.findElement(By.xpath("//*[@id='confirm-passwd']/div[2]/div[2]/div"));
	Thread.sleep(3000);

	System.out.println(err.getText());
	driver.findElement(By.linkText("Help")).click();
	

	
}

}
