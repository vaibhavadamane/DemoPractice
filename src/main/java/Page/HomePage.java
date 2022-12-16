package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase

{

	//Object Repo.
	@FindBy(xpath="//input[@id='search']")private WebElement serchBox;
    @FindBy(xpath="//button[@aria-label='Search']")private WebElement serchButoon;
	@FindBy(xpath="//a[@title='Avatar: The Way of Water | Official Trailer']")private WebElement vedioLink;
	
	//constrctor
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	public boolean serach()
	{
		serchBox.sendKeys("avatar 2 trailer");
		serchButoon.click();
		return vedioLink.isDisplayed();
	}
}
