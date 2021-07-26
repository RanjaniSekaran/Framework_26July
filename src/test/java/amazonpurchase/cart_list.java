package amazonpurchase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart_list extends baseclass {
	public cart_list() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getAdd_cart1() {
		return add_cart1;
	}

	public WebElement getAdd_cart2() {
		return add_cart2;
	}

	public WebElement getAdd_cart3() {
		return add_cart3;
	}

	public WebElement getView_cart() {
		return view_cart;
	}

	public WebElement getCheck_out() {
		return check_out;
	}

	@FindBy(xpath="(//a[contains(text(),'Add to Cart')])[1]")
	private WebElement add_cart1;
	@FindBy(xpath="(//a[contains(text(),'Add to Cart')])[2]")
	private WebElement add_cart2;
	@FindBy(xpath="(//a[contains(text(),'Add to Cart')])[3]")
	private WebElement add_cart3;
	
	@FindBy(xpath="(//a[contains(text(),'View Cart')])[1]")
	private WebElement view_cart;
	
	@FindBy(name="proceedToRetailCheckout")
	private WebElement check_out;
}
