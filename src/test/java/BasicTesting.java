import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/*find maximjum diference between two element 
 * Any two element in the array*/
//@JsonIgnoreProperties(ignoreUnknown = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BasicTesting   {
	

@Test()
public void show() {

WebDriver d=new ChromeDriver();
d.get("https://money.rediff.com/gainers");
int r=d.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
int c=d.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
for (int i=1;i<r;i++) {
	for(int j=1;j<c;j++) {
		String x="//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]";
		String y=d.findElement(By.xpath(x)).getText();
		System.out.println(y);
	}
}
}


}
	


	
	
	
	
	
        

	


