# FoodOrdering

The project is about Food Ordering system and in this food ordering system we created a
combo of dosa and pizza. The main idea behind this project is User order for the pizza and
our system will offer the user with free kind of dosa. As the pizza is being ordered we have
made a way for the user to add some customization to the existing pizza. And after making
the combo we are keeping the watch on the various states of the system. In this project we
have used the three design patterns which are the abstract factory design pattern,
decorator design and the state design pattern .Our main class which is foodordering.java
consists of the menu driven program in which the basic integration of all the three design
patterns is handled . The abstract factory design pattern is used for creating the pizzas and
dosa. The classes which are implementing the Pizza Interface are CheesePizza, VeggiePizza,
MargheritaPizza and Pepperoni Pizza which are representing the concrete products of the
pizza. The Dosa Interface is another interface for another kind of products. The classes
implementing the order interface are PlainDosa, RavaDosa, MasalaDosa, MoongDalDosa
which are also a representation of the concrete products of the Dosa. The orders interface is
used for combining the classes of pizza and dosa . Order1 class is used as a context for state
design pattern ,for maintaining the ordered food state an interface called order state is
being created and the classes implementing the order state interface which represents
various states. The default state is been set to JustOrdered state. Order1 is used for
combining CheesePizza and PlainDosa. When the user exits the ordering, the state is being
changed to the Dispatched State. Order2, Order3, Order4 classes are used for making
various combos of the pizza and the dosa which are Veggie Pizza With Masala Dosa,
Pepperoni Pizza With Moong Dal dosa
and Margherita Pizza With Rava Dosa respectively.
For customizing the pizza, we have made an abstract class named as Customize Pizza
which is extending the pizza class. This class illustrates the use of the Decorator design
pattern which hold the reference of the Pizza class. A class PaneerTopings which is
extending the CustomizePizza class is used for dynamically adding toppings on the pizza.
This class PaneerTopings is illustrating the addition of the responsibilities dynamically to
the already existing object which in our case is pizza.
Regarding our main program(FoodOrdering class), we have made it as a menu driven
program to interact to the system. We have presented various choices of the combo’s to the
user so that the user can select one of them. After selecting the combo, the user will be
prompted to add toppings to the pizza. If user enter yes, then the system will add the
Panner toppings to the Pizza. Then the user will be prompted by the message whether to
continue or not. If user want to continue, then system is directed to show all the options
once again and if user want to close the ordering the program will exit.
This is the entire flow of our Project.
