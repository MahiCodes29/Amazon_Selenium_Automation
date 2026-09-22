package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {

    public static String takeScreenshot(WebDriver driver, String testName) {

        String timeStamp =
                new SimpleDateFormat("yyyyMMdd_HHmmss")
                .format(new Date());

        String folderPath = "screenshots";

        File folder = new File(folderPath);

        if (!folder.exists()) {
            folder.mkdirs();
        }

        String fileName =
                testName + "_" + timeStamp + ".png";

        Path destination =
                Paths.get(folderPath, fileName);

        File source =
                ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);

        try {

            Files.copy(
                source.toPath(),
                destination
            );

        } catch (IOException e) {

            e.printStackTrace();
        }

        return destination.toString();
    }
}