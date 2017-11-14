/**
 * 
 */
package com.example;

import org.apiguardian.api.API;
import org.apiguardian.api.API.Status;

/**
 * @author swm16
 *
 */
@API(status = Status.MAINTAINED, since = "0.1")
public class AnnotatedLibrary {
  
  public void sayHi() {
    System.out.println("Just saying hi");
  }

}
