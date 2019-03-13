package myres_q;

import org.testng.annotations.DataProvider;

public class logindata {
	
	@DataProvider(name="logindataAdmin")
    public Object [][] checkoutData() {
        Object[][] obj = new Object[1][5];
        
            obj[0][0]="email";
            obj[0][1]="password";
            obj[0][2]="He determined to drop his litigation with the monastry";
            obj[0][3]="In 30 years of multiThreaded app development";
            obj[0][4]="none really";
            
        return obj;
    }
	
	@DataProvider(name="sdox")
    public Object [][] sdox() {
        Object[][] obj = new Object[1][2];
        
            obj[0][0]="email";
            obj[0][1]="password";
            
        return obj;
    }
}
