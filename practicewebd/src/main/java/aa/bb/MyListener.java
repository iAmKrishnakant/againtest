package aa.bb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class MyListener implements WebDriverListener {
	
	  @Override
	    public void beforeClick(WebElement element) {
	        System.out.println("Before clicking element: " + element.getText());
	    }

	  @Override
	  public void beforeGet(WebDriver driver, String url) {
		  System.out.println("navigetes to this link " + url);
	  }
	  
	  @Override
	  public void beforeSendKeys(WebElement element,CharSequence... keysToSend) {
		  StringBuilder data = new StringBuilder();
		    for (CharSequence key : keysToSend) {
		        data.append(key);
		    }
		  System.out.println("Entered data is "+data );
	  }
}

    
