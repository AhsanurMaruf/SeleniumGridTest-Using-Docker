import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Rcms {

    public static void main(String[] args) throws Exception {
        String hubURL = "http://localhost:4444/wd/hub";

        DesiredCapabilities chromeCaps = new DesiredCapabilities();
        chromeCaps.setBrowserName("chrome");
        WebDriver chromeDriver = new RemoteWebDriver(new URL(hubURL), chromeCaps);

        DesiredCapabilities firefoxCaps = new DesiredCapabilities();
        firefoxCaps.setBrowserName("firefox");
        WebDriver firefoxDriver = new RemoteWebDriver(new URL(hubURL), firefoxCaps);

        DesiredCapabilities edgeCaps = new DesiredCapabilities();
        edgeCaps.setBrowserName("MicrosoftEdge");
        WebDriver edgeDriver = new RemoteWebDriver(new URL(hubURL), edgeCaps);

        loginRCMS(chromeDriver, "int_admin@rcms.gov.bd", "Secr3t");
        loginRCMS(firefoxDriver, "int_admin@rcms.gov.bd", "Secr3t");
        loginRCMS(edgeDriver, "int_admin@rcms.gov.bd", "Secr3t");

        chromeDriver.quit();
        firefoxDriver.quit();
        edgeDriver.quit();
    }

    public static void loginRCMS(WebDriver driver, String username, String password) throws InterruptedException {
        driver.get("https://beta.rcms.gov.bd/login/");
        Thread.sleep(2000);

        WebElement usernameInput = driver.findElement(By.xpath("//*[@id='userId']"));
        usernameInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id='loginPass']"));
        passwordInput.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//*[@id='loginForm']/div[4]/button"));
        loginButton.click();

        Thread.sleep(5000);

        System.out.println("Title on " + ((RemoteWebDriver) driver).getCapabilities().getBrowserName() + ": " + driver.getTitle());
    }
}
