package myres_q;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
	

public class RES_Q_QA_TS_16_0_3AB extends driverClass {
    
	    @Test(priority=1, dataProviderClass=logindata.class, dataProvider="logindataAdmin")
	    public void loginuser (String email,
	                           String password,
	                           String initiationDesc,
	                           String initiationDesc2,
	                           String justification) throws InterruptedException {
	    	
	    	
	        driver.get("https://nourl/login");
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.findElement(By.cssSelector("input[name='email']")).sendKeys(email);
	        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
	        driver.findElement(By.className("register-submit")).click();
	        Thread.sleep(2000);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        
	        driver.findElement(By.xpath("//p[contains(text(),'WORKSPACE')]")).click();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.findElement(By.cssSelector("div.btn-body p")).click();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	        driver.findElement(By.cssSelector("button#moduleName")).click();
	        driver.findElement(By.xpath("//span[contains(text(),'Electronic Change Management')]")).click();
	        driver.findElement(By.cssSelector("button#type")).click();
	        driver.findElement(By.xpath("//span[contains(@class,'option-name') and contains(text(),'Software')]")).click();
	        driver.findElement(By.cssSelector("button#systemName")).click();
	        driver.findElement(By.xpath("//span[contains(@class,'option-name') and contains(text(),'123')]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.cssSelector("button.green-btn")).click();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	        Thread.sleep(3000);
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.findElement(By.cssSelector("aside.overflow-active--visible div.is-button span")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.cssSelector("aside.ng-isolate-scope div.is-button span")).click();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
	        Thread.sleep(1000);
	        driver.findElement(By.cssSelector("div#actionsList")).click();
	        driver.findElement(By.cssSelector("input[name='changeTitle']")).click();
	        driver.findElement(By.cssSelector("input[name='changeTitle']")).sendKeys("Test Title");
	        //selecting standard change priority
	        driver.findElement(By.xpath("//span[contains(text(),'Standard change')]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[contains(text(),'Procedure-based change')]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[contains(text(),'Procedure-based change')]")).click();
	        driver.findElement(By.cssSelector("input[name='standardNumber']")).sendKeys("7");
	        driver.findElement(By.cssSelector("form[name='initiationForm'] div.add-new-dashed-btn")).click();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.findElement(By.cssSelector("form[name='initiationForm'] textarea")).sendKeys(initiationDesc);
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[contains(text(),'CD1:')]")).click();
	        driver.findElement(By.cssSelector("form[name='initiationForm'] div.add-new-dashed-btn")).click();
	        driver.findElement(By.cssSelector("form[name='initiationForm'] textarea.ng-empty")).sendKeys(initiationDesc2);
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	        WebElement upload = driver.findElement(By.cssSelector("img[alt='Add document']"));
	        upload.sendKeys("D:\test.docx");
	        Thread.sleep(4000);
	        //delete description 2
	        driver.findElement(By.xpath("//div[contains(@class,'panel-body')]//div[contains(@ng-repeat,'description')][2]//span[contains(@class,'icon-icc_delete')]")).click();
	        driver.findElement(By.cssSelector("button[ng-click*='vm.deleteItem(vm.item.body)']")).click();
	        //checkbox, password and apply
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//span[contains(text(),'The change is not required to be installed on a test environment')]")).click();
	        driver.findElement(By.cssSelector("input[name='email']")).sendKeys(email);
	        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
	        driver.findElement(By.cssSelector("textarea[name='justification']")).sendKeys(justification);
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        Thread.sleep(1000);
	        driver.findElement(By.cssSelector("form[name='confirmationWithPasswordForm'] button.simple-style-btn")).click();
	        Thread.sleep(2500);
	        //uncheck checkbox
	        driver.findElement(By.cssSelector("div.question-panel span.icon-icn_Checkbox_checked")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("form[name='initiationForm'] button.green-btn.ng-binding")).click();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        //send
	        driver.findElement(By.cssSelector("form[name='sendForForm'] button.green-btn")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("form[name='initiationForm'] button.side-btn.pull-left")).click();
	        driver.findElement(By.cssSelector("input[name='email']")).sendKeys(email);
	        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
	        driver.findElement(By.cssSelector("form[name='confirmationWithPasswordForm'] button.simple-style-btn")).click();
	        //click send for approval again
	        driver.findElement(By.cssSelector("form[name='initiationForm'] button.green-btn.ng-binding")).click();
	        driver.findElement(By.cssSelector("form[name='sendForForm'] button.green-btn")).click();
	        Thread.sleep(3000);
	        //driver.findElement(By.cssSelector("form[name='initiationForm'] div.pull-right button.green-btn")).click();
	        
	        
	        
	    }	
	        
	        @Test(priority=2)
	        //delete workflow
	        public void deleteWorkflow() throws InterruptedException {
		        Thread.sleep(4000);
		        driver.findElement(By.cssSelector("div#actionsList")).click();
		        driver.findElement(By.cssSelector("span.icon-icc_delete")).click();
		        driver.findElement(By.cssSelector("div.modal-content button.simple-style-btn")).click();
	       
	        }
	        
	
	}
