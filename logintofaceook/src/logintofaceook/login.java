package logintofaceook;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class login {
	
	
	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C://selinium1//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 
		 
		 driver.findElement(By.id("email")).sendKeys("0093788415504");
		 driver.findElement(By.id("pass")).sendKeys("424234");
		 driver.findElement(By.id("u_0_b")).click();
		 
		 driver.wait(100);
		    // driver.close();

	}

}
