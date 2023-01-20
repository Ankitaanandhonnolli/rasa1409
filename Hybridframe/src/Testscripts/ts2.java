package Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Genericscripts.Base_Test;
import Genericscripts.Genericfetchdatafromexcel;

import Pomscripts.pom2;

public class ts2 extends Base_Test {
	 @Test
     public void script() throws EncryptedDocumentException, IOException
     {
  	   String username = Genericfetchdatafromexcel.getData("sheet1",0,0);
  	   String password = Genericfetchdatafromexcel.getData("sheet1",1,0);
  	   
  	 
       pom2 pmc = new pom2(driver);
  	   pmc.username(username);
  	   pmc.pwdbox(password);
  	   //Assert.fail();
  	   pmc.clicklogin();
     }
}
