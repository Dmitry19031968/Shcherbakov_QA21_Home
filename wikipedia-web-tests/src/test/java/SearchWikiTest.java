import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchWikiTest extends TestBase {

    @Test(priority = 2)

    public void searchWikiTestTelRan() {
        app.wiki = new ChromeDriver();
        app.openSite("https://en.wikipedia.org");
        app.wiki.findElement(By.name("search")).click();
        app.wiki.findElement(By.name("search")).clear();
        app.wiki.findElement(By.name("search")).sendKeys("tel-ran");
        app.wiki.findElement(By.name("go")).click();
        app.wiki.findElement(By.name("search")).clear();

    }
    @Test(priority = 1)
    public void searchWikiTestQA() {
        app.wiki = new ChromeDriver();
        app.openSite("https://en.wikipedia.org");
        app.wiki.findElement(By.name("search")).click();
        app.wiki.findElement(By.name("search")).clear();
        app.wiki.findElement(By.name("search")).sendKeys("QA");
        app.wiki.findElement(By.name("go")).click();
        app.wiki.findElement(By.name("search")).clear();

    }

}
