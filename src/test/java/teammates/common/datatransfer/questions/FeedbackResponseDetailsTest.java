package teammates.common.datatransfer.questions;

import org.testng.annotations.Test;

import teammates.test.BaseTestCase;

/**
 * Tests for FeedbackResponseDetails
 * SUT: {@link FeedbackResponseDetails}.
 */
public class FeedbackResponseDetailsTest extends BaseTestCase {

    /**
     * Tests the getDeepCopy() method from FeedbackTextReponseDetails class
     */
    @Test
    public void testGetDeepCopy() {
        FeedbackTextResponseDetails ftrd1 = new FeedbackTextResponseDetails("original");
        FeedbackResponseDetails ftrd2 = ftrd1.getDeepCopy();
        assertNotEquals(ftrd1, ftrd2);
        ftrd1.setAnswer("updated");

        assertEquals("updated", ftrd1.getAnswerString());
        assertEquals("original", ftrd2.getAnswerString());
    }

    /**
     * A test case with same object with different reference
     */
    @Test
    public void testEquals() {
        ______TS("Same object with different references, should be same");
        FeedbackTextResponseDetails ftrd1 = new FeedbackTextResponseDetails("original");
        FeedbackTextResponseDetails ftrd2 = ftrd1;
        assertEquals(ftrd1, ftrd2);
    }

    /**
     * A test case with where one is null and other is not
     */
    @Test
    public void testNull() {
        ______TS("One input is null, should be different");
        FeedbackTextResponseDetails ftrd1 = new FeedbackTextResponseDetails("original");
        FeedbackTextResponseDetails ftrd2 = null;
        assertNotEquals(ftrd1, ftrd2);
    }

    /**
     * A test case that deals with null parameter
     */
    @Test
    public void testEmpty() {
        ______TS("Different classes, should be different");
        FeedbackTextResponseDetails ftrd1 = new FeedbackTextResponseDetails("original");
        FeedbackTextResponseDetails ftrd2 = new FeedbackTextResponseDetails();
        assertNotEquals(ftrd1, ftrd2);
    }


    /**
     * A test case that deals with empty string parameter
     */
    @Test
    public void testEmpty2() {
        ______TS("Different classes, should be different 2");
        FeedbackTextResponseDetails ftrd1 = new FeedbackTextResponseDetails("original");
        FeedbackTextResponseDetails ftrd2 = new FeedbackTextResponseDetails("");
        assertNotEquals(ftrd1, ftrd2);
    }
}
