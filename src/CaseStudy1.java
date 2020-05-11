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


public class CaseStudy1 
{
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://freeformatter.com/epoch-timestamp-to-date-converter.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Stop")).click();
		Thread.sleep(3000);

		String title = driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("Free Online Epoch And Unix Timestamp Converter - FreeFormatter.com"))
		{
			System.out.println("matched");
		}
		Thread.sleep(3000);
		driver.findElement(By.id("year")).clear();
		driver.findElement(By.id("year")).sendKeys("2019");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("05 - May");
		Select date = new Select(driver.findElement(By.id("date")));
		date.selectByVisibleText("12");
		Select hours= new Select(driver.findElement(By.id("hours")));
		hours.selectByVisibleText("15");
		Select minutes= new Select(driver.findElement(By.id("minutes")));
		minutes.selectByVisibleText("49");
		Select seconds= new Select(driver.findElement(By.id("seconds")));
		seconds.selectByVisibleText("50");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[4]/table/tbody/tr/td[8]/a")).click();
		Thread.sleep(3000);
		WebElement timeStamp = driver.findElement(By.id("resultEpoch"));
		System.out.println(timeStamp.getText());
		 TakesScreenshot scrShot =((TakesScreenshot)driver);

	        //Call getScreenshotAs method to create image file
		 	//Move image file to new destination
         	//Copy file at destination
		 
		 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);


         File DestFile=new File("C:\\Users\\vinay\\test.png");

        
         FileHandler.copy(SrcFile,DestFile);
         
         System.out.println("screenshot taken");
         
         Thread.sleep(3000);
         driver.navigate().to("https://freeformatter.com/qr-code-generator.html");
         Thread.sleep(30000);
         driver.findElement(By.className("name")).sendKeys("vinay");
         
         driver.findElement(By.className("company")).sendKeys("tcs");
         driver.findElement(By.className("occupation")).sendKeys("Trainee-Software");
         driver.findElement(By.className("telephone")).sendKeys("8074406494");
         driver.findElement(By.className("email")).sendKeys("vinay@gmail.com");
         driver.findElement(By.className("address")).sendKeys("hyderabad");
         driver.findElement(By.className("website-url")).sendKeys("www.google.com");
         driver.findElement(By.className("note")).sendKeys("something is fishy");
         driver.findElement(By.id("generateButton")).click();
         Thread.sleep(10000);
         
         TakesScreenshot tk = (TakesScreenshot) driver;
         File sr = tk.getScreenshotAs(OutputType.FILE);
         File Qrfile=new File("C:\\Users\\vinay\\QR.png");
         FileHandler.copy(sr, Qrfile);
         System.out.println("qr Code taken Screen shot");
         driver.close();
		
	}

}
