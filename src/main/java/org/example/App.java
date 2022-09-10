package org.example;

import org.timestamp.Timestamp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Timestamp t = new Timestamp();

        System.out.println(t.getTimestamp());
        System.out.println(t.getTimestamp(-600));
        System.out.println(t.getTimestamp(600));
    }
}
