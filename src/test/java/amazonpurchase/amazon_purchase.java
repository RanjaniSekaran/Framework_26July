package amazonpurchase;

import org.junit.BeforeClass;
import org.junit.Test;



public class amazon_purchase extends baseclass {
public static baseclass base;
@BeforeClass
public static void launch_amazon() {
	base= new baseclass();
	base.setpath();
	base.launchurl("https://www.amazon.in/");

}
@Test
public void Signin() {
	signin_page page1= new signin_page();
	base.mouseover(page1.getAccount());
	base.javascriptClick(page1.getSignin());
	base.waitimplicit();
	signin_page2 page2= new signin_page2();
	base.clear(page2.getMobno());
	base.send_value(page2.getMobno(), "7904809009");
	base.click(page2.getCotn_btn());
	base.send_value(page2.getPassword(), "jai250397");
	base.click(page2.getSignin_btn());
	base.waitimplicit();
	Product_visit page3= new Product_visit();
	base.javascriptscrollupdown("down", page3.getSummer_essentials());
	base.waitwebdriver(page3.getClick_summer_essentials());
	base.javascriptClick(page3.getClick_summer_essentials());
    base.screenshot("summer ess");
    base.driver.navigate().back();
    base.waitimplicit();
	base.javascriptscrollupdown("up", page3.getHome_decor());
	base.javascriptClick(page3.getHome_decor());
	base.waitimplicit();
	base.javascriptscrollupdown("down", page3.getLamb());
	base.javascriptClick(page3.getLamb());
	base.waitimplicit();
	base.javascriptClick(page3.getTable_lamp());
	base.waitimplicit();
	wishlist page4= new wishlist();
	base.javascriptscrollupdown("down", page4.getHim_lamp());
	base.javascriptClick(page4.getHim_lamp());
	base.javascriptClick(page4.getAdd_wishlist1());
	//base.javascriptClick(page4.getCreate_btn());
	base.driver.navigate().back();
	base.waitimplicit();
	base.javascriptClick(page4.getMoon_lamp());
	base.javascriptClick(page4.getAdd_wishlist2());
	base.javascriptClick(page4.getClose_btn());
	base.driver.navigate().back();
	base.waitimplicit();
	base.javascriptClick(page4.getCloth_lamp());
	base.javascriptClick(page4.getAdd_wishlist3());
	base.javascriptClick(page4.getView_cart());
	base.waitimplicit();
	cart_list page5=new cart_list();
	base.javascriptClick(page5.getAdd_cart1());
	base.javascriptClick(page5.getAdd_cart2());
	base.javascriptClick(page5.getAdd_cart3());
	base.waitimplicit();
	base.javascriptClick(page5.getView_cart());
	base.screenshot("cart");
	base.javascriptClick(page5.getCheck_out());
	base.screenshot("bill summary");

}

}
