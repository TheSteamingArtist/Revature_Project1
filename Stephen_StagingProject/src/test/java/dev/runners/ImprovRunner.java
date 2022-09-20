package dev.runners;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.pages.CreateActivity;
import dev.pages.CreateCharacter;
import dev.pages.CreateSetting;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class ImprovRunner 
{
	
	public static WebDriver driver;
	
	public static CreateActivity createActivity;
	
	public static CreateCharacter createCharacter;
	
	public static CreateSetting createSetting;
	
	
	@BeforeAll
	public static void setup()
	{
		File chrome = new File("src/test/resources/chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		
		driver = new ChromeDriver();
		
		createActivity = new CreateActivity(driver);
		
		createCharacter = new CreateCharacter(driver);
		
		createSetting = new CreateSetting(driver);
	}
	
	@AfterAll
	public static void teardown()
	{
		driver.quit();
	}

}
