import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

//comment
//comment added

//c2nd coment added

//3rd comment added
public class BmiCalculator 
{
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String l = "https://www.calculator.net/";
		driver.get(l);
		System.out.println("djbdjbhjhjb");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("BMI Calculator")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("cage")).clear();
		driver.findElement(By.id("cage")).sendKeys("30");
		driver.findElement(By.id("cheightmeter")).clear();;

		driver.findElement(By.id("cheightmeter")).sendKeys("175");
		driver.findElement(By.id("ckg")).clear();

		driver.findElement(By.id("ckg")).sendKeys("70");
		driver.findElement(By.xpath("//*[@id='content']/div[4]/div[2]/table/tbody/tr/td/table[4]/tbody/tr/td/input[2]")).click();
		Thread.sleep(3000);

		TakesScreenshot tr = (TakesScreenshot) driver;
		File sr = tr.getScreenshotAs(OutputType.FILE);
		File cp = new File("C:\\Users\\vinay\\BMI.png");
		FileHandler.copy(sr, cp);
		
		System.out.println("BMI screen SHot has been saved ");
		
		
		driver.findElement(By.xpath("//*[@id='breadcrumbs']/span[1]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Calorie Calculator")).click();
		Thread.sleep(2000);
		Select in = new Select(driver.findElement(By.id("cineunit")));
		in.selectByVisibleText("Kilojoules [kJ]");
		Select out = new Select(driver.findElement(By.id("couteunit")));
		out.selectByVisibleText("calorie [cal]");
		//*[@id="content"]/table[1]/tbody/tr/td/table/tbody/tr[2]/td/input[2]
		driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr/td/table/tbody/tr[2]/td/input[2]")).click();
		Thread.sleep(2000);

		TakesScreenshot kV = (TakesScreenshot) driver;
		File sr1 = kV.getScreenshotAs(OutputType.FILE);
		File c = new File("C:\\Users\\vinay\\Fenergy.png");
		FileHandler.copy(sr1,c);
		System.out.println("Food Handler screenSHot taken");
		Thread.sleep(3000);
		WebElement t = driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr/td/table/tbody/tr[1]/td[4]/font/b"));
		//*[@id="content"]/table[1]/tbody/tr/td/table/tbody/tr[1]/td[4]/font/b
		System.out.println(t.getText());
		driver.quit();
				

	}

}
