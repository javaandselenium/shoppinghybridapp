package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//a[@class='login']")
	private WebElement signinButton;
	
	@FindBy(id="email")
	private WebElement emailaddressTb;
	
	@FindBy(id="passwd")
	private WebElement passwordTb;
	
	@FindBy(id="SubmitLogin")
	private WebElement sumbitButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void logincredentials(String email,String password)
	{
		signinButton.click();
		emailaddressTb.sendKeys(email);
		passwordTb.sendKeys(password);
		sumbitButton.click();
	}

}
