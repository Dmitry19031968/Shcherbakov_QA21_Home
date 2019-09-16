import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchWikiTest extends TestBase {

    @Test(priority = 2)
<<<<<<< HEAD

    public void searchWikiTestTelRan() {
        app.wiki = new ChromeDriver();
        app.openSite("https://en.wikipedia.org");
=======
    public void searchWikiTestTelRan() {
        //wiki = new ChromeDriver();
       // wiki.get("https://en.wikipedia.org");
>>>>>>> 2a2691f7fe37c63a302a46e4832a41f6751512a3
        app.wiki.findElement(By.name("search")).click();
        app.wiki.findElement(By.name("search")).clear();
        app.wiki.findElement(By.name("search")).sendKeys("tel-ran");
        app.wiki.findElement(By.name("go")).click();
        app.wiki.findElement(By.name("search")).clear();
<<<<<<< HEAD

    }
    @Test(priority = 1)
    public void searchWikiTestQA() {
        app.wiki = new ChromeDriver();
        app.openSite("https://en.wikipedia.org");
=======
    }
    @Test(priority = 1)
    public void searchWikiTestQA() {
       // wiki = new ChromeDriver();
       // wiki.get("https://en.wikipedia.org");
>>>>>>> 2a2691f7fe37c63a302a46e4832a41f6751512a3
        app.wiki.findElement(By.name("search")).click();
        app.wiki.findElement(By.name("search")).clear();
        app.wiki.findElement(By.name("search")).sendKeys("QA");
        app.wiki.findElement(By.name("go")).click();
<<<<<<< HEAD
        app.wiki.findElement(By.name("search")).clear();
=======
>>>>>>> 2a2691f7fe37c63a302a46e4832a41f6751512a3

    }

}
