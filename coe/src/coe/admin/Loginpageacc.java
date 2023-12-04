package coe.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Loginpageacc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin.pscollege841.examly.net");

		driver.findElement(By.id("emailAddress")).sendKeys("democollege@examly.in");
		driver.findElement(By.id("password")).sendKeys("examly@123");
	//	driver.manage().timeouts().implicitlyWait(5, null);
		driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div[2]/div[1]/div/div[2]/div/form/div[4]/button")).click();

	}
}
