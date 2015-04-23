package org.jenkinsci.demo;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class PetClinicAppTest {

    @Test
    public void testApp() throws IOException {        
        final WebClient webClient = new WebClient(BrowserVersion.FIREFOX_31);
        final HtmlPage page = webClient.getPage(getAppUrl());
        Assert.assertEquals("PetClinic :: a Spring Framework demonstration", page.getTitleText());
    }

    private String getAppUrl() {
        return "http://petclinic:8080/petclinic";
    }
}
