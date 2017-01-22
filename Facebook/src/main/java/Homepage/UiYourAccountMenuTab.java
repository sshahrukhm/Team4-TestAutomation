package Homepage;

import ActivityLog.UiActivityLog;
import CreateAds.UiCreateAds;
import CreateGroup.UiCreateGroup;
import CreatePage.UiCreatePage;
import Help.UiHelp;
import LandingPage.UiLandingPage;
import ManageAds.UiManageAds;
import ManagePages.UiManagePages;
import NewGroups.UiNewGroups;
import NewsFeedPreferences.UiNewsFeedPreferences;
import ReportProblem.UiReportProblem;
import Settings.UiSettings;
import SupportInbox.UiSupportInbox;
import methods.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 19-01-2017.
 */
public class UiYourAccountMenuTab extends UiMenuBar {
    WebDriver localDriver = super.localDriver;

    @FindBy(how = How.XPATH,using=".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[position()>last()-17]/a")
    List<WebElement> elements = new ArrayList<>();

    public UiCreatePage getCreatePage(){
        elements.get(0).click();
        //UiCreatePage uiCreatePage = PageFactory.initElements(driver, UiCreatePage.class);
        return PageFactory.initElements(this.localDriver, UiCreatePage.class);
    }
    public UiManagePages getManagePages(){
        elements.get(1).click();
        return PageFactory.initElements(this.localDriver, UiManagePages.class);
    }
    public UiCreateGroup getCreateGroup() throws InterruptedException {
        elements.get(2).click();
        sleepFor(1);
        return PageFactory.initElements(this.localDriver, UiCreateGroup.class);
    }
    public UiNewGroups getNewGroups(){
        elements.get(3).click();
        return PageFactory.initElements(this.localDriver, UiNewGroups.class);
    }
    public UiCreateAds getCreateAds(){
        elements.get(4).click();
        return PageFactory.initElements(this.localDriver, UiCreateAds.class);
    }
    public UiManageAds getManageAds(){
        elements.get(5).click();
        return PageFactory.initElements(this.localDriver, UiManageAds.class);
    }
    public UiActivityLog getActivityLog(){
        elements.get(6).click();
        return PageFactory.initElements(this.localDriver, UiActivityLog.class);
    }
    public UiNewsFeedPreferences getNewsFeedPreferences() throws InterruptedException {
        elements.get(7).click();
        sleepFor(1);
        return PageFactory.initElements(this.localDriver, UiNewsFeedPreferences.class);
    }
    public UiSettings getSettings(){
        elements.get(8).click();
        return PageFactory.initElements(this.localDriver, UiSettings.class);
    }
    public UiLandingPage getLogout(){
        elements.get(9).click();
        return PageFactory.initElements(this.localDriver,UiLandingPage.class);
    }
    public UiHelp getHelp(){
        elements.get(10).click();
        return PageFactory.initElements(this.localDriver, UiHelp.class);
    }
    public UiSupportInbox getSupportInbox(){
        elements.get(11).click();
        return PageFactory.initElements(this.localDriver, UiSupportInbox.class);
    }
    public UiReportProblem getReportProblem() throws InterruptedException {
        elements.get(12).click();
        sleepFor(1);
        return PageFactory.initElements(this.localDriver, UiReportProblem.class);
    }


}
