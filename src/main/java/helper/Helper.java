package helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Helper {
	WebDriver driver;

	public Helper(WebDriver driver) {
		this.driver = driver;
	}

	public void scrollDown(int from, int to) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+from+","+to+")", "");
	}
}
