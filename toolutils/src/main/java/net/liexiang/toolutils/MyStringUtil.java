
package net.liexiang.toolutils;

/**
 * describe：处理字符工具类
 * author： Gao Chunfa.
 * time： 2017/2/28-10:41.
 */
public class MyStringUtil {

    /**
     * 比较两个字符串是否相等
     *
     * @param str1
     * @param str2
     * @return
     */
    public static final boolean isEqual(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        return str1.equals(str2);
    }

    /**
     * 不为空
     *
     * @param s
     * @return
     */
    public static boolean isNotNull(String s) {
        return s != null && !"".equals(s.trim());
    }

    /**
     * 为空
     *
     * @param s
     * @return
     */
    public static boolean isNull(String s) {
        return s == null || "".equals(s.trim());
    }



}
