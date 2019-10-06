import org.openqa.selenium.WebDriver;

public class HelpresWiki {

    WebDriver wiki;

    public void openSite(String url) {
        wiki.get(url);
        wiki.quit();
    }
}
