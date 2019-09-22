import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager extends HelpresWiki{

    public String browser;

    public ApplicationManager(String browser) {
        super();
        this.browser = browser;
    }

    public void init() {
       if(browser.equals(BrowserType.CHROME)){
            wiki = new ChromeDriver();
        }
       if(browser.equals(BrowserType.FIREFOX)){
           wiki = new FirefoxDriver();
        }

        wiki.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wiki.manage().window().maximize();
        openSite("http://en.wikipedia.org");
    }

    public void stop() throws InterruptedException {
        Thread.sleep(5000);
        wiki.quit();
    }
}

