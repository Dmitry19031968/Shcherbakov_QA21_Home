import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchWikiTest extends TestBase {

    @Test(priority = 2)

    public void searchWikiTestTelRan() {
        //wiki = new ChromeDriver();
       // wiki.get("https://en.wikipedia.org");

        app.wiki.findElement(By.name("search")).click();
        app.wiki.findElement(By.name("search")).clear();
        app.wiki.findElement(By.name("search")).sendKeys("tel-ran");
        app.wiki.findElement(By.name("go")).click();
        app.wiki.findElement(By.name("search")).clear();
    }
    @Test(priority = 1)
    public void searchWikiTestQA()  {
       // wiki = new ChromeDriver();
       // wiki.get("https://en.wikipedia.org");

        app.wiki.findElement(By.name("search")).click();
        app.wiki.findElement(By.name("search")).clear();
        app.wiki.findElement(By.name("search")).sendKeys("QA");
        app.wiki.findElement(By.name("go")).click();
        app.wiki.findElement(By.name("search")).clear();
    }
}
