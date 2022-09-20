package dev.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateSetting 
{
	private WebDriver driver;
	
	public CreateSetting(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "settingLocation")
	private WebElement settingLocationInput;
	
	@FindBy(id = "characterId")
	private WebElement characterIdInput;
	
	@FindBy(id = "locationSubmit")
	private WebElement location;
	
	

}
