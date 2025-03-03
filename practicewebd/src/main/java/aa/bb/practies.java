package aa.bb;

//import this package to driver setup
import io.github.bonigarcia.wdm.WebDriverManager;

// imort this to open chromedriver
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.management.AttributeNotFoundException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
// import this to use webdriver
import org.openqa.selenium.WebDriver;
// import this to use webelement 
import org.openqa.selenium.WebElement;

public class practies {
	
	public static void main(String[] args) throws InterruptedException  {
		
		// for driver setup
		WebDriverManager.chromedriver().setup();
	//	WebDriverManager.edgedriver().setup();
		// open browser
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver1 = new EdgeDriver();
		
		// 1 checkbox selected 
		
		// now we have driver object and we will work with this to do any activity
		
//		driver.get("https://www.amazon.in/");
//		WebElement Searchbox = driver.findElement(By.id("twotabsearchtextbox"));
//		Searchbox.click();
//		Searchbox.sendKeys("mobiles");
//		driver.findElement(By.id("nav-search-submit-button")).submit();
//		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"p_n_feature_thirty_browse-bin/44897294031\"]/span/a/div/label/i"));
//		checkbox.click();
//		WebElement checkboxe = driver.findElement(By.xpath("//*[@id=\"p_n_feature_thirty_browse-bin/44897294031\"]/span/a/div/label/input"));
//		if (checkboxe.isSelected()) {
//			System.out.println("checkbox is selected");
//		}else {
//			System.out.println("check box is not selected");
//		}
		
		
		// 2 arrows up doen and backspace
		
//		driver.get("https://www.google.com/");
//		WebElement SearchboxS = driver.findElement(By.name("q"));
//		SearchboxS.click();
//		SearchboxS.sendKeys("mobiles");
//		SearchboxS.click();
//		Thread.sleep(1000); // Small delay
//		SearchboxS.sendKeys(Keys.BACK_SPACE);
		
	
		// 3 radio btns check
		
//		driver.get("https://www.calculator.net/mortgage-payoff-calculator.html");
//		List <WebElement> rbtn = driver.findElements(By.className("cbcontainer"));
//		int a = rbtn.size();
//		System.out.println(a + " first for a");
//		for (int i=0; i<a; i++) {
//			rbtn.get(i).click();
//			rbtn.get(i).getAttribute("checked");
//			System.out.println(rbtn.get(i).getAttribute("checked"));
//			System.out.println(i + " checked");
//		}
//		
//		int tmp = 0;
//		List <WebElement> rbtns = driver.findElements(By.name("cpayoffoption"));
//		int b =rbtns.size();
//		System.out.println(b + " second for b");
//		for (int i=0;i<b;i++) {
//			if (rbtns.get(i).isSelected()) {
//				tmp++;
//				System.out.println(rbtn.get(i).getText() + "is selected");
//			}else {
//				System.out.println(rbtn.get(i).getText() + "is not selected");
//			}
//		}
//		
//		
//		if (tmp==1) {
//			System.out.println("working correcly");
//		}else {
//			System.out.println("not working correctly");
//		}
		
		//4. get all links of one block and click on one 
		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("https://www.calculator.net/mortgage-payoff-calculator.html");
//		WebElement block = driver.findElement(By.id("occontent"));
//		
//		List<WebElement>blocklinks = block.findElements(By.tagName("ac"));
//		int k = blocklinks.size();
//		System.out.println(k);
//		for(int i=0; i<k; i++) {
//			String linkname = blocklinks.get(i).getText();
//			System.out.println(linkname +" " + i);
//			if (linkname.equals("More Financial Calculators")) {
//				blocklinks.get(i).click();
//			}
//		}
		
		//5 dropdown get all options and selec one
		
//		driver.get("https://www.calculator.net/inflation-calculator.html");
//		WebElement drp = driver.findElement(By.id("cinmonth1"));
//		Select sc = new Select(drp);
//		List <WebElement> options = sc.getOptions();
//		for (int i=0; i<options.size(); i++) {
//			System.out.println(options.get(i).getText());
//		}
//		sc.selectByIndex(2);
//		sc.selectByValue("3");
//		sc.selectByVisibleText("May");
//		
//		int tmp =0;
//		for (int i=0; i<options.size(); i++) {
//			if(options.get(i).isSelected()) {
//			tmp++;
//			System.out.println(options.get(i).getText() + " is selected");
//			}
//		}
//		
//		if (tmp==1) {
//			System.out.println("working correct");
//		}else {
//			System.out.println("selected multiple options");
//		}
		
		//6 Drag and drop	
//		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
//		WebElement a= driver.findElement(By.id("column-a"));
//		WebElement b= driver.findElement(By.id("column-b"));
//		Actions ac = new Actions(driver);
//		Thread.sleep(2000);
//		ac.dragAndDrop(b, a).build().perform();
		
	// 7 hover on element and verify
		driver.get("https://the-internet.herokuapp.com/hovers");
		WebElement a = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
		WebElement ab = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5"));
		Actions ac = new Actions(driver);
		ac.moveToElement(a).perform();
		String txt = ab.getText();
		if(txt.isEmpty()) {
			System.out.println("not able to hover");
		} else {
			System.out.println("successfully hoveres and name is " + txt);
		}
		
//		 8 aleart hendles 
//		normal hendle with only ok option
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		WebElement alert1 = driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]"));
//		alert1.click();
//		Alert ab = driver.switchTo().alert();
//		ab.accept();
//		WebElement result = driver.findElement(By.id("result"));
//		System.out.println(result.getText());
//		
		// hendle with only ok and cancel option 
//		WebElement alert2 = driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]"));
//		// accept the aleart
//		alert2.click();
//		ab.accept();
//		System.out.println(result.getText());
//		//cancel the alert
//		alert2.click();
//		ab.dismiss();
//		System.out.println(result.getText());
		
//		// handle with txt box
//		WebElement alert3 = driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]"));
//		// accept alert with txt
//		alert3.click();
//		ab.sendKeys("test");
//		ab.accept();
//		System.out.println(result.getText());
//		// cancel alert with txt
//		alert3.click();
//		ab.sendKeys("test");
//		ab.dismiss();
//		System.out.println(result.getText());
		
		//9 switch between tabs
		
//		driver.get("https://www.amazon.in/");
//		WebElement product = driver.findElement(By.className("imageOverlay--eK9PK"));
//		product.click();
//		Set <String> window = driver.getWindowHandles();
//		Iterator it = window.iterator();
//		String window1 = (String)it.next();
//		String window2 = (String) it.next();
//		driver.switchTo().window(window1);
//		
//		//10 weblistners 
//		WebDriver decoDriver = new EventFiringDecorator(new MyListener()).decorate(driver);
//		decoDriver.get("https://www.google.com");
//		WebElement txtbox = decoDriver.findElement(By.name("q"));
//		txtbox.click();
//		txtbox.sendKeys("Q");
//		WebElement link = decoDriver.findElement(By.linkText("Advertising"));
//		link.click();
//		
//		
//		
		
		
	}

}