import org.openqa.selenium.WebDriver;
<<<<<<< HEAD
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wiki;

    public void init() {
        wiki = new ChromeDriver();
        wiki.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wiki.manage().window().maximize();
        openSite("http://en.wikipedia.org");
    }

    public void openSite(String url) {
        wiki.get(url);
    }

    public void stop() throws InterruptedException {
        Thread.sleep(5000);
        wiki.quit();
    }
=======

public class ApplicationManager {
    WebDriver wiki;
>>>>>>> 2a2691f7fe37c63a302a46e4832a41f6751512a3
}
