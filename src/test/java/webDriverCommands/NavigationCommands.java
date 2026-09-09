package webDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommands {

    WebDriver driver;

    @Test(priority = 0)
    public void NavigateDemo() {

        driver = new ChromeDriver();

        driver.get("https://www.google.co.in");

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        String Title = driver.getTitle();
        System.out.println(Title);

        driver.quit();
    }

    @Test(priority = 1)
    public void NavigateBackDemo() throws Exception {

        driver = new ChromeDriver();

        driver.navigate().to("https://www.google.co.in");

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        String Title = driver.getTitle();
        System.out.println(Title);

        driver.navigate().to("https://login.yahoo.com/");

        URL = driver.getCurrentUrl();
        System.out.println(URL);

        Thread.sleep(5000);

        driver.navigate().back();

        URL = driver.getCurrentUrl();
        System.out.println(URL);

        String BrowserTitle = driver.getTitle();
        System.out.println("Browser Title is: " + BrowserTitle);

        driver.quit();
    }
    
    @Test(priority=3)



    public void NavigateForword() throws Exception {
    driver = new ChromeDriver(); 
    driver.get("https://www.google.co.in"); 
    String URL = driver.getCurrentUrl(); 
    System.out.println(URL); 
    String Title = driver.getTitle(); 
    System.out.println(Title);

    driver.navigate().to("https://login.yahoo.com/"); 
    URL = driver.getCurrentUrl();

    System.out.println(URL);
    Thread.sleep(5000);

    driver.navigate().back(); 
    URL = driver.getCurrentUrl(); 
    System.out.println(URL);
    Thread.sleep(5000);

    driver.navigate(). forward(); 
    URL = driver.getCurrentUrl(); 
    System.out.println(URL);
    	
    }
}