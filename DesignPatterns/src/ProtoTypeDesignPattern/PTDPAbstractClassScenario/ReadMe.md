## Prototype Design Pattern (Using an Abstract Class) ##
In this approach, we use an abstract class instead of an interface to define the cloning 
mechanism. This allows us to provide a default implementation of the clone() method, reducing 
repetitive code and making the design more maintainable.

Explanation:
Abstract Class (Vehicle)

* Defines the clone() method using super.clone().
* Implements the Cloneable interface to support object cloning.
* Contains an abstract showDetails() method, forcing subclasses to implement it.

Why Use super.clone()?

* It creates a shallow copy of the object.
* The new object will have the same values as the original but will be a different instance.


Why no clone() method in car and Bus class?

The Vehicle abstract class already provides a default clone() method.
No need to implement it again in Car.


Key Benefits of Using an Abstract Class
✅ Code Reusability → clone() method is inherited, avoiding redundant implementations.
✅ Encapsulation → The Vehicle class centralizes the cloning logic.
✅ Maintainability → Changes to cloning logic apply to all subclasses.
✅ Flexibility → New vehicle types can be added easily.

When to Use Which Approach?
If you want flexibility (e.g., a class needs to extend another class too) → Use an Interface.
If you want code reusability and default cloning behavior → Use an Abstract Class.


