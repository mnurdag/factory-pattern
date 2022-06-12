# Factory Pattern (aka Factory Method Pattern) in JAVA
## Advantages of using Factory Pattern:
### 1- Promotes loose-coupling between application specific classes and calling code.
For example, int this project Application.java class is loosely-coupled to the sub-classes of FruitFactory interface. It interacts only with the interface rathen than sub-classes of the interface.

### 2- Promotes open-closed principle. It is one of the SOLID principles described by Robert C. Martin, aka Uncle Bob.
For example, in this project we could create new sub-classes of FruitFactory without changing the existing code, which in this case is Application.java class.
