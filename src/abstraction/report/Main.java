package abstraction.report;

import abstraction.report.subClass.EmailsExtractedReport;
import abstraction.report.subClass.NumberExtractedReport;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        try {

            // Numbers extracted using the NumberExtractedReport base class for a specific number pattern
            new NumberExtractedReport().prepareAndSendReport("src/abstraction/report/data.txt");

            // Emails extracted using the EmailsExtractedReport base class for a specific email pattern
            new EmailsExtractedReport().prepareAndSendReport("src/abstraction/report/data.txt");

        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);

        }
    }
}
