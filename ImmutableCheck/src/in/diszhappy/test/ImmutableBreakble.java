package in.diszhappy.test;
/**
 * @author Saumm created on 24-Oct-2018 11:45:03 PM 
 * Desc : This class is written to create a class whose immutability property can be challenged
 */
public class ImmutableBreakble {
     private final int value;
     /**
      * Parameterized constructor to initialize the object
      * @param value
      */
     public ImmutableBreakble(int value) {
         this.value = value;
     }
     /**
      * This method is written by Saumm on 24-Oct-2018 11:47:22 PM
      * It is responsible for returning the value 
      * @return
      */
     public int getValue() {
         return value;
     }
}