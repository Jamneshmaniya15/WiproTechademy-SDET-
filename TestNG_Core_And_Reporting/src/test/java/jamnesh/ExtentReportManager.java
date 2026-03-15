package jamnesh;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public static ExtentReports getInstance() {
        if (extent == null) {
            ExtentSparkReporter spark = new ExtentSparkReporter("reports/TestReport.html");
            spark.config().setReportName("Login Test Report");
            spark.config().setDocumentTitle("Automation Report");
            extent = new ExtentReports();
            extent.attachReporter(spark);
        }
        return extent;
    }

 // Saves the current test so we can add logs to it later
    public static void setTest(ExtentTest extentTest) {
        test.set(extentTest);
    }

 // Gets the current test so we can log pass or fail to it
    public static ExtentTest getTest() {
        return test.get();
    }
 // Saves and closes the report after all tests are done
    public static void flush() {
        if (extent != null) extent.flush();
    }
}