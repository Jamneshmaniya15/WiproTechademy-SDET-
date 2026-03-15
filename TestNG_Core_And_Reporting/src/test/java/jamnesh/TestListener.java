package jamnesh;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest test = ExtentReportManager.getInstance()
                .createTest(result.getName());
        ExtentReportManager.setTest(test);
        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentReportManager.getTest().log(Status.PASS, "Test Passed");
        System.out.println("Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentReportManager.getTest().log(Status.FAIL, result.getThrowable());

        // Capture screenshot and attach to report
        Object instance = result.getInstance();
        if (instance instanceof LoginFunctionalityAutomation) {
            LoginFunctionalityAutomation loginTest = (LoginFunctionalityAutomation) instance;
            ScreenshotUtil.captureOnFailure(loginTest.driver, result);
            ExtentReportManager.getTest().log(Status.FAIL,
                "Screenshot saved in /screenshots folder");
        }

        System.out.println("Test Failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentReportManager.getTest().log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onFinish(org.testng.ITestContext context) {
        ExtentReportManager.flush();
        System.out.println("Report generated at: reports/TestReport.html");
    }
}