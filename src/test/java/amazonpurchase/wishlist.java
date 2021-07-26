package amazonpurchase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wishlist extends baseclass {
	public WebElement getHim_lamp() {
		return him_lamp;
	}
	public WebElement getAdd_wishlist1() {
		return add_wishlist1;
	}
	public WebElement getCreate_btn() {
		return create_btn;
	}
	public WebElement getMoon_lamp() {
		return moon_lamp;
	}
	public WebElement getAdd_wishlist2() {
		return add_wishlist2;
	}
	public WebElement getClose_btn() {
		return close_btn;
	}
	public WebElement getCloth_lamp() {
		return cloth_lamp;
	}
	public WebElement getAdd_wishlist3() {
		return add_wishlist3;
	}
	public WebElement getView_cart() {
		return view_cart;
	}
	public wishlist() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[contains(text(),'Himalayan Salt Lamp Pink Rock')] ")
private WebElement him_lamp;
	@FindBy(id="add-to-wishlist-button-submit")
	private WebElement add_wishlist1;
	@FindBy(xpath="//span[text()='Create List']")
	private WebElement create_btn;
			@FindBy(xpath="(//span[contains(text(),'XERGY Moon Lamps')])[1]")
			private WebElement moon_lamp ;
			@FindBy(id="add-to-wishlist-button-submit")
			private WebElement add_wishlist2;
			
			@FindBy(xpath="//button[@class=' a-button-close a-declarative']")
			private WebElement close_btn;
			@FindBy(xpath="//span[contains(text(),'Voroly Table Lamp With Shade')]")
			private WebElement cloth_lamp ;
			@FindBy(id="add-to-wishlist-button-submit")
			private WebElement add_wishlist3;
			//span[contains(text(),'View Wish List')]
			@FindBy(xpath="//span[contains(text(),'View Wish List')]")
			private WebElement view_cart ;


			
			
}
