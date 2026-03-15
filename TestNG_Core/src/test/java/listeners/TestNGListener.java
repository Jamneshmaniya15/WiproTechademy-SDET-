package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(" PASSED: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(" FAILED: " + result.getName());
        System.out.println("Reason: " + result.getThrowable().getMessage());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(" SKIPPED: " + result.getName());
    }
}