package in.diszhappy.test;
/**
 * @author Saumm created on 24-Oct-2018 11:48:07 PM 
 * Desc : This class is written to illustrate breaking the immutability of ImmutableBreakble object
 */
public class Mutable extends ImmutableBreakble {
     private int realValue;
     /**
      * Default parameterized constructor
      * @param value
      */
     public Mutable(int value) {
         super(value);

         realValue = value;
     }
     
     public int getValue() {
         return realValue;
     }
     public void setValue(int newValue) {
         realValue = newValue;
     }
     /**
      * 
      * This method is written by Saumm on 13-Nov-2018 10:47:03 PM
      * It is responsible for initiation of execution
      * @param arg
      */
    public static void main(String[] arg){
        Mutable obj = new Mutable(4);
        ImmutableBreakble immObj = (ImmutableBreakble)obj;              
        System.out.println(immObj.getValue());
        obj.setValue(8);
        System.out.println(immObj.getValue());
    }
}