package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(id="search_query_top")
	private WebElement serachtb;
	
	@FindBy(name="submit_search")
	private WebElement go;
	
	@FindBy(xpath="//span[.='My wishlists']")
	private WebElement wishlistbtn;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dresstab;
	
	@FindBy(xpath="(//a[@title='Evening Dresses'])[2]")
	private WebElement eveingDress;
	
	public WebElement getDresstab() {
		return dresstab;
	}
	

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void serachProduct(String product)
	{
		serachtb.sendKeys(product);
		go.click();
	}
	
	public void wishlistbutton()
	{
		wishlistbtn.click();
	}
	
	public void eveingDresstab()
	{
		eveingDress.click();
	}
	

}
