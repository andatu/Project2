package org.example;

import org.apache.commons.lang3.StringEscapeUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    static Logger log = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        String p = "<p>My paragraph</p>";
        System.out.println(StringEscapeUtils.escapeHtml4(p));
        log.info("Hello this is a info message");
    }
}
