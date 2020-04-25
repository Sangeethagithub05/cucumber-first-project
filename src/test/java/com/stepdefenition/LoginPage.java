package com.stepdefenition;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ruuner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage extends BaseClass{
	//WebDriver driver;
	@Given("user is on the Adactin Hotel page")
	public void user_is_on_the_Adactin_Hotel_page() throws MalformedURLException {
		//launchBrowser();
		remote();
		loadurl("http://adactin.com/HotelApp/index.php");
	   
	}

	@When("user enters the {string} and {string}")
	public void user_enters_the_and(String s1, String s2) {
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
 	   type(userName, s1);
 	   WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
 	   type(password, s2);
 	   
	    
	}

	@When("user should click on the login page")
	public void user_should_click_on_the_login_page() {
		WebElement login=driver.findElement(By.className("login_button"));
	 	  btnclick(login);
		
	    
	}

	@When("user should select all the required details to book the Hotel {string},{string},{string},{string},{string}")
	public void user_should_select_all_the_required_details_to_book_the_Hotel(String fname, String lname, String baddess, String credit, String cvvnumber) throws InterruptedException {
		WebElement location= driver.findElement(By.xpath("//select[@id='location']"));
        dropDown(location, "Sydney");
       WebElement hotel= driver.findElement(By.xpath("//select[@id='hotels']"));
       dropDown(hotel, "Hotel Creek");
       WebElement roomtype=driver.findElement(By.xpath("//select[@id='room_type']"));
       dropDown(roomtype, "Double");
      WebElement roomno= driver.findElement(By.xpath("//select[@id='room_nos']"));
      dropDown(roomno, "2 - Two");
      WebElement childroom=driver.findElement(By.xpath("//select[@id='child_room']"));
      dropDown(childroom, "1 - One");
     WebElement search= driver.findElement(By.xpath("//input[@id='Submit']"));
     search.click(); 
     WebElement checkbox=driver.findElement(By.id("radiobutton_0"));
     btnclick(checkbox);
     WebElement continuebtn=driver.findElement(By.xpath("//input[@id='continue']"));
     btnclick(continuebtn);
     WebElement firstname=driver.findElement(By.xpath("//input[@name='first_name']"));
     type(firstname, fname);
     WebElement lastname=driver.findElement(By.xpath("//input[@name='last_name']"));
     type(lastname, lname);
     WebElement adress=driver.findElement(By.xpath("//textarea[@id='address']"));
     type(adress, baddess);
     WebElement ccnum=driver.findElement(By.xpath("//input[@name='cc_num']"));
     type(ccnum, credit);
    WebElement cctype= driver.findElement(By.id("cc_type"));
    dropDown(cctype, "American Express");
    WebElement month=driver.findElement(By.id("cc_exp_month"));
    dropDown(month, "June");
    WebElement year=driver.findElement(By.id("cc_exp_year"));
    dropDown(year, "2020");
    WebElement cvv=driver.findElement(By.id("cc_cvv"));
    type(cvv, cvvnumber);
    WebElement booknow=driver.findElement(By.id("book_now"));
    btnclick(booknow);
    Thread.sleep(5000);
	}

	@Then("user should verify the order number")
	public void user_should_verify_the_order_number() {
		WebElement order=driver.findElement(By.id("order_no"));
		ordernum(order);
		System.out.println(ordernum(order));
		
		
	    
	}









}
