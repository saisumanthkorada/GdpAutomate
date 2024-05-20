package gdpTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTesting {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        

        driver.get("http://localhost:3000/");
        System.out.println("Test");

        String title = driver.getTitle();
        if (title.equalsIgnoreCase("Talent Hunt")) {
            System.out.println("Testcase1 : Passed");
        } else {
            System.out.println("Testcase1 : failed");
        }

        Thread.sleep(3000);
        driver.findElement(By.id("SignUp")).click();
        
        String url = "http://localhost:3000/signup";
        
        if(url.equalsIgnoreCase(driver.getCurrentUrl()))
        {
        	System.out.println("TestCase2 : Passed");
        }
        else
        {
        	System.out.println("TestCase2 : failed");
        }

        Thread.sleep(3000);
        driver.findElement(By.id("simple-tab-0")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("first")).sendKeys("dinesh");
        System.out.println("First name is written");
        Thread.sleep(3000);
        driver.findElement(By.id("last-name")).sendKeys("racharla");
        System.out.println("LastName has been written");
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("dineshdemo1@gmail.com");
        Thread.sleep(3000);
        String password = "Dinesh@23";
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.id("confirmPassword")).sendKeys(password);
        Thread.sleep(3000);
        System.out.println("Could able to access form : TestCase3 passed");
        driver.findElement(By.id("AspirantRegister")).click();
        
        Thread.sleep(1000);
        if(driver.getCurrentUrl().equalsIgnoreCase("http://localhost:3000/home"))
        {
        	System.out.println("Signup is successful : TestCase4 passed");
        }
        else
        {
        	System.out.println("Signup is not successful : TestCase4 failed " +"User already registered");
        }

        Thread.sleep(30000);
        driver.quit();
        
    }
}
