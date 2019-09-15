import org.testng.annotations.*;

public class TestBase {


    protected static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUP() {
        app.init();
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        app.stop();
    }

}
