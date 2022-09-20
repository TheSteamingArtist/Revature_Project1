package dev.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateActivity 
{
	private WebDriver driver;
	
	public CreateActivity(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id = "typeOfActivity")
	public WebElement typeOfActivityInput;
	
	@FindBy(id = "characterId")
	public WebElement characterIdInput;
	
	@FindBy(id = "createActivityButton")
	public WebElement create;
}
