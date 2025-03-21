import org.example.Main;
import org.example.seleTest;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class MainTest {

    @Test
    public void getUrlTest() {
        seleTest seleTest = new seleTest("/Users/harel/Downloads/chromedriver-mac-arm64/chromedriver ");
        String url = seleTest.getUrl();
        Assert.assertEquals(url, "https://www.automationexercise.com/");

    }
    @Test
    public void getTitleTest() throws InterruptedException {
        seleTest test = new seleTest("/Users/harel/Downloads/chromedriver-mac-arm64/chromedriver ");
        String title = test.getUrl();
       Assert.assertEquals(title, "https://www.automationexercise.com/");
    }
}



