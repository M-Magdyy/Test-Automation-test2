import org.example.Document;
import org.example.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test {
    HomePage hd;
    Document doc;
    WebDriver driver;
    @org.testng.annotations.Test
    public void test1()
    {
        driver = new ChromeDriver();
        hd = new HomePage(driver);
        hd.OpenHomePage();
        Assert.assertEquals(hd.assertPage(),"Get paid");
        hd.ClickOnPaid();
        doc = new Document(driver);
        doc.docPrice();
        Assert.assertEquals(doc.retSelDoc(),doc.assertSecPage());
        String price= doc.docPrice();
        Assert.assertEquals(price,"$449");
    }

}
