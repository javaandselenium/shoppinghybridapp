package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EveningdressPage {
	@FindBy(id="layered_id_attribute_group_2")
	private WebElement sizecb;
	
	@FindBy(id="layered_id_attribute_group_24")
	private WebElement colorcb;
	
	@FindBy(xpath="//a[@title='Delivery']")
	private WebElement deliverybtn;
	
	public EveningdressPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void deliverybutton()
	{
		sizecb.click();
		colorcb.click();
		deliverybtn.click();
	}

}
