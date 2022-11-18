import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartTestTicket {

    WebDriver wd;

    @BeforeMethod
    public void preCondition(){

        wd = new ChromeDriver();
        wd.get("https://ticket-service-69443.firebaseapp.com");

    }

    @Test
    public void testName(){
        System.out.println("test started");

    }

    @Test
    public void testLogin(){
        System.out.println("test completed");

    }

    @AfterMethod
    public void postCondition(){
        // wd.close();
        wd.quit();

    }
}
