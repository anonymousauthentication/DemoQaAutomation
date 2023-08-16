package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public Properties prop;
	public FileInputStream files;
	public static WebDriver driver;

	public WebDriver driverInitialize() {
		System.out.println("drivver ini...");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("drivver ini");
		return driver;

	}

	public void getUrl(String urlget) throws IOException {
		String url = null;
		driver = driverInitialize();
		System.out.println("url");
		getGlobalProperty();
		if (urlget.contains("Element")) {
			url = prop.getProperty("weburlelement");
		}
		if (urlget.contains("Text")) {
			url = prop.getProperty("weburlText");
		}
		System.out.println("sd");
		driver.get(url);
	}

	public void launchBrowser(String url) throws IOException {
		getUrl(url);
	}

	public void getGlobalProperty() throws IOException {
		prop = new Properties();
		files = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\resource\\global.properties");
		prop.load(files);
	}
}
