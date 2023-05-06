package com.primesoft.runner;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.primesoft.base.BaseClass;
import com.primesoft.pom.HomePage;

public class TestRunner extends BaseClass{
	
	static HomePage hp ;
	@BeforeSuite
	public void browserLaunch() {
		launchUrl("https://www.aha.video");	
	}
	
	@Test
	public void searchMovies() {
		hp = new HomePage(driver);
		clickOnElement(hp.getProceed_btn());
		implicitWait();
		scrollIntoElement(hp.getFreemovies_subtitle());
		
	}
	@Test
	public void watchMovies() throws InterruptedException {
		clickOnElement(hp.movieShadowRoot());
		clickOnElement(hp.getWatch_movie_btn());
		driver.navigate().back();
		clickOnElement(hp.getClose_icon());
		explicitWait(hp.getPlayStore_link());
		scrollIntoElement(hp.getPlayStore_link());
		clickOnElement(hp.getPlayStore_link());
		
	}
	
	

}
