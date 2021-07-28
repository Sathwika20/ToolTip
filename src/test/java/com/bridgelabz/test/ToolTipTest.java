package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.utilily.ToolTip;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTipTest extends Base {
    @Test
    public static void getToolTipText() throws InterruptedException {
        ToolTip toolTip = new ToolTip();
        toolTip.verifyToolTip();

    }

}
