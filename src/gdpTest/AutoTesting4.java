package gdpTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoTesting4 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("http://localhost:3000/");
            System.out.println("Test");
            driver.manage().window().maximize();

            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Talent Hunt")) {
                System.out.println("Testcase1 : Passed");
            } else {
                System.out.println("Testcase1 : failed");
            }

            wait.until(ExpectedConditions.elementToBeClickable(By.id("Login"))).click();
            String url = "http://localhost:3000/login";
            if (url.equalsIgnoreCase(driver.getCurrentUrl())) {
                System.out.println("TestCase 2 : Passed");
            } else {
                System.out.println("Testcase2 : failed");
            }

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("simple-tab-2"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("demo1@gmail.com");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("123@Shiva");
            System.out.println("Testcase 3 : passes could able to access the form fields");

            wait.until(ExpectedConditions.elementToBeClickable(By.id("login"))).click();
            String loginurl = "http://localhost:3000/home";
            wait.until(ExpectedConditions.urlToBe(loginurl));
            if (driver.getCurrentUrl().equalsIgnoreCase(loginurl)) {
                System.out.println("Testcase4 : passed");
            } else {
                System.out.println("Testcase4 : failed");
            }

            wait.until(ExpectedConditions.elementToBeClickable(By.id("Started"))).click();
            wait.until(ExpectedConditions.urlToBe("http://localhost:3000/jobpost"));
            if (driver.getCurrentUrl().equalsIgnoreCase("http://localhost:3000/jobpost")) {
                System.out.println("Testcase 5 : passed");
            } else {
                System.out.println("Testcase : failed");
            }

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Title"))).sendKeys("DataAnalyst");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Qualification"))).sendKeys("Masters in computer science");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("description"))).sendKeys("Experience in data for 3 years ");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("salary"))).sendKeys("$80000");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Type"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("full"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("location"))).sendKeys("remote");
            wait.until(ExpectedConditions.elementToBeClickable(By.id("jobpost"))).click();
            
            wait.until(ExpectedConditions.urlToBe("http://localhost:3000/home"));
            if(driver.getCurrentUrl().equalsIgnoreCase("http://localhost:3000/home")) {
                System.out.println("Testcase 6: passed");
            } else {
                System.out.println("Testcase 6 :failed");
            }

            // Wait for toast notification to disappear
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".Toastify__toast")));

            wait.until(ExpectedConditions.elementToBeClickable(By.id("account"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("logout"))).click();

            String curr_url = "http://localhost:3000/";
            wait.until(ExpectedConditions.urlToBe(curr_url));
            if (driver.getCurrentUrl().equalsIgnoreCase(curr_url)) {
                System.out.println("Testcase 7 : passed");
            } else {
                System.out.println("Testcase 7 : failed");
            }
        } finally {
            driver.quit();
        }
    }
}
