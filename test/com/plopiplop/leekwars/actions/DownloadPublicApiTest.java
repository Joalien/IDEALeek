package com.plopiplop.leekwars.actions;

import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;
import com.plopiplop.leekwars.apiclient.ApiException;
import com.plopiplop.leekwars.apiclient.LeekWarsApiClient;
import com.plopiplop.leekwars.options.LSSettings;
import com.plopiplop.leekwars.options.PluginNotConfiguredException;

import java.io.IOException;

public class DownloadPublicApiTest extends LightCodeInsightFixtureTestCase {

    public DownloadPublicApiTest() {
        LSSettings.getInstance().siteLogin = System.getenv("LKS_LOGIN");
        LSSettings.getInstance().sitePassword = System.getenv("LKS_PASSWORD");
    }

    public void testFetchingWeapons() throws IOException, PluginNotConfiguredException, ApiException {
        assertNotEmpty(LeekWarsApiClient.getInstance().getWeapons());
    }

    public void testFetchingChips() throws IOException, PluginNotConfiguredException, ApiException {
        assertNotEmpty(LeekWarsApiClient.getInstance().getChips());
    }

    public void testFetchingConstants() throws IOException, PluginNotConfiguredException, ApiException {
        assertNotEmpty(LeekWarsApiClient.getInstance().getConstants());
    }

    public void testFetchingFunctions() throws IOException, PluginNotConfiguredException, ApiException {
        assertNotEmpty(LeekWarsApiClient.getInstance().getFunctions());
    }

}
