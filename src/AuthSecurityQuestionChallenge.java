import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthSecurityQuestionChallenge {
    @Test
    public void securityQuestionChallenge() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://authenticationtest.com/questionChallenge/");
        driver.findElement(By.cssSelector("#email")).sendKeys("question@authenticationtest.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("pa$$w0rd");
        String question = driver.findElement(By.cssSelector("label[for='answer']")).getText();
        System.out.println(question);

        switch (question) {

            case "Who did you take to the prom?":
                driver.findElement(By.cssSelector("#answer")).sendKeys("Nobody");
                driver.findElement(By.cssSelector("input[value='Log In']")).submit();
                driver.close();
                break;

            case "What make was your first car?":
                driver.findElement(By.cssSelector("#answer")).sendKeys("Bentley");
                driver.findElement(By.cssSelector("input[value='Log In']")).submit();
                driver.close();
                break;
            case "What city were you born in?":
                driver.findElement(By.cssSelector("#answer")).sendKeys("Chicago");
                driver.findElement(By.cssSelector("input[value='Log In']")).submit();
                driver.close();
                break;
        }
    }
}
