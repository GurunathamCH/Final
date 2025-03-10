package Utilities;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericMethods {
public WebDriver Browser;
public WebElement Element;

//Open Brower base on Perameter value
public void OpenBrowser(String BrowserName) //Chrome
{
	if(BrowserName.equalsIgnoreCase("Chrome"))
	{
		WebDriverManager.chromedriver().setup();
		Browser=new ChromeDriver();//
		
	}
	else if(BrowserName.equalsIgnoreCase("Edge"))
	{
		
		WebDriverManager.edgedriver().setup();
		Browser=new EdgeDriver();
	}
	else if(BrowserName.equalsIgnoreCase("IE"))
	{
		
		WebDriverManager.iedriver().setup();
		Browser=new InternetExplorerDriver();
	}
	else if(BrowserName.equalsIgnoreCase("Opera"))
	{
		
		WebDriverManager.operadriver().setup();
		Browser=new OperaDriver();
	}
	else if(BrowserName.equalsIgnoreCase("Firefox"))
	{
		
		WebDriverManager.firefoxdriver().setup();
		Browser=new FirefoxDriver();
		
		
	}
	else if(BrowserName.equalsIgnoreCase("Safari"))
	{
		
		WebDriverManager.safaridriver().setup();
		Browser=new SafariDriver();
	}
	else
	{
		System.out.println("Please eneter browser name like Chrome,Edge,IE,Firefox,Opera,Safari");
	}
	
}

public void NavigateToURL(String URL)
{
	Browser.get(URL);
}
public void NavigateToPriviousURL()
{
	
Browser.navigate().back();
}

public void NavigateForward()
{
Browser.navigate().forward();	
}

public void PageRefresh()
{
	Browser.navigate().refresh();
	
}
public String GetPageTitle()
{
return Browser.getTitle();
}
public String GetCurrentURL()
{
	return Browser.getCurrentUrl();

}
public String getPageSourceCode()
{
	
return Browser.getPageSource();
}
public void CloseCurrentWindow()
{
	
Browser.close();
}
public void CloseAllWindows()
{
Browser.quit();	
}
public void MazimizeWindow()
{
Browser.manage().window().maximize();	
}

public String GetParntWindowId()
{
return Browser.getWindowHandle();	
}

public Set<String> GetAllWidowIDs()
{
return Browser.getWindowHandles();	
}


public WebElement FindElementByID(String IDValue)
{
	return Browser.findElement(By.id(IDValue));
}

public WebElement FindElementByClass(String ClassValue)
{
	return Browser.findElement(By.className(ClassValue));
}
public WebElement FindElementByName(String NameValue)
{
	return Browser.findElement(By.name(NameValue));
}
public WebElement FindElementByTagName(String TagNameValue)
{
	return Browser.findElement(By.tagName(TagNameValue));
}
public WebElement FindElementByLinkText(String LinkText)
{
	
return Browser.findElement(By.linkText(LinkText));
}
public WebElement FindElementByPartialLinkText(String PartialLinkText)
{
	
return Browser.findElement(By.linkText(PartialLinkText));
}

public List<WebElement> FindListofCheckboxes()
{
	
return Browser.findElements(By.xpath("//input[@type='checkbox']"));
}

public List<WebElement> FindListofRadioButtons()
{
	
return Browser.findElements(By.xpath("//input[@type='radio']"));
}

public List<WebElement> FindListoftextFiled()
{
	
return Browser.findElements(By.xpath("//input[@type='text']"));
}


public List<WebElement> FindListofEmailFields()
{
	
return Browser.findElements(By.xpath("//input[@type='email']"));
}

public List<WebElement> FindListofpasswords()
{
	
return Browser.findElements(By.xpath("//input[@type='password']"));
}

public List<WebElement> FindListofDateElements()
{
	
return Browser.findElements(By.xpath("//input[@type='date']"));
}


public List<WebElement> FindListofFileUploads()
{
	
return Browser.findElements(By.xpath("//input[@type='file']"));
}


public List<WebElement> FindListofSubmitButtons()
{
	
return Browser.findElements(By.xpath("//input[@type='submit']"));
}

public List<WebElement> FindListofCancelButtons()
{
	
return Browser.findElements(By.xpath("//input[@type='cancel']"));
}

public List<WebElement> FindListofResetButtons()
{
	
return Browser.findElements(By.xpath("//input[@type='reset']"));
}

public List<WebElement> FindListofLinks()
{
	
return Browser.findElements(By.xpath("//a"));
}

public List<WebElement> FindListofDropdowns()
{
	
return Browser.findElements(By.xpath("//select"));
}

public List<WebElement> FindListofFrames()
{
	
return Browser.findElements(By.xpath("//iframe"));
}

public List<WebElement> FindListofTables()
{
	
return Browser.findElements(By.xpath("//table"));
}
public WebElement FindWebElemenetByXpath(String Xptah)
{
return Browser.findElement(By.xpath(Xptah))	;
}

public WebElement FindWebElementByCSSSelector(String CSSSelector)
{
	
return Browser.findElement(By.cssSelector(CSSSelector));
}
public void ClickOnWebElement(WebElement Webelement)
{
Webelement.click();
}
public void EnterValuesIntoTextFiled(WebElement Webelement,String Value)
{
	
Webelement.sendKeys(Value);
}
public void ClearTheTextFiled(WebElement Webelement)
{
Webelement.clear();
}
public String GetTextOfWebEelemnt(WebElement Webelement)
{
	
return Webelement.getText();
}
public int getLocationXofWebElement(WebElement Webelement)
{
	
return Webelement.getLocation().x;
}
public int getLocationYofWebElement(WebElement Webelement)
{
	
return Webelement.getLocation().y;
}
public String GetAttributeValue(WebElement Webelement,String AttributeName)
{
return Webelement.getAttribute(AttributeName);


}
public boolean VerifyElementDisplayerOrNot(WebElement Webelement)
{
return Webelement.isDisplayed();	
}
public boolean VerifyElementDisplayerOrNotwithXpath(String Xpath)
{
return Browser.findElement(By.xpath(Xpath)).isDisplayed();	
}
public boolean VerifyElementEnabledrOrNot(WebElement Webelement)
{
return Webelement.isEnabled();	
}

public boolean VerifyElementSelectedOrNot(WebElement Webelement)
{
return Webelement.isSelected();	
}
public void SelectOptionInDropDownByVisibletext(WebElement Webelement,String VisibleText)
{
	Select Sc=new Select(Webelement);
    Sc.selectByVisibleText(VisibleText);
}
public void SelectOptionInDropDownByIndex(WebElement Webelement,int Indexvalue)
{
	Select Sc=new Select(Webelement);
    Sc.selectByIndex(Indexvalue);
}

public void SelectOptionInDropDownByValue(WebElement Webelement,String ValueAttribute)
{
	Select Sc=new Select(Webelement);
    Sc.selectByValue(ValueAttribute);
}
public void DeSelectOptionInDropDownByVisibiletext(WebElement Webelement,String OptionName)
{
	Select Sc=new Select(Webelement);
    Sc.deselectByVisibleText(OptionName);
}
public void DeSelectOptionInDropDownByIndex(WebElement Webelement,int Indexvalue)
{
	Select Sc=new Select(Webelement);
    Sc.deselectByIndex(Indexvalue);
}

public void DeSelectOptionInDropDownByValue(WebElement Webelement,String ValueAttribute)
{
	Select Sc=new Select(Webelement);
    Sc.deselectByValue(ValueAttribute);
}
public void DeSelectAllDropDonValues(WebElement Webelement)
{
	Select Sc=new Select(Webelement);
    Sc.deselectAll();
}
public void ScrollPageDown()
{
	  JavascriptExecutor js = (JavascriptExecutor) Browser;
	    js.executeScript("window.scrollBy(0,250)", "");
}

public String GetTextFromAlert()
{
return Browser.switchTo().alert().getText()	;
}

public void AcceptAlert()
{
	
Browser.switchTo().alert().accept();
}



}