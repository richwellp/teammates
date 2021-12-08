package teammates.common.datatransfer.questions;

import org.testng.annotations.Test;

import teammates.test.BaseTestCase;

/**
 * SUT: {@link FeedbackQuestionDetails}.
 */
public class FeedbackQuestionDetailsTest extends BaseTestCase {

    @Test
    public void testEquals() {
        ______TS("Same object with different references, should be same");
        FeedbackQuestionDetails f1 = new FeedbackTextQuestionDetails("text question");
        FeedbackQuestionDetails f2 = f1;
        assertEquals(f1, f2);
    }

    @Test
    public void testNull() {
        ______TS("One input is null, should be different");
        FeedbackQuestionDetails f1 = new FeedbackTextQuestionDetails("text question");
        FeedbackQuestionDetails f2 = null;
        assertNotEquals(f1, f2);
    }

    @Test
    public void testEmpty() {
        ______TS("Different classes, should be different");
        FeedbackQuestionDetails f1 = new FeedbackTextQuestionDetails("text question");
        FeedbackQuestionDetails f2 = new FeedbackTextQuestionDetails();
        assertNotEquals(f1, f2);
    }


    @Test
    public void testEmpty2() {
        ______TS("Different classes, should be different 2");
        FeedbackQuestionDetails f1 = new FeedbackTextQuestionDetails("text question");
        FeedbackQuestionDetails f2 = new FeedbackTextQuestionDetails("");
        assertNotEquals(f1, f2);
    }

    @Test
    public void testSameAttributes() {
        ______TS("Some attributes are different, should be different");
        FeedbackQuestionDetails f1 = new FeedbackTextQuestionDetails("first question");
        FeedbackQuestionDetails f2 = new FeedbackTextQuestionDetails("second question");
        assertNotEquals(f1, f2);

        f2 = new FeedbackTextQuestionDetails("first question");
        ((FeedbackTextQuestionDetails) f1).setRecommendedLength(50);
        assertNotEquals(f1, f2);

        ______TS("All attributes are same, should be same");
        ((FeedbackTextQuestionDetails) f2).setRecommendedLength(50);
        assertEquals(f1, f2);

    }
}
