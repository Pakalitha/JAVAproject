# JAVAproject
description of the key Word FINAL AND SUPER
 The key word final set limitations on extensibility for reusing existing code [1].
Java final keyword is a non-access specifier that is used to restrict a class, variable, and method. If we initialize a variable with the final keyword, then we cannot modify its value .If we declare a method as final, then it cannot be overridden by any subclasses. And, if we declare a class as final, we restrict the other classes to inherit or extend it .In other words, the final classes cannot be inherited by other classes [1].
 Below is the illustration on how final key word means for class, method and variable with the examples.
consider the situation if we can extend String class, override any of its method ,and substitute all the String instances with the instance of our specific String  sub class. The result of the operation over String objects will then become unpredictable [2].
Final for class:




The Method with Final Keyword cannot be overridden in the subclasses. The purpose of the Final Method is to declare methods of how’s definition can not be changed by a child or subclass that extends it[3].
Example 
package com.techvidvan.finalkeyword;
public class Parent {
  final void final_method() {
    //definition of the Final Method
  }
}
public class Child extends Parent {
  final void final_Method() // overriding the method from the parent class  
  {
    // another definition of the final method
  }
}









Using the Keyword super
Accessing Superclass Members
If method overrides one of its superclass's methods, we can invoke the overridden method through the use of the keyword super. we can also use super to refer to a hidden field (although hiding fields is discouraged). Consider this class, Superclass [3]:
public class Superclass {

    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}

Here is a subclass, called Subclass, that overrides printMethod():

public class Subclass extends Superclass {

    // overrides printMethod in Superclass
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass");
    }
    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod();    
    }
}

The following example illustrates how to use the super keyword to invoke a superclass's constructor. Recall from the Bicycle example that MountainBike is a subclass of Bicycle. Here is the MountainBike (subclass) constructor that calls the superclass constructor and then adds initialization code of its own [4]:
Public MountainBike(int startHeight, 
                    int startCadence,
                    int startSpeed,
                    int startGear) {
    super(startCadence, startSpeed, startGear);
    seatHeight = startHeight;
}   
Invocation of a superclass constructor must be the first line in the subclass constructor [5].
The syntax for calling a superclass constructor is super ()[6].
 If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass. If the super class does not have a no-argument constructor, you will get a compile-time error. Object does have such a constructor, so if Object is the only superclass, there is no problem [6].


