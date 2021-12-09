package teammates.common.datatransfer.questions;

import org.testng.annotations.Test;

import teammates.common.util.SanitizationHelper;
import teammates.test.BaseTestCase;

/**
 * SUT: {@link FeedbackTextResponseDetails}.
 */
public class FeedbackTextResponseDetailsTest extends BaseTestCase {

    /**
     * Constructor test for FeedbackTextResponseDetails
     */
    @Test
    public void testValidateArgumentConstructor_sameValues_shouldReturnTrue() {
        String testAnswer = "Hello World";
        FeedbackTextResponseDetails feedbackTextResponseDetails = new FeedbackTextResponseDetails(testAnswer);
        assertEquals(feedbackTextResponseDetails.getAnswer(), "Hello World");
    }

    /**
     * Constructor test for FeedbackTextResponseDetails
     */
    @Test
    public void testValidateArgumentConstructor_diffValues_shouldReturnFalse() {
        String testAnswer = "Hello World";
        FeedbackTextResponseDetails feedbackTextResponseDetails = new FeedbackTextResponseDetails(testAnswer);
        assertNotEquals(feedbackTextResponseDetails.getAnswer(), "Goodmorning");
    }

    /**
     * Passed null value in the constructor test
     */
    @Test
    public void testValidateAttributesOfAnswer_nullValue_shouldReturnNull() {
        FeedbackTextResponseDetails feedbackTextResponseDetails = new FeedbackTextResponseDetails(null);
        assertNull(feedbackTextResponseDetails.getAnswer());
    }

    /**
     * Passed empty string in teh constructor test
     */
    @Test
    public void testValidateAttributesOfAnswer_emptyString_shouldNotReturnNull() {
        FeedbackTextResponseDetails feedbackTextResponseDetails = new FeedbackTextResponseDetails("");
        assertNotNull(feedbackTextResponseDetails.getAnswer());
    }

    /**
     * Passed null value in the constructor test, using SanitizationHelper
     */
    @Test
    public void testValidateSanitizedAnswerString_nullValues_shouldReturnTrue() {
        FeedbackTextResponseDetails feedbackTextResponseDetails = new FeedbackTextResponseDetails(null);
        assertEquals(feedbackTextResponseDetails.getAnswerString(),
                SanitizationHelper.sanitizeForRichText(feedbackTextResponseDetails.getAnswer()));
    }

    /**
     * Passed empty string in the constructor test, using SanitizationHelper
     */
    @Test
    public void testValidateSanitizedAnswerString_emptyString_shouldReturnTrue2() {
        FeedbackTextResponseDetails feedbackTextResponseDetails = new FeedbackTextResponseDetails("");
        assertEquals(feedbackTextResponseDetails.getAnswerString(),
                SanitizationHelper.sanitizeForRichText(feedbackTextResponseDetails.getAnswer()));
    }

    /**
     * Constructor test, using SanitizationHelper
     */
    @Test
    public void testValidateSanitizedAnswerString_validValues_shouldReturnTrue() {
        String testValue = "Hello World";
        FeedbackTextResponseDetails feedbackTextResponseDetails = new FeedbackTextResponseDetails(testValue);
        assertEquals(feedbackTextResponseDetails.getAnswerString(),
                SanitizationHelper.sanitizeForRichText(feedbackTextResponseDetails.getAnswer()));
    }

    /**
     * Using set method and testing it, using SanitizationHelper
     */
    @Test
    public void testValidateSetAnswer_sameValues_shouldReturnTrue() {
        String testValue = "Hello World";
        FeedbackTextResponseDetails feedbackTextResponseDetails = new FeedbackTextResponseDetails();
        assertNotEquals(feedbackTextResponseDetails.getAnswerString(),
                SanitizationHelper.sanitizeForRichText(testValue));

        feedbackTextResponseDetails.setAnswer(testValue);

        assertEquals(feedbackTextResponseDetails.getAnswerString(),
                SanitizationHelper.sanitizeForRichText(testValue));
    }
}
