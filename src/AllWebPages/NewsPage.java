package AllWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsPage {
	@FindBy(linkText="News")
	private WebElement pNewsTab; //news tab on practice page
	

	public NewsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
