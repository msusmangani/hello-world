
package org.cloud.helloworld;

/**
 * A simple CDI service 
 *
 * 
 *
 */
public class HelloWorldService {

    String createMessage(String name) {
        return "Hello  " + name + "!";
    }

}
