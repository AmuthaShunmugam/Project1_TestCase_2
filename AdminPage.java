package com.ibm.pages;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {
	//Following are the Xpath from the page
	//To give the login mail id
	@FindBy (xpath="//input[@name='email']")
	WebElement Emailele;
	
	//To give the password 
	@FindBy (xpath="//input[@name='pword']")
	WebElement PasswordEle;
	
	//To click on the login button
	@FindBy (xpath="//button[@class='btn btn-labeled btn-info m-b-5']")
	WebElement LoginButtonEle;
	
	//To click on the Catalog Tab
	@FindBy (xpath="//a[@href='#']")
	WebElement CatalogTabEle;
	
    //To click on the 'Tab' under 'Catalog' 
	@FindBy(xpath="//a[text()=' Tabs']")
     WebElement TabButtonEle;

	//To click on the 'Add new' button 
    @FindBy(xpath="//a[@title='Add New']")
    WebElement AddButtonEle;
    
    //To enter the name while adding a new tab or modifying tab 
    @FindBy(xpath="//input[@name='name']")
    WebElement TabnameEle;
    
    //To enter the sort order while adding or modifying the tab name
    @FindBy(xpath="//input[@name='sort']")
    WebElement SortELe;
    
    //To change the status 
    @FindBy(xpath="//select[@name='status']/option[3]")
    WebElement StatusEle;

    //To save the content 
    @FindBy(xpath="//button[@title='Save']")
    WebElement SaveEle;
    
    //To click on the action in 'Tab'
    @FindBy(xpath="//table[@id='dataTableExample2']/tbody/tr/td[5]/div/button[1]")
    WebElement ActionEle;
    
    //To click on the Edit button in 'Action'
    @FindBy(xpath="//table[@id='dataTableExample2']/tbody/tr/td[5]/div/ul/li/a[1]")
    WebElement EditEle;
	
    //To click on the 'Product image' under 'Catalog'
	@FindBy(xpath="//a[text()=' Product Image']")
    WebElement ProductImageEle;
	
	//To Search for grain on the 'Product Image' page
	@FindBy(xpath="//input[@type='search']")
	WebElement SearchEle;
    
     //To click on the login path
     @FindBy(xpath="//a[@title='Logout']")
     WebElement LogoutEle;
     
     
    //For using webdriver
 	public AdminPage(WebDriver driver)
 	{PageFactory.initElements(driver, this);}

	public void EnetrEmailAddress(String userName)
	{Emailele.sendKeys(userName);}
	
	public void EnetrPassword(String password)
	{PasswordEle.sendKeys(password);}
	
	public void ClickonLoginButton()
	{LoginButtonEle.click();}
	
	public void ClickonCatalogTabButton()
	{CatalogTabEle.click();}
	
	public void ClickonTabButton()
	{TabButtonEle.click();}
	
	public void ClickonAddButton()
	{AddButtonEle.click();}
	
	public void EntertheTabName()
	{TabnameEle.clear();
	TabnameEle.sendKeys("##AABB");}
	
	public void EnetrtheSortOrder()
	{SortELe.clear();
	SortELe.sendKeys("1");}
	
	public void EntertheStatus()
	{StatusEle.click();}
	
	public void ClickonTheSaveButton()
	{
		SaveEle.click();
		
	}
	
	public void ClickonAction()
	{
		ActionEle.click();
	}
	
	public void ClickonEditButton()
	{
		EditEle.click();
		
	}
	
	public void ClickonProductImage()
	{ProductImageEle.click();}
	
	public void EnterSerachEle()
	{
		SearchEle.sendKeys("grain");
	}
	
	public void ClickonLogoutButton()
	{
		LogoutEle.click();
		
	}
}
