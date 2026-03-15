package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {

    private static ExtentReports extent;

    // ThreadLocal — each browser/thread gets its own ExtentTest object
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    // ─── Called ONCE in @BeforeSuite ──────────────────────────────────────
    public static ExtentReports getInstance() {
        if (extent == null) {
            String projectPath = System.getProperty("user.dir");
            String reportPath  = projectPath + "/reports/ExtentReport.html";

            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
            sparkReporter.config().setTheme(Theme.DARK);
            sparkReporter.config().setDocumentTitle("ParaBank Automation Report");
            sparkReporter.config().setReportName("ParaBank — SDET Capstone");
            sparkReporter.config().setTimeStampFormat("dd MMM yyyy HH:mm:ss");

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);

            extent.setSystemInfo("Application",  "ParaBank");
            extent.setSystemInfo("Environment",  "QA");
            extent.setSystemInfo("Tester",        "Jamnesh Maniya");
            extent.setSystemInfo("Framework",     "Selenium + TestNG + POM");
            extent.setSystemInfo("OS",             System.getProperty("os.name"));
            extent.setSystemInfo("Java Version",   System.getProperty("java.version"));
        }
        return extent;
    }

    // ─── Creates a new test entry in the report ───────────────────────────
    public static ExtentTest createTest(String testName, String description) {
        ExtentTest extentTest = getInstance().createTest(testName, description);
        test.set(extentTest);
        return extentTest;
    }

    // ─── Returns the current thread's test ───────────────────────────────
    public static ExtentTest getTest() {
        return test.get();
    }

    // ─── Called ONCE in @AfterSuite to save report ────────────────────────
    public static void flushReport() {
        if (extent != null) {
            extent.flush();
        }
    }
}
