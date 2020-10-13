package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	@FindBy(id="name")
	private WebElement nametb;
	
	@FindBy(id="submitWishlist")
	private WebElement savebtn;
	
	public WishlistPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void savenamewishlist(String name) {
		nametb.sendKeys(name);
		savebtn.click();
	}
}
