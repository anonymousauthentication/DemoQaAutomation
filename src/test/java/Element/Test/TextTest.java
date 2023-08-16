package Element.Test;

import java.io.IOException;
import org.testng.annotations.Test;
import common.BaseTest;
import element.PageObject.TextTestPageObject;

public class TextTest extends BaseTest {
	@Test
		public void textTest() throws IOException {
			launchWebSite ee= new launchWebSite();
			ee.openBrowser("Text");
			TextTestPageObject textTest = new TextTestPageObject(BaseTest.driver);
			textTest.formSubmit();
		}
}
