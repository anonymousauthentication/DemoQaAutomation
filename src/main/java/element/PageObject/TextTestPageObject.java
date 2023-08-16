package element.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import helper.Helper;

public class TextTestPageObject extends Helper{
	WebDriver driver;

	public TextTestPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[id=\"userName\"]")
	WebElement FullName;

	@FindBy(css = "input[id=\"userEmail\"]")
	WebElement emailField;

	@FindBy(xpath = "//textarea[@id=\"currentAddress\"]")
	WebElement textArea;

	@FindBy(xpath = "//button[text()=\"Submit\"]")
	WebElement submitButton;

	public void formSubmit() {
		FullName.sendKeys("Manohar");
		emailField.sendKeys("manoharkantjoshi@gmail.com");
		textArea.sendKeys("Kunigad");
		submitButton.click();
	}
}
