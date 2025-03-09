Prototype is a creational design pattern that lets you copy existing objects without 
making your code dependent on their classes.

Why Use the Prototype Pattern?
✅ Performance Optimization: Avoids costly object creation.
✅ Encapsulation: Clients don’t need to know object creation details.
✅ Flexibility: Can easily extend the registry with new vehicle types.


| **Aspect**                 | **Interface Approach**                                                     | **Abstract Class Approach**                                      |
|----------------------------|----------------------------------------------------------------------------|------------------------------------------------------------------|
| **Code Reusability**       | Each class implements `clone()` separately                                 | `clone()` is inherited from the abstract class                   |
| **Flexibility**            | Allows multiple inheritance (can implement other interfaces)               | Only single inheritance is allowed                               |
| **Default Implementation** | No default method implementation                                           | Provides a default `clone()` implementation                      |
| **Maintainability**        | More repetitive code for cloning                                           | Centralized cloning logic for all subclasses                     |
| **Encapsulation**          | Cloning logic is implemented in every class separately                     | Cloning logic is encapsulated in the abstract class              |
| **Ease of Extension**      | New classes must implement `clone()` separately                            | New classes inherit cloning functionality automatically          |
| **Best Use Case**          | When flexibility is required (e.g., a class needs to extend another class) | When code reusability and a default cloning mechanism are needed |

Sources :
https://medium.com/@thecodebean/prototype-design-pattern-implementation-in-java-b4b900f1ad9a
https://www.youtube.com/watch?v=DcFhITC9v0E
