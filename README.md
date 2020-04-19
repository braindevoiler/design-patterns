# Design Principles

### 1. Identify the aspects of your application that vary and separate them from what stays the same.
* Take what varies and encapsulate it so it won't affect the rest of your code.
* It results in fewer unintended consequences from code changes and more flexibility in your system.

### 2. Program to an interface, not an implementation.

### 3. Favor composition over inheritance.
* It gives us more flexibility.
* It lets us change behavior at runtime.

### 4. Strive for loosely coupled designs between objects that interact.
* Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the 
interdependency between objects.

### 5. The Open-Closed Principle
* Classes should be open for extension, but closed for modification.
* Allow classes to be easily extended to incorporate new behavior without modifying existing code.
* Applying the Open-Closed Principle everywhere is wasteful, unnecessary, and can lead to complex, hard to understand
 code. We should concentrate on those areas that are most likely to change in the design.
 
### 6. The Dependency Inversion Principle
* Depend upon abstractions. Do not depend upon concrete classes.
* High level  components should not depend on low-level components, rather, they should both depend on abstractions.
* Guidelines:
    * No variable should hold a reference to a concrete class.
    * No class should derive from a concrete class.
    * No method should override an implemented method of any of its base classes.

### 7. The Principle of Least Knowledge/The Law of Demeter : Talk only to your immediate friends.
* It means when you are designing a system, for any object, be careful of the number of classes it interacts with and 
also how it comes to interact with those classes.
* This principle prevents us from creating designs that have a large number of classes coupled together so that 
changes in one part of the system cascade to other parts.
* How do you keep from doing this? The principle provides some guidelines: take any object; now from any method in 
that object, the principle tells us that we should only invoke methods that belong to:
    * The object itself
    * Objects passed in as a parameter to the method
    * Any object the method creates or instantiates
    * Any components of the object (Object composition, has-a-relationship)
* Above guidelines tells us not to call methods on objects that were returned from calling other methods.

Without the principle:
```
    public float getTemp() {
        Thermometer thermometer = station.getThermometer();
        return thermometer.getTemperature();
    }
```

With the principle:
```
    public float getTemp() {
        return station.getTemperature();
    }
```

#### Disadvantages of applying the Principle of Least Knowledge;
* While the principle reduces the dependencies between objects and studies have shown this reduces software 
maintenance, it is also the case that applying this principle results in more "wrapper" classes being written to 
handle method calls to other components. This can result in  increased complexity and development time as well as 
decreased runtime performance.

### 8. The Hollywoon Principle: Don't call us, we'll call you. (Template Method Pattern)
* Allow low-level components to hook themselves into a system, but the high level components determine when they are 
needed, and how.
* The high-level components give the low-level components a "don't call us, we'll call you" treatment.

### 9. Single Responsibility
* A class should have only one reason to change.
* Every responsibility of a class is an area of potential change. More than one responsibility means more than one 
area of change.
* A class has high cohesion when it is designed around a set of related functions, and we say that it has low 
cohesion when it's designed around a set of unrelated functions.