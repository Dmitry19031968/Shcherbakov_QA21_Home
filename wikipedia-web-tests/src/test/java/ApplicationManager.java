import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
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
       else if(browser.equals(BrowserType.FIREFOX)){
           wiki = new FirefoxDriver();
        }
       else if(browser.equals(BrowserType.EDGE)){
           wiki = new EdgeDriver();
       }

        wiki.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wiki.manage().window().maximize();
        openSite("http://en.wikipedia.org");
    }

    public void stop() throws InterruptedException {
        Thread.sleep(5000);
        wiki.quit();
    }

}

