package amazonpurchase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signin_page2 extends baseclass {
	public signin_page2() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="ap_email")
	private WebElement mobno;
	@FindBy(id="continue")
	private WebElement cotn_btn;
	public WebElement getMobno() {
		return mobno;
	}
	public WebElement getCotn_btn() {
		return cotn_btn;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSignin_btn() {
		return signin_btn;
	}
	@FindBy(id="ap_password")
	private WebElement password;
	@FindBy(id="signInSubmit")
	private WebElement signin_btn;

}
