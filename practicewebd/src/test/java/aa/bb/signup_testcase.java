package aa.bb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class signup_testcase {
	static WebDriver driver;

	static void base() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
	}

	public static void main(String[] args) {
		base();
//		login lin = new login(driver);
//		header hdr = new header(driver);
//		hdr.hsignup.click();
//		lin.signupele();
//		lin.signup("kk", "kk200@gmail.com");
//		lin.signupelems();
//		System.out.println("done");
//		lin.accountinfo("5", "March", "2001", "password"); 
//		lin.adrsinfo("test", "test","com", "adress1", "adress2", "United States", "state", "city", "zip","4521025");
//		lin.Createacc();

	}

}
