package pb.pageobject;

import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pb.generic.base;

@SuppressWarnings(value = { "all" })
public class PayBackFilterPage extends base{
	
	private AndroidDriver driver;
	
	public PayBackFilterPage() {
		this.driver = capabilities();
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

}
