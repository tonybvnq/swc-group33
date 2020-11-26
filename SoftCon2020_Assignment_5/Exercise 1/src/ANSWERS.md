Offices
The offices are designed using the Composite design pattern, where the bakeries are leaves of the city office, which in turn is the child of the central office. The central office forms the root.

Bakeries
The different bakery types inhert from the Bakery class.

Products (Sandwich, Cake)
The products can be enhanced with the different toppings, this is designed using the Decorator design pattern.

For the sandwich and cake classes a decorator design pattern is used. Like this it is always easy to add and remove ingridients without having to change the code.
For this, sandwich and cake are implmentet as intefaces while having an abstract decorator class each, which implements specific the interface and is extended into the ingredients.
