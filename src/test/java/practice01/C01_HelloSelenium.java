package practice01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C01_HelloSelenium {
    public static void main(String[] args) throws InterruptedException {
/*C01-HelloSelenium  and C02_HelloSeleniumFirefox
       WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev");
        Thread.sleep(3000);
        driver.quit();

       WebDriver driver1= new EdgeDriver();
      driver1.get("https://selenium.dev");
      Thread.sleep(3000);
      driver1.quit();*/

/*C03-FirstTest


  WebDriver driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.manage().window().maximize();

  driver.get("https://www.amazon.com");
  driver.navigate().refresh();
  driver.navigate().refresh();
  String actualAmazonTitle=driver.getTitle();

  if (actualAmazonTitle.equals("amazon - Google'da Ara")){
      System.out.println("TEST PASSED");
  }else{
      System.err.println("TEST FAILED Sayfa baslığı= "+ driver.getTitle());
  }

  String actualAmazonUrl = driver.getCurrentUrl();
  if (actualAmazonUrl.equals("https://www.google.com/search?q=amazon&oq=amazon&gs_lcrp=EgZjaHJvbWUqDAgAECMYJxiABBiKBTIMCAAQIxgnGIAEGIoFMhgIARAuGEMYgwEYxwEYsQMY0QMYgAQYigUyEggCEC4YQxjHARjRAxiABBiKBTIKCAMQABixAxiABDISCAQQABhDGIMBGLEDGIAEGIoFMgoIBRAAGLEDGIAEMg0IBhAAGIMBGLEDGIAEMgYIBxAFGEDSAQgxMDczajBqN6gCALACAA&sourceid=chrome&ie=UTF-8"))
  {
      System.out.println("TEST PASSED");
  }else {

      System.err.println("TEST FAILED"+" Sayfa URL= "+driver.getCurrentUrl());
  }

  driver.quit();
*/

// C04_NavigateMethods
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com");

        Thread.sleep(3000);

        driver.navigate().to("https://techproeducation.com");

        Thread.sleep(3000);

        driver.navigate().back();

         Thread.sleep(3000);

         driver.navigate().forward();

         Thread.sleep(3000);

         driver.navigate().refresh();

         Thread.sleep(3000);

         driver.manage().window().maximize();

         Thread.sleep(3000);
         driver.manage().window().minimize();
         Thread.sleep(3000);

        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        driver.manage().window().setPosition(new Point(50,70));

        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(800,600));

        Thread.sleep(3000);


        driver.quit();




    }
}
