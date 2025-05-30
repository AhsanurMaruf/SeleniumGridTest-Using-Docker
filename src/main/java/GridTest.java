
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class GridTest {

    public static void main(String[] args) throws MalformedURLException {
        // 🔗 Selenium Hub URL
        String hubURL = "http://localhost:4444/wd/hub";

        // Run in Chrome
        runTest("chrome", hubURL);

        // Run in Firefox
        runTest("firefox", hubURL);

        // Run in Edge
        runTest("MicrosoftEdge", hubURL);
    }

    public static void runTest(String browser, String hubURL) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName(browser);

        WebDriver driver = new RemoteWebDriver(new URL(hubURL), caps);
        driver.get("https://www.google.com");

        System.out.println("Title on " + browser + ": " + driver.getTitle());

        driver.quit();
    }
}
