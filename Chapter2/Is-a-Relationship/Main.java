/* Is-a Relationship
*
* The fundamental result of the is-a principle is that if A is-a B, then any instanceof A can be treated like an instance of B.
*/

interface Pet {}

class Animal {}

class Feline extends Animal {}

class Cat extends Feline implements Pet {}

class Tiger extends Feline {}

class Dog extends Animal implements Pet {}

