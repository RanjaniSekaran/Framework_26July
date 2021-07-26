package amazonpurchase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_visit extends baseclass {
	public Product_visit() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//h2[text()='Trending this summer | Amazon Brands & more']")
private WebElement summer_essentials;

@FindBy(linkText="Visit the summer store")
private WebElement click_summer_essentials;

@FindBy(linkText="Explore all")
private WebElement Home_decor;

@FindBy(xpath="//img[@alt='Candles']")
private WebElement lamb;

public WebElement getSummer_essentials() {
	return summer_essentials;
}

public WebElement getClick_summer_essentials() {
	return click_summer_essentials;
}

public WebElement getHome_decor() {
	return Home_decor;
}

public WebElement getLamb() {
	return lamb;
}

public WebElement getTable_lamp() {
	return table_lamp;
}

@FindBy(xpath="//img[@alt='Table lamps']")
private WebElement table_lamp;
}
