package nykssite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class brand_page extends baseclass{
	public brand_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='On Huda Beauty Favourites!']")
private WebElement hudabeuty;
	@FindBy(xpath="(//span[text()='4'])[4]")
	private WebElement page4;
	@FindBy(xpath="(//div[@class='listing_wishlist false'])[5]")
	private WebElement blushbrush;
	@FindBy(xpath="//a[text()='categories']")
	private WebElement category;
	@FindBy(xpath="//a[text()='Gucci']")
	private WebElement gucci;
	public WebElement getGucci() {
		return gucci;
	}
	public WebElement getCategory() {
		return category;
	}
	public WebElement getFragrance() {
		return fragrance;
	}
	@FindBy(xpath="//a[text()='fragrance']")
	private WebElement fragrance;
	
	public WebElement getHudabeuty() {
		return hudabeuty;
	}
	public WebElement getPage4() {
		return page4;
	}
	public WebElement getBlushbrush() {
		return blushbrush;
	}
}
