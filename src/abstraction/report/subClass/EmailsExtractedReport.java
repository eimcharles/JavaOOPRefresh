package abstraction.report.subClass;

import abstraction.report.base.ExtractedReport;

import java.util.regex.Pattern;

public class EmailsExtractedReport extends ExtractedReport {

    /**
     *      The EmailsExtractedReport class implements
     *      specific differences in behaviors:
     *
     *      - getPattern()
     *      - getReportName()
     *      - clean()
     *
     *      Pattern is a regular expression
     *      to validate standard email addresses.
     * */

    // Compiles it once, and every instance of the class can reuse the same compiled pattern (one pattern in memory)
    private static final Pattern PATTERN = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    // Subclass defines what pattern it wants to use
    @Override
    protected Pattern getPattern() {
        return PATTERN;
    }

    @Override
    protected String getReportName() {
        return "EmailsExtractedReport";
    }

    // Subclass defines how it wants to clean
    @Override
    protected String clean(String input) {
        return input.toLowerCase();
    }
}
