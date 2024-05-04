
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

        WebDriver driver;

       public void launchBrowser(){

            System.setProperty("webdriver.chrome.driver",
                    "/Users/baongoc/Downloads/chromedriver-mac-arm64 3/chromedriver");
            driver= new ChromeDriver();
            driver.get("https://www.google.com");

        }


    public static void main(String[] args) {
            Main obj=new Main();
            obj.launchBrowser();

    }

}