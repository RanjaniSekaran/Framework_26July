package nykssite;

import org.junit.BeforeClass;
import org.junit.Test;

public class nykaaccess {
	public static baseclass base;
	@BeforeClass
	public static void launch_browser() {
		base=new baseclass();
		base.setpath();
		base.launchurl("https://www.nykaa.com/");
	}
	@Test
	public void purchase() {
		//page -1
		frontpage page1= new frontpage();
		base.mouseover(page1.getMakeup());
		base.mouseover(page1.getEyeshadow());
		base.click(page1.getEyeshadow());
		base.waitimplicit();
		//page2
		eyeshadowpage page2= new eyeshadowpage();
		base.windowshift();
		base.javascriptscrollupdown("down",page2.getBrand());
		base.waitwebdriver(page2.getBrand());
		base.click(page2.getBrand());
		base.send_value(page2.getSearchbox(), "Wet n Wild");
		base.click(page2.getWetnwild());
		base.waitimplicit();
		base.mouseover(page2.getMovewishlist1());
		base.mouseover(page2.getWishlist1());
		base.javascriptClick(page2.getWishlist1());
		base.javascriptClick(page2.getGoogle());
	//	base.driver.navigate().back();
		base.waitimplicit();
		base.javascriptAttribute("set", page2.getGmail_entry(),"jayaranjani45@gmail.com");
		base.javascriptClick(page2.getNextbtn());
		//base.mouseover(page2.getWishlist2());
//		base.waitimplicit();
//		base.click(page2.getWishlist2());
//		base.mouseover(page2.getWishlist3());
//		base.click(page2.getWishlist3());
	}

}
