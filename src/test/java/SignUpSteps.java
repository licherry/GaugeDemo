import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Created by chenli on 6/30/16.
 */
public class SignUpSteps extends DriverFactory {

    @Step("Go to landing page")
    public void goToLandingPage() {
        driver = new DriverFactory().getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://accountsdemo.herokuapp.com");
        driver.manage().window().maximize();
    }

    @Step("Access to sign up page")
    public void accessToSignUpPage() {
        driver.findElement(By.linkText("Sign up")).click();
        String pageTitle = driver.findElement(By.cssSelector(".main h2")).getText();
        Assert.assertEquals(pageTitle, "Sign up");
    }

    @Step("Input first name <chen>")
    public void inputFirstName(String firstName) {
        driver.findElement(By.id("user_first_name")).sendKeys(firstName);

    }

    @Step("Input last name <li>")
    public void inputLastName(String lastName) {
        driver.findElement(By.id("user_last_name")).sendKeys(lastName);
    }

    @Step("Input email <abcd@abcd.com>")
    public void inputEmail(String email) {
        driver.findElement(By.id("user_email")).sendKeys(email);

    }

    @Step("Input password <12345678>")
    public void inputPassword(String password) {
        driver.findElement(By.id("user_password")).sendKeys(password);

    }

    @Step("Input the confirm password <12345678>")
    public void inputConfirmPassword(String confirmPassword) {
        driver.findElement(By.id("user_password_confirmation")).sendKeys(confirmPassword);

    }

    @Step("Click Sign up button")
    public void clickSignUpButton() {
        driver.findElement(By.name("commit")).click();

    }

    @Step("Access to application successfully")
    public void accessToApplication() {
        WebElement signOutLink = driver.findElement(By.cssSelector("a[href=\"/users/sign_out\"]"));
        boolean signOutLinkDisplayed = signOutLink.isDisplayed();
        Assert.assertTrue(signOutLinkDisplayed);
    }
}
