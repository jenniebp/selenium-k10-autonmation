package driver;

import org.apache.commons.exec.OS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
 public static WebDriver getChromeDriver() {
     String currentProjectLocation = System.getProperty("user.dir");
     String chromeDriverLocation = "";

     if (OS.isFamilyWindows()) {
         chromeDriverLocation = "/src/test/resources/drivers/chromedriver.exe";
     } else if (OS.isFamilyMac()) {
         chromeDriverLocation = "\\src\\test\\resources\\drivers\\chromedriver.exe";
     } else {
         throw new RuntimeException("[ERR] Couldn't detect the OS");
     }
     String chromeAbsoluteLocation = currentProjectLocation.concat(chromeDriverLocation);
     System.setProperty("webdriver.chrome.driver", chromeAbsoluteLocation);
     // Set up Chrome Options | Optional
     ChromeOptions chromeOptions = new ChromeOptions();
     chromeOptions.addArguments("--incognito");

    return new ChromeDriver(chromeOptions);

 }
}
