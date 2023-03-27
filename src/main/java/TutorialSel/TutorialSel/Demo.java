package TutorialSel.TutorialSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args)
	
	{
	//	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\TutorialSel\\Drivers\\chromedriver.exe‪");
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	
		driver.findElement(By.xpath("//div[text()='First name']")).sendKeys("Siddeshwr");
	}

}
