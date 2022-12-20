package com.dotdash.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxPage extends BasePage{

    @FindBy(xpath = "//input[1]")
    public WebElement checkbox1;

    @FindBy(xpath = "//input[2]")
    public WebElement checkbox2;
}
