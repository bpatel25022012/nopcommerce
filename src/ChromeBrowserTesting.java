import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTesting {

    public static void main(String[] args) { // do it by heart
        // to open the url with

        String baseUrl= "https://demo.nopcommerce.com/demo";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();// to maximize the windows
        driver.get(baseUrl);
        String title = driver.getTitle(); // get the page
        System.out.println("Main page " + title);


        driver.quit();

    }
}
