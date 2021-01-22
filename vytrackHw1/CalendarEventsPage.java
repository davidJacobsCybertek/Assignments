package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsPage extends BasePage {

    public CalendarEventsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(xpath = "//div[@class='btn btn-link dropdown-toggle']")
    public WebElement subtitle;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement pageNumber;

    @FindBy(xpath = "//button[@data-toggle='dropdown'][@class='btn dropdown-toggle ']")
    public WebElement viewPerPage;

    @FindBy(xpath = "//input[@class='input-widget']")
    public WebElement pageNumberEntry;

    @FindBy(xpath = "//i[@class='fa-chevron-right hide-text']")
    public WebElement rightChevron;

    @FindBy(xpath = "//label[@class='dib'][3]")
    public WebElement totalRowsIndex;

    @FindBy(xpath = "//thead//*[@type='checkbox']")
    public WebElement headerCheckBox;
    @FindBy (xpath = "//a[@class='action btn mode-icon-only']")
    public  WebElement filter;
    @FindBy(xpath = "(//*[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value'])[1]")
    public WebElement titleFilter;
    @FindBy(xpath = "//input[@name='value']")
    public WebElement titleContaonsTextBox;
    @FindBy(xpath = "//*[contains(text(),'9:30')]/..")
    public WebElement testersMeeting27Novat930AM;
}