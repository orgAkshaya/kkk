import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.*;

public class BasicTesting {
	
	
		

	public static void main(String[] args) throws FileNotFoundException   {
		
//		WebDriver w=new ChromeDriver();
//		
//	WebDriverWait  k=new WebDriverWait(w, 30);
//	k.until(ExpectedConditions.presenceOfElementLocated(null))
//		w.get("https://money.rediff.com/gainers");
//		int r=w.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
//		int c=w.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
//		for(int i=2;i<=r;i++) {
//			for(int j=1;j<=c;j++) {
//				String x="//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]";
//				String y=w.findElement(By.xpath(x)).getTagName();
//				System.out.println(y);
//			}
//		}
//		try {
//			w.switchTo().alert();
//		}catch(StaleElementReferenceException e) {
//			
//		}
		
		Map<String,String> hm=new LinkedHashMap<String,String>();
		hm.put("name", "null");
		
		Set<String> o=hm.keySet();
		for(String u:o) {
			System.out.println(u+" "+hm.get(u));
		}
	
	}

	
	
	
	
	
        

	

}
