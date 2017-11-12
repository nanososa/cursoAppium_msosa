package com.belatrix.connect.page;

import org.openqa.selenium.By;

import com.belatrix.connect.framework.ParentPage;

import io.appium.java_client.AppiumDriver;

public class EventsPage extends ParentPage {

    public EventsPage(AppiumDriver driver) {
        super(driver);
    }
    
    By EVENT;

    By BTN_EVENT_MORE = By
    		.xpath("//android.widget.Button[@resource-id='com.belatrixsf.connect:id/event_more_button' and @instance='2']");
    
    By BTN_REGISTER = By
    		.xpath("//android.widget.Button[@text='Register']");

    By BTN_REGISTERED = By
    		.xpath("//android.widget.Button[@text='Registered']");


    public void clickEventMore(){
        click(BTN_EVENT_MORE);
    }

    public void clickEvent(String title){
         EVENT = By.xpath("//android.widget.TextView[@resource-id='com.belatrixsf.connect:id/event_title' and contains(@text,'" + title + "')]");
         handlingWaitToElement(EVENT);
         click(EVENT);
    }

    public void registerToEvent(){
        click(BTN_REGISTER);
    }

    public void unregisterToEvent(){
        //handlingWaitToElement(BTN_REGISTERED);
        click(BTN_REGISTERED);
    }

}
