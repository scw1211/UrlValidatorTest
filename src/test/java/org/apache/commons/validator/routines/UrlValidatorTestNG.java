package org.apache.commons.validator.routines;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UrlValidatorTestNG {

    private final UrlValidator validator = new UrlValidator(new String[]{"http", "https"}, 0);

    @Test
    public void testIsValidWithInvalidPath() {
        String url = "http://example.com/path?";
        Assert.assertFalse(validator.isValid(url), "路径末尾带?的URL应无效");
    }

    @Test
    public void testIsValidPathWithQuestionMark() {
        String path = "/path?";
        Assert.assertFalse(validator.isValidPath(path), "路径末尾带?应无效");
    }

    @Test
    public void testIsValidScheme() {
        String scheme = "https";
        Assert.assertTrue(validator.isValidScheme(scheme), "有效协议应通过");
    }

    @Test
    public void testValidUrl() {
        String url = "https://example.com/path/to/resource";
        Assert.assertTrue(validator.isValid(url), "有效URL应通过");
    }
}