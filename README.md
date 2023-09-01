YTREE-Coding-HomeWork
---------------------

A random number generator class that returns an integer from the passed array
based on the probability of such integer which is passed on the probability array.

How To Use:
-----------

Simply clone the project and open it on any IDE with Java17. Run the main method
from the main class which has the arrays pre-defined, and it should print a random
integer from the array. It should print different in most cases.

Tests:
-----
Junit tests are available on test folder which could also be run during building of
this project.


Future Extensions:
------------------

The current implementation is minimalistic which is inline with the task description.
This can be easily extended into a web based app (Spring) which would expose this 
functionality in a rest api. Then it could accept the arrays as an input once and
return a random int every time its called. The current implementation uses pure Java
to facilitate the functionality without any external library, but we could also use 
libraries like apache-commons-math (Enumeration) classes that takes in the
pairs of number and probability which in turn returns random int.