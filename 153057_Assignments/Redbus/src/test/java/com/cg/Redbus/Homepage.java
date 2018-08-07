package com.cg.Redbus;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {
	@FindBy(how = How.ID, using = "src")
	WebElement src;
	/*
	 * @FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[1]/div/ul/li[5]")
	 * WebElement src1;
	 */
	@FindBy(how = How.ID, using = "dest")
	WebElement dest;
	/*
	 * @FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")
	 * WebElement dest1;
	 */
	@FindBy(how = How.ID, using = "onward_cal")
	WebElement boardingdate;
	@FindBy(how = How.XPATH, using = "//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[5]")
	WebElement boardingdate1;
	@FindBy(how = How.ID, using = "search_btn")
	WebElement search;
	@FindBy(how = How.XPATH, using = "//*[@id=\"9455434\"]/div/div[2]/div[1]")
	WebElement seats;

}
