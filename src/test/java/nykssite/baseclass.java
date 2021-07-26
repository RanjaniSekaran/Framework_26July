package nykssite;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseclass {
public static WebDriver driver;
public void setpath() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\nykssite\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
}
public void launchurl(String url) {
	driver.get(url);
	driver.manage().window().maximize();
}

public void send_value(WebElement element,String text) {
try {
	element.sendKeys(text);
	
} catch (Exception e) {
	System.out.println("sendkey exp");
}

}
public void waitimplicit() {
try {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
} catch (Exception e) {
	System.out.println("wait exp");
}

}

public void waitwebdriver(WebElement element) {
	try {
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
	} catch (Exception e) {
		System.out.println(" webdriverwait exp");
	}

}
public void handlepopups(String text) {
	try {
		Alert alert=driver.switchTo().alert();
		if (text.equalsIgnoreCase("yes")||text.equalsIgnoreCase("Ok")) {
			alert.accept();
		}else if (text.equalsIgnoreCase("no")||text.equalsIgnoreCase("cancel")) {
			alert.dismiss();
		}
	} catch (Exception e) {
		System.out.println("popout exp");
	}

}
public void mouseover(WebElement element) {
	try {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	} catch (Exception e) {
		System.out.println("mouse over exp"+e);
	}

}

public void click(WebElement element) {
	try {
		element.click();
	} catch (Exception e) {
		System.out.println("click exp");
	}

}
public void javascriptAttribute(String text,WebElement element,String value) {
	try {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		if(text.equalsIgnoreCase("set")) {
		js.executeScript("arguments[0].setAttribute('value',' "+value+" ')", element);
		}
	} catch (Exception e) {
		System.out.println("Scroll up  down exp/"+e);
	}

}
public void javascriptscrollupdown(String text,WebElement element) {
	try {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		if(text.equalsIgnoreCase("down")) {
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		}else if (text.equalsIgnoreCase("up")) {
			js.executeScript("arguments[0].scrollIntoView(false)", element);
		}
	} catch (Exception e) {
		System.out.println("Scroll up  down exp/");
	}

}
public void javascriptClick(WebElement element) {
	try {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	} catch (Exception e) {
		System.out.println(e);
	}

}
public void windowshift() {
	try {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list= new LinkedList<>(windowHandles);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		driver.switchTo().window(list.get(1));
	} catch (Exception e) {
		System.out.println("Windowshift exp");
	}

}
public String attributereturn(WebElement element) {
	String attribute=null;
	try {
		attribute=element.getAttribute("value");
	} catch (Exception e) {
		System.out.println("attribute exp");
	}
return attribute;
}

public String textreturn(WebElement element) {
	String text=null;
	try {
		text=element.getText();
	} catch (Exception e) {
		System.out.println("text exp");
	}
return text;
}
public void doubleclick(WebElement Element) {
	try {
		Actions action= new Actions(driver);
		action.doubleClick().perform();
	} catch (Exception e) {
		System.out.println("doubleclick exp");
	}

}
}
