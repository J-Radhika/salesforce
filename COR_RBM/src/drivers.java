import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class drivers {
	static WebDriver driver;
	public static void main(String[] args) {
		Edgedriver();
	}
	

	public static void Edgedriver()
	{
		System.setProperty("webdriver.edge.driver", "H:\\Automation\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://vmb--vmbuat.my.salesforce.com/");
	}
}

