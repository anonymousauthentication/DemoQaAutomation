package Element.Test;

import java.io.IOException;
import org.testng.annotations.Test;
import common.BaseTest;

public class launchWebSite extends BaseTest {
	@Test(groups = "BrowserLaunch")
	public void openBrowser(String urlIdentity) throws IOException {
		launchBrowser(urlIdentity);
	}
}
