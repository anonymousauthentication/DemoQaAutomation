package Element.Test;

import java.io.IOException;
import org.testng.annotations.Test;
import common.BaseTest;

public class ElementTest extends BaseTest {
	@Test
	public void elementTest() throws IOException {
		launchWebSite ee= new launchWebSite();
		ee.openBrowser("Element");
	}
}
