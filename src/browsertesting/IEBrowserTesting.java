package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTesting {

    public static void main(String[] args) {

        String baseUrl1 = "https://demo.nopcommerce.com/demo";
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe" );
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize(); // maximize the window
        driver.get(baseUrl1);
        String title = driver.getTitle(); // get the page
        System.out.println("Main page " + title);


        driver.quit();

    }
}
