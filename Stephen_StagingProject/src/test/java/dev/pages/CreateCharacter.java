package dev.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCharacter 
{
	private WebDriver driver;
	
	public CreateCharacter(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "firstN")
	private WebElement firstNameInput;
	
	@FindBy(id = "lastName")
	private WebElement lastNameInput;
	
	@FindBy(id = "characterType")
	private WebElement characterTypeInput;
	
	@FindBy(id = "characterSubmit")
	private WebElement characterSubmitButton;

}
