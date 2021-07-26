package nykssite;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlink {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumDay11\\Diver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> img = driver.findElements(By.tagName("img"));
		for (int i = 0; i < 10; i++) {
			String attribute = img.get(i).getAttribute("src");
			System.out.println(attribute);
			if(!attribute.isEmpty()) {
				URL url= new URL(attribute);
				HttpURLConnection ht=(HttpURLConnection)url.openConnection();
				int code=ht.getResponseCode();
				if(code==200) {
					System.out.println(attribute);
				}else {
					System.out.println("broken"+i);
				}
			}
		}
//		URL url = new URL("http://adactinhotelapp.com/");
//		HttpURLConnection http=(HttpURLConnection)url.openConnection();
//		int responseCode = http.getResponseCode();
//		System.out.println(responseCode);
//		String message = http.getResponseMessage();
//		System.out.println(message);
		
}}
