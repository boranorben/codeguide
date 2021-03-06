# Code Guide by Issaree Srisomboon
Here are some guidances for writing good code in Java.
## 1. Keep methods as small as possible
In object-oriented programming, the single responsibility principle states that every object should have a single responsibility, and that responsibility should be entirely encapsulated by the class. 

According to *Bob Martin* takes the idea that **“if small is good, then smaller must be better”** to an extreme in *Clean Code*

*“The first rule of functions is that they should be small. The second rule of functions is that they should be smaller than that. Functions should not be 100 lines long. Functions should hardly ever be 20 lines long.”*

The example of method that have to refactoring 
- Deeply nested control structures
- Too many state-defining parameters
- Logic that is duplicated in other methods
- Excessive inter-class coupling
- Unnecessary overhead

So limit each method to a single job is needed to be remember.

-  **Advantage**
    - make code more cleaner and it is easier to understand and maintain.
    - Less code duplication. Often the code that is found in a method can be reused in other places in your program. So you can replace duplicates with calls to your new method.

### Solution
A long method usually contains subgroups of functionality bunched together and not related to the name of method. So the easy way to solve this problem is just taking this functionality and move it to another method and pass in parameters as needed. And do not forget to name it accordingly.

#### Example code
This is the what is going to look like when you have too many parameters in one method.
Here's the Person Class that have 1 method called `createPerson(...)` that does everything about create a new person.
```
public class Person {
    // omit attributes constructor methods
   public Person createPerson (
      String lastName, 
      String middleName,  
      String firstName,
      String streetAddress, 
      String city, String state,
      boolean isFemale, 
      boolean isEmployed, 
      boolean isHomeOwner ) 
   {
      // implementation goes here
   }
}
```
It looks massive and complicated right?
In this instances it’s useful to create a class who’s only responsibility is to carry parameters into the method. This helps make the code more flexible because to add more parameters, you need only to add another field to the parameter object.
```
public class Person {
    // omit attributes and constructor methods
    public Person createPerson (
      FullName fullName, 
      Address address,
      Gender gender,
      EmploymentStatus employment,
      HomeownerStatus homeownerStatus )
   {
      // implementation goes here
   }
}
```
You have to create classes `FullName`, `Address`, `Gender`, and `HomeownerStatus` and do some work in it. And now this method is more readable and easier to use by clients, It has fewer parameters and the parameters it does have are all of distinct types
##### Short code improvement exercise [Click Here](https://github.com/boranorben/codeguide/tree/master/src/exercise_1 "Title")
###### Reference 
*Writing good Java code* by J Steven Perry

http://www.ibm.com/developerworks/library/j-perry-writing-good-java-code/index.html J Steven Perry's blog

## 2. Avoid making nonsense with Inheritance
When creating an inheritance, you have to think about the relationship between the superclass and the subclass. They should involve each other in the real world for preventing other users' misunderstanding.
So If inheritance makes no sense or the subclass really does have nothing in common with the superclass, replacing inheritance with delegation can solve this problem.
- **Advantage**
    - Reducing code duplication because common attributes and methods now live in one place only.

### Solution 
If inheritance is appropriate, get rid of unneeded fields and methods in the subclass. 
Extract all fields and methods needed by the subclass from the parent class, put them in a new subclass, and set both classes to inherit from it.

1. Create an abstract superclass.

2. Move the common functionality to a superclass. Start with the fields, since in addition to the common fields you will need to move the fields that are used in the common methods.

3. Look for places in the client code where use of subclasses can be replaced with your new class (such as in type declarations).

#### Example Code 
You can see from the code below that the `Dog` class should not be extended by the `Chair` class though they have same attribute.
``` 
public class Animal {
    private int legs;
    // omit another attributes and methods
}

public class Dog extends Animal {
    private int legs;
    // omit another attributes and methods
}

public class Chair extends Dog {
    private int legs;
    // omit another attributes and methods
}
```
The solution is
```
public class abstract hasLegs {
    private int legs;
    // omit another attributes and methods
}
public class Animal extends hasLegs {
    // omit another attributes and methods
}
public class Dog extends Animal {
    // omit another attributes and methods
}
public class Chair extends hasLegs {
    // omit another attributes and methods
}
```
You will no longer have to wonder why the Dog class is inherited from the Chair class (even though they both have 4 legs).
##### Short code improvement excercise [Click Here](https://github.com/boranorben/codeguide/tree/master/src/exercise_2 "Title")
###### Reference 
*Refused Bequest* by Refactoring Guru

*Extract Superclass* by SourceMaking

https://sourcemaking.com/refactoring/extract-superclass