package org.example;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String p = "<p>My paragraph</p>";
        System.out.println(StringEscapeUtils.escapeHtml4(p));
    }
}
