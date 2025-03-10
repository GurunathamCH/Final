package TestScripts;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ModularDrivenFramework.Signup;

public class ECOMMERCETest {
ModularDrivenFramework.Home home=new ModularDrivenFramework.Home();
ModularDrivenFramework.Signup signup=new ModularDrivenFramework.Signup();
SoftAssert sa=new SoftAssert();

@Test(priority=0)
public void VerifyUserNavigatingToWebsiteOrNot()
{
	home.AnyOpenBrowser("Chrome");
	home.MazimizeWindow();
	home.NavigateAnyURL("https://www.demoblaze.com");
	String ExpectedPageTitle="STORE";
	String ActutalPageTitle=home.GetPageTitle();
	System.out.println(ActutalPageTitle);
	sa.assertEquals(ActutalPageTitle, ExpectedPageTitle);
	sa.assertAll();
}
//Browser.switchTo().alert().getText().contains("Sign up successful.")
@Test
public void VerifySignUp() throws InterruptedException 
{home.ClickOnSignup();
home.SignUpIntoWebsite("TAYUDS1", "werfwer34");
Thread.sleep(3000);
	sa.assertEquals(home.GetTextFromAlert(), "Sign up successful.");
	home.AcceptAlert();
	sa.assertAll();
	

}
@Test
public void VerifyLogin() throws InterruptedException
{
	
home.CliCkonLoginLink();
Thread.sleep(3000);
home.LogintoWebsite("TAYUDS1", "werfwer34");
Thread.sleep(3000);
//sa.assertEquals(home.VerifyElementDisplayerOrNotwithXpath("//*[@id='logout2']")),true);
sa.assertEquals(home.VerifyElementDisplayerOrNotwithXpath("//*[@id='logout2']"),true);
home.PageRefresh();
sa.assertAll();



}
@Test
public void ClickOnProductandVerifyProductView() throws InterruptedException
{
	home.ScrollPageDown();
	Thread.sleep(3000);
home.ClickOnProduct("//*[@id='tbodyid']/div[1]/div/div/h4/a");	
Thread.sleep(3000);
//sa.assertEquals(home.VerifyElementDisplayerOrNotwithXpath("//*[@id='tbodyid']/div[2]/div/a")),true);
sa.assertEquals(home.VerifyElementDisplayerOrNotwithXpath("//*[@id='tbodyid']/div[2]/div/a"),true);
sa.assertAll();
}
@Test
public void VerifAddtoCartandProceedtoBuy() throws InterruptedException
{
	
home.AddProcuctToCart();
home.VerifyCartProducts();
Thread.sleep(3000);
//sa.assertEquals(home.VerifyElementDisplayerOrNotwithXpath("//*[@id='tbodyid']/tr/td[4]/a")),true);
home.ClickOnPalceOrder();
sa.assertEquals(home.VerifyElementDisplayerOrNotwithXpath("//*[@id='tbodyid']/tr/td[4]/a"),true);
sa.assertAll();
}
@Test
public void ConfirmAddressandPlaceOrder()
{
	home.PlaceOrder("Gowtham", "India", "Hyd", "2353456946", "3", "2030");
	
	sa.assertEquals(home.VerifyElementDisplayerOrNotwithXpath("//html/body/div[10]/div[7]/div/button"),true);
	home.VerifyOrderConfiramation();
	sa.assertAll();

}

}
