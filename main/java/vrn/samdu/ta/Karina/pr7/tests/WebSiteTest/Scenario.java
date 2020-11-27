package vrn.samdu.ta.Karina.pr7.tests.WebSiteTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;


public class Scenario
{
    @Test
    public void setup() throws IOException {
        //System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
        //FirefoxDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
        InternetExplorerDriver driver = new InternetExplorerDriver();


        /**driver.get("http://google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("NetCracker Воронеж");

        WebElement buttom1 = driver.findElement(By.xpath("//span[contains(text(), 'netcracker воронеж')]"));
        buttom1.click();*/


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

        /*for (WebElement element : elements) {
            System.out.println(element.getText());
        }*/

        HashMap<String, String> map = new HashMap<String, String>();

        for (WebElement element : elements)
        {
            map.put(element.getText(), element.getText());
        }









        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //WebElement buttom1 = driver.findElement(By.className("sbl1"));

        //WebElement buttom2 = driver.findElement(By.tagName("Инструменты"));
        //buttom2.click();
        //WebElement buttom2 = driver.findElementByCssSelector("aria-label="netcracker воронеж вакансии"");
        //buttom2.click();
        //*[@id="contents"]/span
        //<span>netcracker воронеж</span>



        //driver.findElement(By.xpath("//a[contains(text(),'Картинки')]")).click();
        //*[@id="contents"]/span[2]

        //WebElement buttom2 = driver.findElement(By.className("iUh30 Zu0yb tjvcx"));
        //buttom2.findElement(By.partialLinkText("Учебный центр Netcracker в Воронеже"));
        //buttom2.click();
        //*[@id="rso"]/div[1]/div/div[1]/a/h3/span



        //driver.quit();

    }


}
