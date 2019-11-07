package amazom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class login {
	
	
	
	
	
	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C://selinium1//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1&prevRID=2NZJWYVHCR5RY6RJZHT1&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_"
		 		+ "id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fid"
		 		+ "entifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		 
		 
		 driver.findElement(By.id("ap_customer_name")).sendKeys("Mohammad");
		 
		 driver.findElement(By.id("ap_phone_number")).sendKeys("9307438895");
		 
		 
		 driver.findElement(By.id("ap_email")).sendKeys("tysc04.se@gmail.com");
		 
		 driver.findElement(By.id("ap_password")).sendKeys("pardes252");
		 
		 driver.findElement(By.id("continue")).click();
		 
		 
		 driver.wait(100);
		 
	}

}
