package logintofaceook;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createface {

	
	
	
	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C://selinium1//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.id("u_0_m")).sendKeys("osman");
		 
		 driver.findElement(By.id("u_0_o")).sendKeys("pardes");
		 
		 driver.findElement(By.id("u_0_r")).sendKeys("9307438895");
		 
		 driver.findElement(By.id("u_0_w")).sendKeys("pardes252");
		 Select select= new Select(driver.findElement(By.id("day")));
		 select.selectByVisibleText("12");
		 Select select1= new Select(driver.findElement(By.id("month")));
		 select1.selectByVisibleText("Jun");
		 Select select2= new Select(driver.findElement(By.id("year")));
		 select2.selectByVisibleText("1995");
		 
		 WebElement maleRadioBtn=driver.findElement(By.id("u_0_7"));
		 maleRadioBtn.click();
		 
		 driver.findElement(By.id("u_0_13")).click();
		 
		 driver.wait(100);
	    // driver.close();

}
}
