



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.seleniumemulation.WaitForPageToLoad;
import org.openqa.selenium.internal.seleniumemulation.WaitForPopup;

import com.thoughtworks.selenium.Wait;


public class testGoogleSearch  {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
    	System.setProperty("webdriver.chrome.driver", "C:/Users/nanophotometer/Documents/chromedriver_win32/chromedriver.exe");
    	System.out.println(System.getProperty("webdriver.chrome.driver"));
       // WebDriver driver = new HtmlUnitDriver();
        WebDriver driver = new ChromeDriver();

        // And now use this to visit Google
        driver.get("http://profectus/NanoSenchaTouch2.1.1%20(Sprint%2023,%20External)/index-debug.html?demo=On,client=Desktop");

        // Find the text input element by its name
        synchronized (driver)
        {
            driver.wait(10000);          
        }
        
        WebElement element = driver.findElement(By.id("ext-element-40"));

        // Enter something to search for
        element.click();
        synchronized (driver)
        {
            driver.wait(10000);
        }
        element = driver.findElement(By.id("ext-element-205"));
        element.click();
        synchronized (driver)
        {
            driver.wait(10000);
        }
        element = driver.findElement(By.id("ext-element-277"));
        element.click();
        synchronized (driver)
        {
            driver.wait(10000);
        }
        element = driver.findElement(By.xpath("//div[text()='dsDNA']"));
        element.click();
        Thread.sleep(1000);
        // Now submit the form. WebDriver will find the form for us from the element
       // element.submit();

        // Check the title of the page
        element = driver.findElement(By.xpath("//span[text()='Parameters']"));
        element.click();
        Thread.sleep(1000);
        element.click();
        Thread.sleep(1000);
        element = driver.findElement(By.xpath("//span[text()='Method']"));
        System.out.println(element.isDisplayed());
        Thread.sleep(1000);
        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }
}