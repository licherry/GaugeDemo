import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

/**
 * Created by chenli on 6/30/16.
 */
public class LogoutSteps extends DriverFactory{
    @Step("Log out")
    public void Logout() {
        driver.findElement(By.cssSelector("a[href=\"/users/sign_out\"]")).click();
        new DriverFactory().destroyDriver();
    }
}
