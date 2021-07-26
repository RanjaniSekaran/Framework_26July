package nykssite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class frontpage extends baseclass {
	public frontpage() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//a[text()='makeup']")
private WebElement makeup;
@FindBy(xpath="//a[text()='Eye Shadow']")
private WebElement eyeshadow;
public WebElement getMakeup() {
	return makeup;
}
public WebElement getEyeshadow() {
	return eyeshadow;
}
}
