import Base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testsetup extends Base {

    @Test
    public void testsetup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
}
