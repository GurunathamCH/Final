package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.GenericMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDoubleClick extends GenericMethods{
	@Test(priority=0)
	public void DoubleclickOnWebElement() throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();//
		//WebDriver Browser=new ChromeDriver();//
		//System.out.println("browser opened"); 

	    // Browser.get("https://www.tgsrtcbus.in/oprs-web/");
		OpenBrowser("Chrome");
	     NavigateToURL("https://www.tgsrtcbus.in/oprs-web/");
	     Actions a=new Actions(Browser);
	     a.moveToElement(FindWebElemenetByXpath("//*[@id='searchBtn']")).build().perform();
	     //a.contextClick(FindWebElemenetByXpath("//*[@id='searchBtn']")).build().perform();;//Right click
	     Thread.sleep(5000);
	     //a.doubleClick(FindWebElemenetByXpath("//*[@id='searchBtn']")).build().perform();//Double Click
	     //a.clickAndHold(FindWebElemenetByXpath("//*[@id='searchBtn']")).build().perform();
	     
	}
}
