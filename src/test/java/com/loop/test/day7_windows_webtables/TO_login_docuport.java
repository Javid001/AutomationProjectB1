package com.loop.test.day7_windows_webtables;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import org.testng.annotations.Test;

public class TO_login_docuport extends TestBase {

    @Test
    public void test_login_logout() throws InterruptedException {
        DocuportUtils.login(driver, DocuportConstants.SUPERVISOR);
        //DocuportUtils.logOut(driver);
    }
}
