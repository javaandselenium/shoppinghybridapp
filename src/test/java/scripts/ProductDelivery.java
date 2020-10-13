package scripts;

import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Propertyfile;
import generlib.Utilies;
import pages.EveningdressPage;
import pages.HomePage;
import pages.LoginPage;

public class ProductDelivery extends BaseTest{
	@Test
	public void test3()
	{
		LoginPage l=new LoginPage(driver);
		l.logincredentials(Propertyfile.getpropertyfiledata("email"),Propertyfile.getpropertyfiledata("password"));
		HomePage h=new HomePage(driver);
		Utilies.mousehover(driver,h.getDresstab());
		h.eveingDresstab();
		EveningdressPage e=new EveningdressPage(driver);
		e.deliverybutton();
		
	}

}
