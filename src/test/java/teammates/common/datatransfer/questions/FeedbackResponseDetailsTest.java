package teammates.common.datatransfer.questions;

import org.testng.annotations.Test;

import teammates.test.BaseTestCase;

/**
 * SUT: {@link FeedbackResponseDetails}.
 */
public class FeedbackResponseDetailsTest extends BaseTestCase {

    @Test
    public void testGetDeepCopy() {
        FeedbackTextResponseDetails f1 = new FeedbackTextResponseDetails("original");
        FeedbackResponseDetails f2 = f1.getDeepCopy();
        assertNotEquals(f1, f2);
        f1.setAnswer("updated");

        assertEquals("updated", f1.getAnswerString());
        assertEquals("original", f2.getAnswerString());
    }

    @Test
    public void testEquals() {
        ______TS("Same object with different references, should be same");
        FeedbackTextResponseDetails f1 = new FeedbackTextResponseDetails("original");
        FeedbackTextResponseDetails f2 = f1;
        assertEquals(f1, f2);
    }

    @Test
    public void testNull() {
        ______TS("One input is null, should be different");
        FeedbackTextResponseDetails f1 = new FeedbackTextResponseDetails("original");
        FeedbackTextResponseDetails f2 = null;
        assertNotEquals(f1, f2);
    }

    @Test
    public void testEmpty() {
        ______TS("Different classes, should be different");
        FeedbackTextResponseDetails f1 = new FeedbackTextResponseDetails("original");
        FeedbackTextResponseDetails f2 = new FeedbackTextResponseDetails();
        assertNotEquals(f1, f2);
    }


    @Test
    public void testEmpty2() {
        ______TS("Different classes, should be different 2");
        FeedbackTextResponseDetails f1 = new FeedbackTextResponseDetails("original");
        FeedbackTextResponseDetails f2 = new FeedbackTextResponseDetails("");
        assertNotEquals(f1, f2);
    }
}
