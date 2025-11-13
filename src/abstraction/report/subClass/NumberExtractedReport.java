package abstraction.report.subClass;

import abstraction.report.base.ExtractedReport;

import java.util.regex.Pattern;

public class NumberExtractedReport extends ExtractedReport {

    /**
     *      The NumberExtractedReport class implements
     *      specific differences in behaviors:
     *
     *      - getPattern()
     *      - getReportName()
     *      - clean()
     *
     *      Pattern is a regular expression pattern
     *      to validate that the input only contains digits.
     *
     * */

    // Compiles it once, and every instance of the class can reuse the same compiled pattern (one pattern in memory)
    private static final Pattern PATTERN = Pattern.compile("^[0-9]+$");

    // Subclass defines what pattern it wants to use
    @Override
    protected Pattern getPattern() {
        return PATTERN;
    }

    @Override
    protected String getReportName() {
        return "NumberExtractedReport";
    }

    // Subclass defines how it wants to clean
    @Override
    protected String clean(String input) {
        return input;
    }
}
