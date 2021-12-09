package teammates.common.datatransfer.questions;

import org.testng.annotations.Test;
import teammates.test.BaseTestCase;

/**
 * SUT: {@link FeedbackQuestionDetails}.
 */
public class FeedbackQuestionDetailsTest extends BaseTestCase {

    /**
     * A test case with same object with different reference
     */
    @Test
    public void testEquals() {
        ______TS("Same object with different references, should be same");
        FeedbackQuestionDetails fqd1 = new FeedbackTextQuestionDetails("text question");
        FeedbackQuestionDetails fqd2 = fqd1;
        assertEquals(fqd1, fqd2);
    }

    /**
     * A test case with where one is null and other is not
     */
    @Test
    public void testNull() {
        ______TS("One input is null, should be different");
        FeedbackQuestionDetails fqd1 = new FeedbackTextQuestionDetails("text question");
        FeedbackQuestionDetails fqd2 = null;
        assertNotEquals(fqd1, fqd2);
    }

    /**
     * A test case that deals with null parameter
     */
    @Test
    public void testEmpty() {
        ______TS("Different classes, should be different");
        FeedbackQuestionDetails fqd1 = new FeedbackTextQuestionDetails("text question");
        FeedbackQuestionDetails fqd2 = new FeedbackTextQuestionDetails();
        assertNotEquals(fqd1, fqd2);
    }


    /**
     * A test case that deals with empty string parameter
     */
    @Test
    public void testEmpty2() {
        ______TS("Different classes, should be different 2");
        FeedbackQuestionDetails fqd1 = new FeedbackTextQuestionDetails("text question");
        FeedbackQuestionDetails fqd2 = new FeedbackTextQuestionDetails("");
        assertNotEquals(fqd1, fqd2);
    }

    /**
     * A test case with that deals with changing attributes
     * An object with different attributes should be different
     * An object with the same attributes should be the same
     */
    @Test
    public void testSameAttributes() {
        ______TS("Some attributes are different, should be different");
        FeedbackQuestionDetails fqd1 = new FeedbackTextQuestionDetails("first question");
        FeedbackQuestionDetails fqd2 = new FeedbackTextQuestionDetails("second question");
        assertNotEquals(fqd1, fqd2);

        fqd2 = new FeedbackTextQuestionDetails("first question");
        ((FeedbackTextQuestionDetails) fqd1).setRecommendedLength(50);
        assertNotEquals(fqd1, fqd2);

        ______TS("All attributes are same, should be same");
        ((FeedbackTextQuestionDetails) fqd2).setRecommendedLength(50);
        assertEquals(fqd1, fqd2);
    }
}
