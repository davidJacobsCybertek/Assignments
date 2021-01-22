package com.cybertek.tests.Homeworks.VyTrackHw1;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class VyTrackHw1Tests extends TestBase {

    @Test
    public void test1(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();
//        Driver.get().get("https://qa1.vytrack.com/calendar/event");
//        String Obg = Driver.get().findElement(By.xpath("(//*[@class='dib'])[2]")).getText();
//        System.out.println(Obg);
        DashboardPage dashboardPage=new DashboardPage();
        BrowserUtils.waitFor(2);
        dashboardPage.navigateToModule("Activities","Calendar Events");
        CalendarEventsPage calendarEventsPage=new CalendarEventsPage();
        Assert.assertEquals(calendarEventsPage.subtitle.getText().trim(),"Options","verify subtitle");
    }
    @Test
    public void test2(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();
        DashboardPage dashboardPage=new DashboardPage();
        BrowserUtils.waitFor(2);
        dashboardPage.navigateToModule("Activities","Calendar Events");
        CalendarEventsPage calendarEventsPage=new CalendarEventsPage();
        Assert.assertTrue(calendarEventsPage.pageNumber.getAttribute("value").equals("1"));

    }

    @Test
    public void test3() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();
        DashboardPage dashboardPage = new DashboardPage();

        dashboardPage.navigateToModule("Activities", "Calendar Events");
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        BrowserUtils.waitFor(2);
        calendarEventsPage.viewPerPage.click();
        Assert.assertTrue(calendarEventsPage.viewPerPage.getText().equals("25"));

        //System.out.println("teteteteetexxtxxt"+Driver.get().findElement(By.xpath("//button[@data-toggle='dropdown'][@class='btn dropdown-toggle ']")).getText());

        //List<WebElement> dropDown = Driver.get().findElements(By.xpath("//*[@class='dropdown-item']"));
        //System.out.println("dropDown = " + dropDown.size());
        //System.out.println(dropDown.get(1));
        //System.out.println("if 25 selected  "+dropDown.get(3).isSelected());
        //Assert.assertTrue(calendarEventsPage.viewPerPage.getText().trim().equals("25"));
    }

    @Test
    public void test4() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities", "Calendar Events");

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        calendarEventsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(2);

        String totalPageNumberIndex = Driver.get().findElement(By.xpath("(//*[@class='dib'])[2]")).getText();
        String[] pageNumberArray = totalPageNumberIndex.split(" ");

        int lastPageNumber=Integer.parseInt(pageNumberArray[1]);
        int rowPerPage=Integer.parseInt(calendarEventsPage.viewPerPage.getText());
        int totalRowsMinusLastPage=(lastPageNumber-1)*rowPerPage;

        // go to last page
        calendarEventsPage.pageNumberEntry.sendKeys(pageNumberArray[1]);
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(2);
        calendarEventsPage.rightChevron.click();
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        //find out last page row amount
        List<WebElement> lastPagerows = Driver.get().findElements(By.xpath("//tbody//tr"));
        //find total rows in number
        int totalRows=totalRowsMinusLastPage+lastPagerows.size();
        //find total rows shown on the page
        String totalRowsShown = calendarEventsPage.totalRowsIndex.getText().split(" ")[2];
        //verify the row numbers are the same
        Assert.assertTrue(totalRows==Integer.parseInt(totalRowsShown),"verify total rows number");

    }
    @Test
    public void test5(){
            LoginPage loginPage = new LoginPage();
            loginPage.loginAsStoreManager();
            DashboardPage dashboardPage = new DashboardPage();
            dashboardPage.navigateToModule("Activities", "Calendar Events");

            CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

            calendarEventsPage.waitUntilLoaderScreenDisappear();
            BrowserUtils.waitFor(3);

            calendarEventsPage.headerCheckBox.click();

            List<WebElement> checkBoxes=Driver.get().findElements(By.xpath("//tbody//*[@type='checkbox']"));
            //equivalance sample check
            Assert.assertTrue(checkBoxes.get(2).isSelected(),"verify 2nd checkbox is selected");
            Assert.assertTrue(checkBoxes.get(24).isSelected(),"verify 25th checkbox is selected");
            boolean flag=false;
            for (WebElement checkBox : checkBoxes) {
                if(checkBox.isSelected()) {
                    flag = true;
                }else{
                    flag=false;
                    break;
                }
            Assert.assertTrue(flag,"verify all checkboxes are selected");
        }


    }
    @Test
    public void test6(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities", "Calendar Events");

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(1);
        //Filter events by title
        calendarEventsPage.filter.click();
        BrowserUtils.waitFor(1);
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.titleFilter.click();
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.titleContaonsTextBox.sendKeys("Testers meeting"+ Keys.ENTER);
        //select the event given in task
        calendarEventsPage.testersMeeting27Novat930AM.click();
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(1);
        //Assert through pagesourcecode
        Assert.assertTrue(Driver.get().getPageSource().contains("This is a a weekly testers meeting"));
        Assert.assertTrue(Driver.get().getPageSource().contains("Nov 27, 2020, 9:30 AM"));
        Assert.assertTrue(Driver.get().getPageSource().contains("Nov 27, 2020, 10:30 AM"));
        Assert.assertTrue(Driver.get().getPageSource().contains("Stephan Haley"));



    }

}
