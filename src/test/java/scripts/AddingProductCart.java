package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generlib.BaseTest;
import generlib.Propertyfile;
import generlib.Utilies;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class AddingProductCart extends BaseTest {
@Test

	public void addingtocart()
	{
	LoginPage l=new LoginPage(driver);
	l.logincredentials(Propertyfile.getpropertyfiledata("email"),Propertyfile.getpropertyfiledata("password"));
	HomePage h=new HomePage(driver);
	h.serachProduct(Propertyfile.getpropertyfiledata("productname"));
	ProductPage p=new ProductPage(driver);
	Utilies.dropdown(p.getSort(),Propertyfile.getpropertyfiledata("productsort"));
	p.selectproduct();
	CartPage c=new CartPage(driver);
	c.plusbtn();
	Utilies.dropdown(c.getSizedd(),Propertyfile.getpropertyfiledata("size"));
	c.addingproductcart();
	Assert.assertEquals(driver.getTitle(),Propertyfile.getpropertyfiledata("proceedtocheckout"));
	
}
	
	
	
	
	
	
}
