import org.testng.annotations.*;

public class TestBase {


    protected static ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUP() {
        app.init();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        app.stop();
    }

}
