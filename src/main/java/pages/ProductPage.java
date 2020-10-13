package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	@FindBy(xpath=("//select[@id=\"selectProductSort\"]"))
	 private WebElement sort;
	 
	 
	 public WebElement getSort() {
	  return sort;
	 }

	 @FindBy(xpath="(//a[@title=\"Printed Summer Dress\"])[2]")
	 private WebElement addtocart;
	 
	 public ProductPage(WebDriver driver)
	 {
	  PageFactory.initElements(driver, this);
	 }
	 
	 public void selectproduct()
	 {
	  
	  addtocart.click();
	 }
	 

}
