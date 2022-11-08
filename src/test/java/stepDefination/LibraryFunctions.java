package stepDefination;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LibraryFunctions {
	WebDriver driver;
	//@BeforeTest("@Signin")
	
	
	@Given("^Stocks navigate to url$")
	public void stocks_navigate_to_url() throws Throwable {
		  driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://money.rediff.com/index.html");
		   Thread.sleep(2000);
	}

	@When("^Stocks click to signin$")
	public void stocks_click_to_signin() throws Throwable {
		driver.findElement(By.linkText("Sign In")).click();
		 Thread.sleep(2000);
	}

	@When("^Stocks Login uding Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void stocks_Login_uding_Username_as_and_Password_as(String user, String pass) throws Throwable {
			driver.findElement(By.name("email-id")).sendKeys(user);
			   driver.findElement(By.name("passwd")).sendKeys(pass);
			   Thread.sleep(2000);
		}


	@When("^Stocks Click to login buttons$")
	public void stocks_Click_to_login_buttons() throws Throwable {
		driver.findElement(By.id("loginsubmit")).click();
		   Thread.sleep(2000);
	}

	@When("^Stocks Click to Addstocks$")
	public void stocks_Click_to_Addstocks() throws Throwable {
		driver.findElement(By.id("addStock")).click();
	}

	@When("^Stocks Stockname as \"([^\"]*)\" and Dateofpurchase as \"([^\"]*)\" and Quantity as \"([^\"]*)\" and Purchaseprice as \"([^\"]*)\"$")
	public void stocks_Stockname_as_and_Dateofpurchase_as_and_Quantity_as_and_Purchaseprice_as(String Sname, String Date, String Quantity, String Purchase) throws Throwable {
		Actions ac = new Actions(driver);
		driver.findElement(By.name("addstockname")).sendKeys(Sname);
	   Thread.sleep(2000);
	   ac.sendKeys(Keys.ARROW_DOWN).perform();
	   ac.sendKeys(Keys.ENTER).perform();
	   Thread.sleep(2000);
	   driver.findElement(By.name("stockAddDate")).sendKeys(Date);
	   driver.findElement(By.name("addstockqty")).sendKeys(Quantity);
	   driver.findElement(By.name("addstockprice")).sendKeys(Purchase);
	   Thread.sleep(2000);
	}

	@When("^Stocks Click to Add button$")
	public void stocks_Click_to_Add_button() throws Throwable {
		driver.findElement(By.xpath("(//input[@title='Submit'])[3]")).click();
	    Thread.sleep(2000); 
	}

	@When("^Stock Click the radio button$")
	public void stock_Click_the_radio_button() throws Throwable {
		 driver.findElement(By.xpath("(//input[@class='radio company-id rdmfid'])[1]")).click();
		   Thread.sleep(2000);
		}

	@When("^Stock Click the delete$")
	public void stock_Click_the_delete() throws Throwable {
		driver.findElement(By.xpath("(//input[@class='deleteEquity'])[1]")).click();
	    Thread.sleep(2000);
	}
	@When("^Stock Click the Ok button$")
	public void stock_Click_the_Ok_button() throws Throwable {
		  driver.switchTo().alert().accept();
		   Thread.sleep(4000);
		}

	@Then("^Stocks Close br$")
	public void stocks_Close_br() throws Throwable {
	    driver.close();
	}
	@Before
	public void Setup() {
		driver = new ChromeDriver();
		   driver.manage().window().maximize();
	}

	@Given("^Stocks navigate the Rediffmoney Url$")
	public void stocks_navigate_the_Rediffmoney_Url() throws Throwable {
	
		   driver.get("https://money.rediff.com/index.html");
		   Thread.sleep(2000);
	}

	@When("^Stock Click to SignIn button$")
	public void stock_Click_to_SignIn_button() throws Throwable {
		driver.findElement(By.linkText("Sign In")).click();
		 Thread.sleep(2000);
	}


	@When("^Stock login Using Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void stock_login_Using_Username_as_and_Password_as(String user, String pass) throws Throwable {
		driver.findElement(By.name("email-id")).sendKeys(user);
		   driver.findElement(By.name("passwd")).sendKeys(pass);
		   Thread.sleep(2000);
	}   

	@When("^Stock Click to login button$")
	public void stock_Click_to_login_button() throws Throwable {
		driver.findElement(By.id("loginsubmit")).click();
		   Thread.sleep(2000);
	}

	@When("^Stock  Click to MutuaLfunds$")
	public void stock_Click_to_MutuaLfunds() throws Throwable {
		 driver.findElement(By.id("addmf")).click();
		    Thread.sleep(2000);
		}
	

	@When("^Stock Enter the MFname as \"([^\"]*)\" and IAmount as \"([^\"]*)\" and Date as \"([^\"]*)\" and Price as \"([^\"]*)\"$")
	public void stock_Enter_the_MFname_as_and_IAmount_as_and_Date_as_and_Price_as(String MFname, String IAmount, String Date, String Price) throws Throwable {
		Actions bc = new Actions(driver);
	    driver.findElement(By.name("mfname")).sendKeys(MFname);
	    Thread.sleep(3000);
	    bc.sendKeys(Keys.ARROW_DOWN).perform();
	    bc.sendKeys(Keys.ENTER).perform();
	    Thread.sleep(2000);
	    driver.findElement(By.name("mfinitialAmt")).sendKeys(IAmount);
	    driver.findElement(By.name("addMFDate")).sendKeys(Date);
	    driver.findElement(By.name("mfprice")).sendKeys(Price);
	    Thread.sleep(2000);
	}


	@When("^Stock Click the AddMf button$")
	public void stock_Click_the_AddMf_button() throws Throwable {
		driver.findElement(By.id("addMFButton")).click();
	    Thread.sleep(5000);
	}
	@When("^Stock Click the  Radio$")
	public void stock_Click_the_Radio() throws Throwable {
		driver.findElement(By.xpath("(//input[@name='rdmfid'])[1]")).click();
		  Thread.sleep(2000);
	}

		  @When("^Stock Click the Delete$")
		  public void stock_Click_the_Delete() throws Throwable {
			  driver.findElement(By.xpath("//input[@class='deleteMutualFund']")).click();
			   Thread.sleep(2000);
			}

		  @When("^Stock Click the oK button$")
		  public void stock_Click_the_oK_button() throws Throwable {
		     driver.switchTo().alert().accept();


		}
		 

	@Then("^Stock Close br$")
	public void stock_Close_br() throws Throwable {
	    driver.close();
	}
	 @After public void cleanup() {
		  driver.close();
	  }

	@Given("^Stock navigate the Rediffmoney Url$")
	public void stock_navigate_the_Rediffmoney_Url() throws Throwable {
		driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://money.rediff.com/index.html");
		   Thread.sleep(2000);
	}

	@When("^Stock Click To SignIn button$")
	public void stock_Click_To_SignIn_button() throws Throwable {
		driver.findElement(By.linkText("Sign In")).click();
		 Thread.sleep(2000);
	}

	@When("^Stock Click to My Whitelist$")
	public void stock_Click_to_My_Whitelist() throws Throwable {
		 driver.findElement(By.linkText("My Watchlist")).click();
		    Thread.sleep(2000);
		}
	@When("^Stock Click to Addstocks button$")
	public void stock_Click_to_Addstocks_button() throws Throwable {
		 driver.findElement(By.id("add-stock-button")).click();
		   Thread.sleep(1000);
		}
	@When("^Stock Enter the Stockname as \"([^\"]*)\" and GoesAbove as\"([^\"]*)\" and Goesdown as \"([^\"]*)\"$")
	public void stock_Enter_the_Stockname_as_and_GoesAbove_as_and_Goesdown_as(String Sname, String Gabove, String Gdown) throws Throwable {
		  Actions kc = new Actions(driver);
		   driver.findElement(By.name("stocksearch")).sendKeys(Sname);
		   Thread.sleep(2000);
		   kc.sendKeys(Keys.ARROW_DOWN).perform();
		   kc.sendKeys(Keys.ENTER).perform();
		   Thread.sleep(2000);
		   driver.findElement(By.name("maxprice")).sendKeys(Gabove);
		   driver.findElement(By.name("minprice")).sendKeys(Gdown);
		   Thread.sleep(2000);
		}

	@When("^Stock Click to Add button$")
	public void stock_Click_to_Add_button() throws Throwable {
		driver.findElement(By.id("add-stock-submit")).click();
	    Thread.sleep(2000); 
	    
	    
	}
	@When("^Stock Click to Cross Symbol$")
	public void stock_Click_to_Cross_Symbol() throws Throwable {
		   driver.findElement(By.xpath("(//img[@alt='Delete'])[1]")).click();
		   Thread.sleep(2000);
		}
	@When("^Stock Click to Yes buton$")
	public void stock_Click_to_Yes_buton() throws Throwable {
		driver.findElement(By.xpath("(//a[normalize-space()='Yes'])[1]")).click();
		   Thread.sleep(2000);
		}


	@Given("^user Nvaigate the amazon login Url$")
	public void user_Nvaigate_the_amazon_login_Url() throws Throwable {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	
	
	}
		@When("^user Click the HOme&Account$")
	public void user_Click_the_HOme_Account() throws Throwable {
	    driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']")).click();
	    Thread.sleep(2000);
	}

	

	@When("^user Using the Usernmae as\"([^\"]*)\"$")
	public void user_Using_the_Usernmae_as(String user) throws Throwable {
	    driver.findElement(By.id("ap_email")).sendKeys(user);
	    Thread.sleep(1000);
	}

	@When("^user Click the Contonue button$")
	public void user_Click_the_Contonue_button() throws Throwable {
	    driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	    Thread.sleep(1000);
	}

	@When("^user Using  Password as \"([^\"]*)\"$")
	public void user_Using_Password_as(String pass) throws Throwable {
	  driver.findElement(By.id("ap_password")).sendKeys(pass);
	  Thread.sleep(1000);
	}

	@When("^User Using Login button$")
	public void user_Using_Login_button() throws Throwable {
	   driver.findElement(By.id("signInSubmit")).click();
	   Thread.sleep(2000);
	}

	

	@When("^user Using in Enter data as \"([^\"]*)\"$")
	public void user_Using_in_Enter_data_as(String data) throws Throwable {
	 driver.findElement(By.xpath("(//input[@name='field-keywords'])[1]")).sendKeys(data); 
	 Thread.sleep(3000);
	}

	@When("^user click to search$")
	public void user_click_to_search() throws Throwable {
	   driver.findElement(By.xpath("(//input[@value='Go'])[1]")).click();
	}

	@When("^user Click the item$")
	public void user_Click_the_item() throws Throwable {
	  driver.findElement(By.xpath("(//img[@alt='Samsung Galaxy M12 (Black,4GB RAM, 64GB Storage) 6000 mAh with 8nm Processor | True 48 MP Quad Camera | 90Hz Refresh Rate'])[1]")).click();
	  /*Actions vc = new Actions(driver);
	  vc.sendKeys(Keys.ENTER).click();*/
	  Thread.sleep(2000);
	}

	@When("^user Click the Buynow button$")
	public void user_Click_the_Buynow_button() throws Throwable {
	   driver.findElement(By.xpath("(//input[@data-hover='Select <b>__dims__</b> from the left<br> to Buy'])[1]")).click();
	   Thread.sleep(2000);
	}

	@When("^user Click the Pay on delivery button$")
	public void user_Click_the_Pay_on_delivery_button() throws Throwable {
	   driver.findElement(By.xpath("(//input[@value='instrumentId=0h_PE_CUS_18b1c868-2e63-40e2-8b24-414fe05d88c8%2FCash&isExpired=false&paymentMethod=COD&tfxEligible=false'])[1]")).click();
	   Thread.sleep(1000);
	}

	@When("^user click the continue$")
	public void user_click_the_continue() throws Throwable {
	    driver.findElement(By.xpath("(//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent'])[3]")).click();
	    Thread.sleep(2000);
	}

	@When("^user Click to PlaceOrder$")
	public void user_Click_to_PlaceOrder() throws Throwable {
	 driver.findElement(By.name("placeYourOrder1")).click();
	 Thread.sleep(2000);
	}

	

	@Then("^user Close br$")
	public void user_Close_br() throws Throwable {
	   driver.close();
	}

	@Given("^user navigate the yatara url$")
	public void user_navigate_the_yatara_url() throws Throwable {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.yatra.com/hotels");
	}

	@When("^user Click the MyAccount$")
	public void user_Click_the_MyAccount() throws Throwable {
	    driver.findElement(By.xpath("(//a[contains(text(),'My Account')])[1]")).click();
	}

	@When("^user Clcik the Signup button$")
	public void user_Clcik_the_Signup_button() throws Throwable {
	 driver.findElement(By.xpath("//a[@title='Sign Up']")).click();
	 Thread.sleep(2000);
	}

	@When("^user Using the Username as \"([^\"]*)\"$")
	public void user_Using_the_Username_as(String user) throws Throwable {
	    driver.findElement(By.xpath("(//input[@placeholder='Email ID / Mobile Number'])[1]")).sendKeys(user);
	}

	@When("^user Click the Continue$")
	public void user_Click_the_Continue() throws Throwable {
	    driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Continue'])[1]")).click();
	    Thread.sleep(2000);
	}

	@When("^user Using thr Password as \"([^\"]*)\"$")
	public void user_Using_thr_Password_as(String pass) throws Throwable {
	   driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(pass);
	   Thread.sleep(2000);
	}

	@When("^user Click the Login button$")
	public void user_Click_the_Login_button() throws Throwable {
	   driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	   Thread.sleep(2000);
	}
	@When("^user Click the Hotel$")
	public void user_Click_the_Hotel() throws Throwable {
	    driver.findElement(By.xpath("//span[@class='demo-icon icon-hotels']")).click();
	    Thread.sleep(2000);
	}

	@When("^user Enter Cityname as \"([^\"]*)\" and Check-In as \"([^\"]*)\" and Check-Out as \"([^\"]*)\"$")
	public void user_Enter_Cityname_as_and_Check_In_as_and_Check_Out_as(String City, String Date, String date) throws Throwable {
	   Actions Sc = new Actions(driver);
	   driver.findElement(By.xpath("//input[@name='BE_hotel_destination']")).sendKeys(City);
	   Sc.sendKeys(Keys.ENTER).perform();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//input[@name='hotel_checkin_date'])[1]")).sendKeys(Date);
	   Sc.sendKeys(Keys.ENTER).perform();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//input[@name='hotel_checkin_date'])[1]")).sendKeys(date);
	   Sc.sendKeys(Keys.ENTER).perform();
	   Thread.sleep(2000);
	}

	@When("^user Click the search$")
	public void user_Click_the_search() throws Throwable {
	   driver.findElement(By.xpath("//input[@value='Search Hotels']")).click();
	   Thread.sleep(2000);
	}

	@When("^user Click the Choose room$")
	public void user_Click_the_Choose_room() throws Throwable {
	    driver.findElement(By.xpath("(//span[@class='new-blue-button medium choose-room-button nowrap ng-binding'][normalize-space()='Choose Room'])[1]")).click();
	    Thread.sleep(2000);
	}

	@When("^user Click the chooseRoom butoon$")
	public void user_Click_the_chooseRoom_butoon() throws Throwable {
	    driver.findElement(By.name("//div[@ng-if='hasRooms']//span[@class='fr btn new-blue-button'][normalize-space()='Choose Room']")).click();
	}

	@Then("^user close br$")
	public void user_close_br() throws Throwable {
	   driver.close();
	}
	@Given("^user navigate the Url of facebook$")
	public void user_navigate_the_Url_of_facebook() throws Throwable {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.facebook.com/");
	}

	@When("^user login the Username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_login_the_Username_as_and_password_as(String Username, String password) throws Throwable {
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Username);
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	   
	}

	@When("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
	    driver.findElement(By.xpath("//button[@value='1']")).click();
	    driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}

	@When("^user click the yourProfile$")
	public void user_click_the_yourProfile() throws Throwable {
		Thread.sleep(5000);
	  driver.findElement(By.xpath("(//*[name()='image'])[1]")).click();
	 Thread.sleep(3000);
	 String Pagetitle = driver.getTitle();
	 System.out.println("Page Tittle is ::"+Pagetitle);
	  
	}

	@When("^user click the logout button$")
	public void user_click_the_logout_button() throws Throwable {
	    driver.findElement(By.xpath("(//div[@class='gs1a9yip ow4ym5g4 auili1gw rq0escxv j83agx80 cbu4d94t buofh1pr g5gj957u i1fnvgqd oygrvhab cxmmr5t8 hcukyx3x kvgmc6g5 tgvbjcpo hpfvmrgz rz4wbd8a a8nywdso l9j0dhe7 du4w35lb rj1gh0hx pybr56ya f10w8fjw'])[6]")).click();
	}

	@Then("^user closebr$")
	public void user_closebr() throws Throwable {
	   driver.close();
	}




}
