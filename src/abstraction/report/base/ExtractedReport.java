package abstraction.report.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class ExtractedReport {

    /**
     *          The purpose of an abstract class is
     *          to function as a base for subclass.
     *
     *          Extracted report contains common functionality to
     *          parseReport and prepareAndSend a report.
     *
     *          Encapsulates some common functionality in one place
     *          and lets subclasses implement differences:
     *
     *          - getPattern()
     *          - getReportName()
     *          - clean()
     *
     *          Avoids code duplication and increases reusability.
     * */

    protected abstract Pattern getPattern();
    protected abstract String getReportName();
    protected abstract String clean(String input);

    private String parseReport(String path) throws FileNotFoundException {

        // Matching output string concatenated
        String out = "";

        File file = new File(path);

        Scanner scanner = new Scanner(file);

        // Skips the header in the Data.txt file
        if (scanner.hasNextLine()){
            String header = scanner.nextLine();
        } else {
            return "Empty file";
        }

        while (scanner.hasNextLine()){
            // Get the data per line
            String dataPerLine = scanner.nextLine();

            // Check the data against the defined pattern in subclass (Polymorphism)
            Matcher matcher = getPattern().matcher(dataPerLine);

            // if the data matches the pattern - true, else false
            boolean matches = matcher.matches();

            // Concatenate the matching data to a string - add new line after data is added
            if (matches){

                // Clean the data against the defined clean method in subclass (Polymorphism)
                out += clean(dataPerLine + "\n");
            }
        }

        // if file is empty return "Empty file", else return matching data
        return out.isBlank() ? "Empty file" : out;
    }

    public void prepareAndSendReport(String path) throws FileNotFoundException {
        System.out.println("Sent report: " + getReportName());
        String reportToSend = parseReport(path);
        System.out.println(reportToSend);
    }

}
