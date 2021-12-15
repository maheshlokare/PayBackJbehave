package pb.pageobject;

import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pb.generic.Constants;
import pb.generic.base;


@SuppressWarnings(value = { "all" })
public class PayBackCouponsPage  extends base{
	
private AndroidDriver driver;
	
	public PayBackCouponsPage() {
		this.driver = capabilities();
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

}
