package pb.pageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pb.generic.Constants;
import pb.generic.base;

@SuppressWarnings(value = { "all" })
public class PayBackPage extends base {
	
	private AndroidDriver<AndroidElement> driver;
	public int TimeoutValue = Constants.time_out;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Login']")
	private WebElement loginButton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Partner erkunden']")
	private AndroidElement partnerErkunden;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
	private AndroidElement navigateBack;
	
	@AndroidFindBy(id = "de.payback.client.android:id/coupon_nav_graph")
	private AndroidElement coupons;
				  
	@AndroidFindBy(id = "de.payback.client.android:id/not_activated_button")
	private AndroidElement activateCard;
	
	
	@AndroidFindBy(id = "de.payback.client.android:id/redeem_offline_button")
	private AndroidElement activationString;
	
	@AndroidFindBy(xpath = "(//androidx.cardview.widget.CardView[@index='0'])[3]")
	private AndroidElement reweCard;
	
	@AndroidFindBy(id = "de.payback.client.android:id/filter_button")
	private WebElement filterButton;
	
	public PayBackPage() {
		this.driver = capabilities();
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public void clickPartnerErkunden() {
		partnerErkunden.click();
	}
	
	public void navigateUp() {
		navigateBack.click();
	}
	
	public void clickCoupons() {
		coupons.click();
	}
	
	public void selectReweCard() {
		reweCard.click();
	}
	
	public void activateCard() {
		activateCard.click();
	}
	
	public String activationMessage() {
		return activationString.getText();
	}
	
	public void clickFilterCoupons() {
		filterButton.click();
	}

}
