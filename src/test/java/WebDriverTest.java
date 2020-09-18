import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

    WebDriver driver;

    @Before
    public void before(){
        String path = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", path);

        driver = new ChromeDriver();
    }

    @Test
    public void print(){
        System.out.println("Hello World!");
    }

    @Test
    public void e2eTest(){
        driver.get("http://quote-qa.portnov.com/");
        String actualTitle = driver.getTitle();
        Assertions.assertThat(actualTitle).isEqualTo("Get a Quote");
        System.out.println("Successfully asserted");
    }

    @After
    public void after(){
        driver.quit();
    }
}