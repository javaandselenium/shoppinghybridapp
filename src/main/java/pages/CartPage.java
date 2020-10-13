package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusbtn;
	
	@FindBy(id="group_1")
	private WebElement sizedd;

	
	
	public WebElement getSizedd() {
		return sizedd;
	}

	@FindBy(name="White")
	private WebElement color;
	
	@FindBy(xpath="//span[.='Add to cart']")
	private WebElement addtocart;

	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceedToCheckout;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void plusbtn()
	{
		plusbtn.click();
	}
	
	public void addingproductcart()
	{
		color.click();
		addtocart.click();
		proceedToCheckout.click();
	}
}
