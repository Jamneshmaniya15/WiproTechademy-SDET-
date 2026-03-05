package LOSJ;

import org.apache.logging.log4j.LogManager; // Correct import
import org.apache.logging.log4j.Logger;     // Correct import

public class LoginTest {
    
    // Optimized: Use LogManager instead of LoggerFactory
    private static final Logger log = LogManager.getLogger(LoginTest.class);

    public void login() {
        log.info("Login test started");
        log.warn("This is a warning message");
        log.error("Login failed due to invalid cred");
    }
}