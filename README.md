# 📂 JAVA GENERICS & INTERFACES - EXERCISES PROJECT

## 📄 PROJECT DESCRIPTION

This project is focused on the use of **Java Generics**, **bounded type parameters**, **interfaces**, and **method overloading**. It is designed across three levels of increasing complexity, helping students understand and apply generic programming principles step by step.

---

## 🔹 KEY FEATURES

- ✔ Create and use non-generic and generic classes  
- ✔ Apply method overloading with generics  
- ✔ Use wildcards and bounded types in method definitions  
- ✔ Implement and restrict generics using interfaces  
- ✔ Practice abstraction and code reusability in Java  

---

## 💻 TECHNOLOGIES USED

- ✔ Java 17+  
- ✔ IntelliJ IDEA / Eclipse  
- ✔ JDK & JRE  
- ✔ Git & GitHub for version control
- ✔ Maven

---

## 📋 REQUIREMENTS

- ✔ Java Development Kit (JDK 17 or higher)  
- ✔ IDE such as IntelliJ IDEA or Eclipse  
- ✔ Basic understanding of Java OOP concepts  
- ✔ Git installed for pushing code to GitHub  

---

## 🛠️ INSTALLATION & SETUP

1️⃣ Clone the repository:

```bash
git clone <https://github.com/FlavioKde/S106javaGenerics.git>
2️⃣ Navigate to the project folder:

bash
Copiar
Editar
cd Java-Generics-Exercises
3️⃣ Open the project in your preferred IDE (IntelliJ or Eclipse)

4️⃣ Compile and run the desired class from the src directory

▶️ EXECUTION INSTRUCTIONS
🔹 LEVEL 1: BASIC GENERICS
✔ Exercise 1: NoGenericMethods
Create a class NoGenericMethods that stores three arguments of the same type. It includes:

A constructor that initializes the three fields

Getters and setters for each field

Verifies that values can be passed in any order regardless of type

Run:

bash
Copiar
Editar
java -cp target/classes level1.exercise1.MainNoGenericMethods
✔ Exercise 2: GenericMethods & Persona Class
Create:

A Persona class with attributes: name, surname, and age

A GenericMethods class with a method that takes three generic arguments and prints them

Call this method in Main, passing different types:

A Persona object

A String

A primitive type (e.g., int)

Run:

bash
Copiar
Editar
java -cp target/classes level1.exercise2.MainGenericMethods
🔹 LEVEL 2: RESTRICTING GENERICS
✔ Exercise 1: Mixed-Type Parameters
Modify the previous method so that one of the parameters is no longer generic.
This allows the method to handle both fixed and flexible types.

Run:

bash
Copiar
Editar
java -cp target/classes level2.exercise1.MainMixedGenerics
✔ Exercise 2: Varargs & Unbounded Parameters
Update the generic method to accept a variable-length argument list (...args) of generic type.
This allows passing any number of arguments of any type.

Run:

bash
Copiar
Editar
java -cp target/classes level2.exercise2.MainVarargsGenerics
🔹 LEVEL 3: INTERFACE & BOUNDED GENERICS
✔ Exercise 1: Interface-Based Type Restrictions
Create:

An interface Telefon with method trucar()

A class Smartphone that implements Telefon and adds ferFotos()

A generic class Generica with:

One method restricted by the Telefon interface

Another method restricted by the Smartphone class

A main class Principal that:

Instantiates a Smartphone

Calls both generic methods from Generica using that object

🔒 Note: The method restricted by Telefon cannot call ferFotos(), as it’s not part of the interface.

Run:

bash
Copiar
Editar
java -cp target/classes level3.exercise1.Principal
🌐 DEPLOYMENT
✔ Ensure classes are located correctly in your Java project structure

✔ Compile from the correct level and package

✔ Always test method outputs before committing

✔ Use .gitignore to exclude compiled files and IDE configs

🤝 CONTRIBUTIONS
Contributions are welcome! Follow these steps:

1️⃣ Fork the repository
2️⃣ Create a new branch:

bash
Copiar
Editar
git checkout -b feature/YourFeature
3️⃣ Commit your changes:

bash
Copiar
Editar
git commit -m "Add feature: Generics with interface restrictions"
4️⃣ Push to your fork:

bash
Copiar
Editar
git push origin feature/YourFeature
5️⃣ Create a Pull Request

📌 NOTES
✔ This project is a learning exercise

✔ Aim to refactor and improve your understanding over time

✔ Pay special attention to method signatures when using generics

✔ Test each level and method independently

🚀 HAPPY CODING & GOOD LUCK ON YOUR LEARNING JOURNEY! ✨

