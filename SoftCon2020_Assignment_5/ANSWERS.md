Exercis 1:

Offices:
The offices are designed using the Composite design pattern, where the bakeries are leaves of the city office, which in turn is the child of the central office. The central office forms the root.

Bakeries:
The different bakery types inhert from the Bakery class.

Products (Sandwich, Cake):
The products can be enhanced with the different toppings, this is designed using the Decorator design pattern.

For the sandwich and cake classes a decorator design pattern is used. Like this it is always easy to add and remove ingridients without having to change the code.
For this, sandwich and cake are implmentet as intefaces while having an abstract decorator class each, which implements specific the interface and is extended into the ingredients.


Exercise 2:

The Strategy design pattern allows to swap/add/change behavior easily also during runtime.

Therefore you create an interface which implements the different behavior classes. Whenever an ocbject is created, it can get its behavior by iniziating 
the behaviorclasses from the interface. In the case, the price, speed etc. are the interfaces and its subcasses like cheapprice are the behaviorclasses the extend the interface.

When a car is inizialized it gets its behavior by initializing the behavior from these behaviorclasses.
