package Pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2 {
	//declaration
			@FindBy(id="username")
			private WebElement uname;
			@FindBy(id="password")
			private WebElement pwdname;
			@FindBy(id="log-in")
			private WebElement loginbutton;
			
		//intialization
			public pom2(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}
			
		//utilization
			public void clicklogin()
			{
				loginbutton.click();
			}
			public void username(String un)
			{
				uname.sendKeys(un);
			}
			public void pwdbox(String pwd)
			{
				pwdname.sendKeys(pwd);
			}

}
