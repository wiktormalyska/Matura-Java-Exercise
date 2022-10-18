package instalingjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstalingJava {
    

    
     public static void main(String[] args) {
         String url = "https://instaling.pl/teacher.php?page=login";
         System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         try {
            driver.get(url);
            driver.quit();
         } catch (Exception e) {
             e.printStackTrace();
         }

         
     }
     
    
}
