package gdpTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoTesting3 {

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

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("demo2@gmail.com");
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

            wait.until(ExpectedConditions.elementToBeClickable(By.id("account"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("search"))).click();
            wait.until(ExpectedConditions.urlToBe("http://localhost:3000/search"));
            if (driver.getCurrentUrl().equalsIgnoreCase("http://localhost:3000/search")) {
                System.out.println("Testcase 5 : passed, could able to click on account and search button");
            } else {
                System.out.println("Testcase : failed");
            }

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search"))).sendKeys("Financial Analyst");
            System.out.println("Test case 5 : passed");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("location"))).sendKeys("San Francisco");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("salary"))).sendKeys("$80,000 - $100,000");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("type"))).sendKeys("Full-time");
            System.out.println("Could able to access the form Testcase 6 : passed");

            wait.until(ExpectedConditions.elementToBeClickable(By.id("Apply"))).click();
            System.out.println("Success Test case 7 : passed");

            wait.until(ExpectedConditions.elementToBeClickable(By.id("account"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("logout"))).click();

            String curr_url = "http://localhost:3000/";
            wait.until(ExpectedConditions.urlToBe(curr_url));
            if (driver.getCurrentUrl().equalsIgnoreCase(curr_url)) {
                System.out.println("Testcase 8 : passed");
            } else {
                System.out.println("Testcase 8 : failed");
            }
        } finally {
            driver.quit();
        }
    }
}
