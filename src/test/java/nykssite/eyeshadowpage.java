package nykssite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class eyeshadowpage extends baseclass {
	public eyeshadowpage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="//div[text()='Brand']"),@FindBy(xpath="(//div[@class='filter-sidebar__filter-title pull-left'])[1]")})
	private WebElement brand;
	@FindBy(name="search")
	private WebElement searchbox;
	@FindBy(xpath="//span[text()='Wet n Wild']")
	private WebElement wetnwild;
	
	@FindBy(xpath="//span[text()='Wet n Wild Eyeshadow And Eyeliner Combo Ii']")
	private WebElement movewishlist1;
	
	@FindBy(xpath="(//div[@class='listing_wishlist false'])[4]")
	private WebElement wishlist1;
	@FindBy(xpath="(//div[@class='listing_wishlist false'])[9]")
	private WebElement wishlist2;
	@FindBy(xpath="(//div[@class='listing_wishlist false'])[11]")
	private WebElement wishlist3;
	@FindBy(xpath="//a[text()='brands']")
	private WebElement nykabrand;
	public WebElement getNykabrand() {
		return nykabrand;
	}
	public WebElement getBrand() {
		return brand;
	}
	public WebElement getSearchbox() {
		return searchbox;
	}
	public WebElement getWetnwild() {
		return wetnwild;
	}
	public WebElement getWishlist1() {
		return wishlist1;
	}
	public WebElement getWishlist2() {
		return wishlist2;
	}
	public WebElement getWishlist3() {
		return wishlist3;
	}
	public WebElement getMovewishlist1() {
		return movewishlist1;
	}
@FindBy(xpath="//span[text()='Google']")
private WebElement google;
@FindBy(id="identifierId")
private WebElement gmail_entry;
@FindBy(xpath="//span[text()='Next']")
private WebElement nextbtn;
public WebElement getGoogle() {
	return google;
}
public WebElement getGmail_entry() {
	return gmail_entry;
}
public WebElement getNextbtn() {
	return nextbtn;
}
}
