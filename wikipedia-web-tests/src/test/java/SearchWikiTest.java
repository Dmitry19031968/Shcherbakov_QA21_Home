import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchWikiTest {
    WebDriver wiki;
    @Test

        public void searchWikiTest() throws InterruptedException {
        wiki = new ChromeDriver();
        wiki.get("https://en.wikipedia.org");
        wiki.findElement(By.name("search")).click();
        wiki.findElement(By.name("search")).clear();
        wiki.findElement(By.name("search")).sendKeys("tel-ran");
        wiki.findElement(By.name("go")).click();
        Thread.sleep(10000);
        wiki.quit();


    }
}
