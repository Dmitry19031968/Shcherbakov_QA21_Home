import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchWikiTest extends TestBase {

    @Test

    public void searchWikiTestTelRan() {
        wiki = new ChromeDriver();
        wiki.get("https://en.wikipedia.org");
        wiki.findElement(By.name("search")).click();
        wiki.findElement(By.name("search")).clear();
        wiki.findElement(By.name("search")).sendKeys("tel-ran");
        wiki.findElement(By.name("go")).click();
        wiki.findElement(By.name("search")).clear();
    }
    @Test
    public void searchWikiTestQA() {
        wiki = new ChromeDriver();
        wiki.get("https://en.wikipedia.org");
        wiki.findElement(By.name("search")).click();
        wiki.findElement(By.name("search")).clear();
        wiki.findElement(By.name("search")).sendKeys("QA");
        wiki.findElement(By.name("go")).click();

    }

}
