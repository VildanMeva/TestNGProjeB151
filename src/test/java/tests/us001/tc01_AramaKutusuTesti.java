package tests.us001;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;

public class tc01_AramaKutusuTesti {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Page page = new Page();
        page.aramaKutusu.sendKeys("iphohe", Keys.ENTER );

    }
}
