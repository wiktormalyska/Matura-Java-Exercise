package stormgain.autoclicker;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class StormgainAutoclicker {


    public static long wczytajcoilegodzin(){
        Scanner s=new Scanner(System.in);
        long liczbagodzin=0;
        System.out.print("Wpisz liczbę godzin co ile ma klikać: ");
        liczbagodzin=s.nextLong();
        return liczbagodzin;
    }
    
    public static void logowanie(String email, String password){
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/form/div[1]")).sendKeys(email);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/form/div[2]/input")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[2]/form/div[6]/input")).click();
        
    }
    
    public static void main(String[] args) throws InterruptedException {
        Scanner s=new Scanner(System.in);
        System.out.print("Wpisz swój email do logowania: ");
        String email=s.next();
        System.out.println("Wpisz swoje hasło do logowania: ");
        String password=s.next();
        System.out.println("Kliknę co: "+wczytajcoilegodzin());
        for (int i = 0; i <6 ; i++) {

            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://app.stormgain.com/crypto-miner/");
            logowanie(email, password);
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div/div[4]/div/button/div/div[1]")).click();
            Thread.sleep(wczytajcoilegodzin()*3600000);
        }

        
    }
    
}
