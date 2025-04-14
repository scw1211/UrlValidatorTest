package org.apache.commons.validator.routines;

public class UrlValidatorManualTest {
    public static void main(String[] args) {
        UrlValidator validator = new UrlValidator(new String[]{"http", "https"}, 0);

        // 测试1：isValid（含缺陷影响）
        String url = "http://example.com/path?";
        if (validator.isValid(url)) {
            System.out.println("测试1通过：" + url + "有效（预期缺陷）");
        } else {
            System.out.println("测试1失败：" + url + "应无效");
        }

        // 测试2：isValidPath（含缺陷）
        String path = "/path?";
        if (validator.isValidPath(path)) {
            System.out.println("测试2通过：" + path + "有效（发现缺陷）");
        } else {
            System.out.println("测试2失败：" + path + "应无效");
        }

        // 测试3：isValidScheme
        String scheme = "https";
        if (validator.isValidScheme(scheme)) {
            System.out.println("测试3通过：" + scheme + "有效");
        } else {
            System.out.println("测试3失败：" + scheme + "应有效");
        }
    }
}