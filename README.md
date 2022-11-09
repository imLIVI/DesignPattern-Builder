# DesignPattern-Builder
## People task
### Description
In this task, we will practice with the Builder template. We will design a Person class in which data about a person will be stored:
* Name (```String```). Everyone must have a name, and it cannot be changed from the moment the object is created.
* Last name (```String```). Everyone is obliged to have a surname, and it cannot be changed from the moment the object is created.
* Age (```int```). If the age of a person is known, then from the moment the object is created, it can only be changed by increasing by one through calling the
 ```happyBirthday()``` method. The age of a person may be unknown, in which case the ```boolean hasAge()``` method should return false, otherwise true. Think about how 
it is more efficient to store information in the object about whether a person's age is known.
* Current city of residence (```String```). It can be known (in this case, the ```boolean hasAddress()``` method should return ```true```, otherwise ```false```) and
 set to any via ```setAddress(String city)```.
 
All data about a person should be accessible through the appropriate methods (for example, ```String getName()```), the fields of the same class should not be
```public```.

You also need to create a ```PersonBuilder``` class to construct objects of the ```Person``` class. An object of this class (hereinafter referred to as a builder) can be
exposed to any data for a future object of the ```Person``` class through methods (for example, ```setName(String name)```). And in this object there will be a 
```Person build()``` method that returns an object of the ```Person``` class with the data specified to the builder. If we did not provide enough data to the builder (for example,
we did not specify the last name), then the ```build()``` method should throw an ```IllegalStateException``` with a meaningful message. If we have passed unsuitable 
data to the builder (for example, incorrect ```builder.Setup(-100)```), then this method should throw an ```IllegalArgumentException``` with a meaningful message.
Each method of adding data to the builder should return itself so that you can do, for example, like this:
```java
Person person = new PersonBuilder()
.setName("Antoshka")
.setSurname("Shovels")
.Setup(48)
.build();
```
Also, the ```PersonBuilder newChildBuilder()``` method should be added to the ```Person``` class, which will return a half-filled builder for the child, namely: with the last
name (parent), age and current city of residence (parent) already filled in.

Demonstrate the work of your classes in the ```Main``` class (it is not necessary to implement user input).

<a href="https://github.com/netology-code/jd-homeworks/blob/master/creational/task1/README.md">(RUS version of description)</a>
