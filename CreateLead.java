package Week3Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String args[]) {
        // declaration and instantiation of objects/variables

	   ChromeOptions options = new ChromeOptions();
	   WebDriverManager.chromedriver().setup();
	   options.addArguments("--remote-allow-origins=*");
	   //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");  
	   WebDriver driver = new ChromeDriver(options);
	  driver.get("http://leaftaps.com/opentaps/control/login");
	// declaration and instantiation of objects/variables  
//	   hari.radhakrishnan@qeagle.com
//	   Leaf$1234
	   driver.manage().window().maximize();
	  WebElement username = driver.findElement(By.id("username"));
	  username.sendKeys("demoSalesManager");
	  WebElement password = driver.findElement(By.id("password"));
	  password.sendKeys("crmsfa");
	  WebElement login = driver.findElement(By.className("decorativeSubmit"));
	  login.click();
	 WebElement  Linktext =driver.findElement(By.linkText("CRM/SFA"));
	 Linktext.click();
	 WebElement  LeadsLink =driver.findElement(By.linkText("Leads"));
	 LeadsLink.click();
	 WebElement CreateLeadLink = driver.findElement(By.linkText("Create Lead"));
	 CreateLeadLink.click();
	 WebElement EnterCompanyName  = driver.findElement(By.id("createLeadForm_companyName"));
	 EnterCompanyName.sendKeys("TestLeaf");
	 WebElement EnterFirstname  = driver.findElement(By.id("createLeadForm_firstName"));
	 EnterFirstname.sendKeys("TestLeaf");
	 WebElement EnterLastName  = driver.findElement(By.id("createLeadForm_lastName"));
	 EnterLastName.sendKeys("TestLeaf");
	 WebElement EnterFirstnameLocal  = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	 EnterFirstnameLocal.sendKeys("TestLeaf");
	 WebElement EnterLastNameLocal  = driver.findElement(By.id("createLeadForm_lastNameLocal"));
	 EnterLastNameLocal.sendKeys("TestLeaf");
	 WebElement EnterDepatment  = driver.findElement(By.id("createLeadForm_departmentName"));
	 EnterDepatment.sendKeys("TestLeaf");
	 WebElement EnterDescription  = driver.findElement(By.id("createLeadForm_description"));
	 EnterDescription.sendKeys("TestLeaf");
	 JavascriptExecutor js = (JavascriptExecutor)driver;		
     js.executeScript("window.scrollBy(0,400)");
     WebElement EnterEmail  = driver.findElement(By.id("createLeadForm_primaryEmail"));
     EnterEmail.sendKeys("TestLeaf@gmail.com");
     WebElement ClickCreateButton = driver.findElement(By.className("smallSubmit"));
     ClickCreateButton.click();
    String title= driver.getTitle();
    title.equals("View Lead");
    driver.close();
}
}