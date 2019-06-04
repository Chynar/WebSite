import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Kayak {
WebDriver kayak;

@Before
public void kayak() {
	WebDriverManager.chromedriver().setup();
	kayak = new ChromeDriver();
	kayak.manage().window().maximize();
}
     @Test
     public void test1() throws InterruptedException {
    	 kayak.get("https://www.kayak.com");
    	 Thread.sleep(2000);
    	 kayak.findElement(By.xpath("//a[@aria-label='Cruises']")).click();
     }
     @After
     public void after() throws InterruptedException {
    	 Thread.sleep(2000);
    	 kayak.close();
     }
}
