package vrn.samdu.ta.Karina.pr7.tests.WebSiteTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FileUtils;
import static org.junit.Assert.assertEquals;


public class Scenario
{
    @Test
    public void setup() throws IOException {

        System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
        InternetExplorerDriver driver = new InternetExplorerDriver();


        driver.get("http://google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("NetCracker Воронеж");

        WebElement buttom1 = driver.findElement(By.xpath("//span[contains(text(), 'netcracker воронеж')]"));
        buttom1.click();


        driver.get("https://www.google.com/search?source=hp&ei=vzfBX9z2KJ2fjLsPh5Gg-AE&q=netcracker+%D0%B2%D0%BE%D1%80%D0%BE%D0%BD%D0%B5%D0%B6&oq=NetCracker+%D0%92%D0%BE%D1%80%D0%BE%D0%BD%D0%B5%D0%B6&gs_lcp=CgZwc3ktYWIQARgAMgIIADICCAAyAggAMgYIABAWEB4yBggAEBYQHjICCCYyAggmOgoIABDqAhC0AhBDUN2BAVjdgQFglIgBaAFwAHgAgAE-iAE-kgEBMZgBAKABAqABAaoBB2d3cy13aXqwAQE&sclient=psy-ab#spf=1606498516161");

        try
        {
            WebElement buttom2 = driver.findElement(By.xpath("//span[contains(text(), 'Учебный центр Netcracker в Воронеже')]"));
            buttom2.click();
        }
        catch (NoSuchElementException e)
        {
            driver.get("http://sam.edu-netcracker.com/");
        }

        WebElement buttom3 = driver.findElement(By.xpath("//a[text()='Направления']"));
        buttom3.click();

        String title = driver.getTitle();

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("D:\\" +  title +".png"));

        List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@class, 'portfolio-filter')]"));

        HashMap<String, String> map = new HashMap<String, String>();

        System.out.println(elements.size());

        int k = 0;

        while (k < elements.size())
        {
            k++;
        }

        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("0", "Software Development");
        hm.put("1", "Business Analysis");
        hm.put("2", "Software Quality Assurance");
        hm.put("3", "Application Management");
        hm.put("4", "Integration Analysis");


        assertEquals(hm, map);

        driver.quit();

    }


}
