package myres_q;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class sdox_template extends driverClass {

	
	
	@Test(priority=1, dataProviderClass=logindata.class, dataProvider="sdox")
    public void loginuser (String email,
                           String password) throws InterruptedException {
    	
    	
        driver.get("https://chemist1.qa-ts.myresqsoftware.com/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys(email);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
        driver.findElement(By.className("register-submit")).click();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        
        //create new template
        driver.findElement(By.xpath("//p[contains(text(),'SDOX')]")).click();
        driver.findElement(By.cssSelector("button.card-view-button")).click();
        driver.findElement(By.cssSelector("span.icon-icn_create")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Template name')]/following-sibling::input")).sendKeys("name title");
        driver.findElement(By.cssSelector("div.modal-input-group button.dropdown-toggle")).click();
        driver.findElement(By.xpath("//a[contains(text(),'General Documents')]")).click();
        driver.findElement(By.cssSelector("div.modal-footer button.green-btn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        WebDriverWait waitfor = new WebDriverWait(driver, 10); 
        waitfor.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Template Settings')]")));
        driver.findElement(By.xpath("//span[contains(text(),'Template Settings')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
        driver.findElement(By.xpath("//div[contains(text(),'Title')]/..//ul/li[1]")).click();
        
        
        
    }	
	
	@Test(priority=2)
	public void deleteTemplate() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElement(By.cssSelector("div#actionsList")).click();
		driver.findElement(By.cssSelector("ul.action-dropdown span.icon-icc_delete")).click();
		
	}
}
