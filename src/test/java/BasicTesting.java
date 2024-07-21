import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import groovyjarjarpicocli.CommandLine.Parameters;
/*find maximjum diference between two element 
 * Any two element in the array*/
public class BasicTesting   {



@Test()
public void lno() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://money.rediff.com/gainers");
	List<WebElement> table_row=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
	System.out.println(table_row.size());
	List<WebElement> table_col=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
	System.out.println(table_col.size());
	System.out.println("ok");
	
	}
}



	


	
	
	
	
	
        

	


