UMUC CMIS141 
Introduction to Java Programming
by Y. Daniel Liang

Chapter 8
===

8.1 Introduction
===

Object-oriented programming enables you to develop large-scale software and GUIs effectively.

8.2 Defining Classes for Objects
===

A class defines the properties and behaviors for objects. An object identifies an entity in the real world that can be identified. 

	For example, a button, a car, a loan.

An object has a unique identity, state, AND behavior.

1. State of an object is it's properties or attributes.
2. The behavior of an object is defined by its actions which are methods. An object can invoke it's own methods.

Objects are instances of a class and you can create many instances of any class.

Constructors are invoked to create new instances of a specific class of object. These are special methods in the class.

8.3 Defining Classes and Creating Objects
===

Classes are definitions for objects and objects are created from classes.

You can put more then one class into a single file but only one class can be public. And the filename must match the public class name. The public class must also contain the main method to be invoked if so desired.

8.4 Constructing Objects Using Constructors
===

A constructor is invoked to create an object using the new operator.

Constructors are a special kind of method with 3 differences:

1. Must have the same name as the class itself.
2. Do NOT have a return type.
3. Invoked with the new operator and have the role of initializing the object.

Constructors can be overloaded just like any other method.

To invoke a constructor use the new operator.

	new ClassName(arguments);

A class normally provides a constructor without arguments. Referred to as a no-arg constructor.

8.5 Accessing Objects via Reference Variable
===

An object's data and methods can be accessed through the dot (.) operator via the object's reference variable.

8.5.1 Reference Variables and Reference Types
===

Syntax:

	ClassName objectRef;

Assignment

	myCircle = new ClassName(arguments);

Single Form

	ClassName myCircle = new ClassName(arguments);

Objects and Arrays are treated the same way in this regard.

Anonymous objects are allowed in Java:

```java
System.out.println("Area is " + new Circle(5).getArea());
```

8.6.2 Random Class
===

The java.util.Random class can take a SEED as an argument to the constructor. If the same exact seed is provided each time then the resuling numbers will always be the same.

Software testing requires the use of a Random Seed to reproduce the same results over and over.

8.7 Static Variables, Constants, and Methods
===

A static variable is shared by all objects of the class. A static method cannot access instance members of the class.

An instance variable is not shared among the different instances of the class.

Static or Class variables should be used to share information between all instances of a class.

Static methods can be initiated without creating an instance of the class.

A static method may only invoke or access other static members including fields/attributes and methods.

