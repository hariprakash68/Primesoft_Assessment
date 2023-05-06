package com.primesoft.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.primesoft.base.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver1, this);
	}
	
	@FindBy(xpath = "(//div[@class='logo ng-tns-c64-0 ng-star-inserted'])[2]")
	private WebElement aha_logo;
	
	@FindBy(xpath = "//h4[text() = 'Proceed']")
	private WebElement proceed_btn;
	
	@FindBy(xpath = "//h2[text() = 'Free Movies']")
	private WebElement freemovies_subtitle;
	
	@FindBy(xpath = "//button[@class='form__submit ng-star-inserted']")
	private WebElement watch_movie_btn;
	
	@FindBy(xpath = "//img[@alt='Android icon']")
	private WebElement playStore_link;
	
	@FindBy(xpath = "(//*[local-name()='svg' and @xmlns='http://www.w3.org/2000/svg'])[7]")
	private WebElement close_icon;
	
	//element for shadow root
	public WebElement movieShadowRoot() {
	WebElement root1 = driver.findElement(By.xpath("(//qp-plus-horizontal-list[@list-label-modifier='headline5'])[5]"));
	SearchContext shadowRoot =  root1.getShadowRoot();

	WebElement root2 = shadowRoot.findElement(By.cssSelector("qp-res-plus-card[class='hydrated']"));
	SearchContext shadowRoot1 =  root2.getShadowRoot();
	
	WebElement root3 = shadowRoot1.findElement(By.cssSelector("qp-card-content[class = 'hydrated']"));
	SearchContext shadowRoot2 =  root3.getShadowRoot();
	
	WebElement root4 = shadowRoot2.findElement(By.cssSelector("qp-image[class = 'hydrated']"));
	SearchContext shadowRoot3 =  root4.getShadowRoot();
	
	WebElement movie_shadowRoot = shadowRoot3.findElement(By.cssSelector("div[class='imgContainer']"));
	return movie_shadowRoot;
	
	}
	
	public WebElement getProceed_btn() {
		return proceed_btn;
	}

	public WebElement getPlayStore_link() {
		return playStore_link;
	}

	public WebElement getAha_logo() {
		return aha_logo;
	}

	public WebElement getWatch_movie_btn() {
		return watch_movie_btn;
	}

	public WebElement getFreemovies_subtitle() {
		return freemovies_subtitle;
	}

	public WebElement getClose_icon() {
		return close_icon;
	}
	
	

}
