The iterator pattern was implemented to check if the attack coordinate is out of bounds by iterating through the coordinates and comparing them to the user input. An interface "container" returns the iterator. The concrete classes CharCoordinates & NumCoordinates, that implement the container interface, are resposnsible to implement the Iterator interface and use it

The classes Playerinitialization and ComputerPlayerInitialization are singletons because they are supposed to be only initialized once.

the InputGetter class has a one-to-many relationship and has observers. Its data is handed to the InputValidator and to Initialization.isInOccupiedSlots.
