package gdpTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTesting2 {

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
        driver.findElement(By.id("simple-tab-2")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("first")).sendKeys("sumanth");
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys("korada");
        Thread.sleep(1000);
        driver.findElement(By.id("organization-name")).sendKeys("NorthWest");
        Thread.sleep(1000);
        driver.findElement(By.id("userName")).sendKeys("summu_9945");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("sumanth9945@gmail.com");
        Thread.sleep(1000);
        String pass = "Summu@23";
        driver.findElement(By.id("password")).sendKeys(pass);
        Thread.sleep(1000);
        driver.findElement(By.id("confirmPassword")).sendKeys(pass);
        Thread.sleep(1000);
        driver.findElement(By.id("role")).sendKeys("recruiter");
        Thread.sleep(1000);
        System.out.println("Testcase 3 : passed" );
        driver.findElement(By.id("EmployerRegister")).click();
        
        Thread.sleep(1000);
        
        if(driver.getCurrentUrl().equalsIgnoreCase("http://localhost:3000/home"))
        {
        	System.out.println("TestCase 4 : passed");
        }
        else
        {
        	System.out.println("Testcase 4 :failed");
        }
        
        
        

		

	}

}
