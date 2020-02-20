package gradledemo;
import java.util.concurrent.TimeUnit;

public class basictest<WebDriver> {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1210\\Downloads\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicityWait(30,TimeUnit.seconds);
	driver.get("  ");
	driver.manage().window().maximize();
}
}
	

