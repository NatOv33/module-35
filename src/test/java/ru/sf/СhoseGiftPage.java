package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class СhoseGiftPage {

    private final static String SECTION_SPAN_CLASS = "breadcrumb-banner_content-title";

    private final WebDriver webDriver;

    public СhoseGiftPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getCurrentSection() {
        return webDriver.findElement(By.className(SECTION_SPAN_CLASS)).getText();
    }
}