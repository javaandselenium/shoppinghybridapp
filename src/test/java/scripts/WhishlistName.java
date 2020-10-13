package scripts;

import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Propertyfile;
import pages.HomePage;
import pages.LoginPage;
import pages.WishlistPage;

public class WhishlistName extends BaseTest {
	@Test
	public void test2()
	{
		LoginPage l=new LoginPage(driver);
		l.logincredentials(Propertyfile.getpropertyfiledata("email"),Propertyfile.getpropertyfiledata("password"));
		HomePage h=new HomePage(driver);
		h.wishlistbutton();
		WishlistPage w=new WishlistPage(driver);
		w.savenamewishlist(Propertyfile.getpropertyfiledata("name"));
		
		
		
	}

}
