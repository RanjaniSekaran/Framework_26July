package nykssite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class working {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumDay11\\Diver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
//List<WebElement> img = driver.findElements(By.tagName("img"));
//	int imgsize=img.size();
//	System.out.println(imgsize);
	WebElement fc = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
//	System.out.println(fc.getCssValue("font-size"));
//	System.out.println(fc.getCssValue("font-family"));
//	System.out.println(fc.getCssValue("color"));
//	System.out.println(fc.getCssValue("background-color"));
WebElement user=driver.findElement(By.id("username"));
	user.sendKeys("anupi");
	JavascriptExecutor je=(JavascriptExecutor)driver;
	je.executeScript("arguments[0].setAttribute('style','border=5px'", user);
	
//	WebElement pass=driver.findElement(By.id("password"));
//	Actions act= new Actions(driver);
//	act.keyDown(user,Keys.CONTROL);
//	act.sendKeys("ax");
//	//act.sendKeys("x");
//	act.keyUp(user, Keys.CONTROL);
//	act.perform();
//	
//	act.keyDown(pass, Keys.CONTROL).sendKeys("v");
//	act.keyUp(Keys.CONTROL);
//act.perform();
}}

