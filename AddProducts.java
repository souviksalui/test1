import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
//import java.util.Hashtable;
//import java.util.Dictionary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProducts {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testingenv-2021.toolsvilla.in/category/farm/special-farm-tools");

         List<String> productName = new ArrayList<>();
//        Dictionary<Integer, ArrayList<String>> dict = new Hashtable<>();
        
        boolean hasNextPage = true;
        while (hasNextPage) {
            List<WebElement> allProductNames = driver.findElements(By.xpath("//a[@class=\"title\"]"));
            for (WebElement allProductName :  allProductNames) {  //WebElement allProductName :
                productName.add(allProductName.getText());
//                System.out.println(productName);
//                System.out.println(allProductNames.toString());
                
            }

            //try {
                WebElement nextButton = driver.findElement(By.xpath("//a[normalize-space()=\"Next »\"]"));
                if (nextButton.isEnabled()) {
                    nextButton.click();
                    //Thread.sleep(2000);
                } else {
                    hasNextPage = false;
                }
            //} catch (org.openqa.selenium.NoSuchElementException e) {
             //   hasNextPage = false;
           // }
        }
        
        //System.out.println(productName);
        for(String s : productName)
        {
        	System.out.println(s+"/n");
        }
        
        
        driver.quit(); // close the browser
    }

}