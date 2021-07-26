package amazonpurchase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signin_page extends baseclass {
public WebElement getAccount() {
		return account;
	}

	public WebElement getSignin() {
		return signin;
	}

@FindAll({@FindBy(id="nav-link-accountList-nav-line-1"),@FindBy(xpath="//span[text()='Account & Lists']")})
private WebElement account;

@FindBy(xpath="(//span[text()='Sign in'])[1]")
private WebElement signin;
public signin_page() {
	PageFactory.initElements(driver, this);
}

	
}
