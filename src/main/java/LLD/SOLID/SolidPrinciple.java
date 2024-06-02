package LLD.SOLID;
/*

The SOLID principles are a set of five design principles in object-oriented programming that, when followed, can make
software designs more understandable, flexible, and maintainable.

 */
public class SolidPrinciple {

    // 1. Single Responsibility Principle (SRP)
    //Principle: A class should have only one reason to change, meaning it should have only one job or responsibility.

    class Book {
        String title;
        String author;

        void printBookDetails() {
            // code to print book details
        }
    }

    class BookRepository {
        void saveToDatabase(Book book) {
            // code to save book details to the database
        }
    }



    // 2. Open/Closed Principle (OCP)
    //Principle: Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
    // To adhere to OCP, you can use polymorphism to add new shapes without modifying the Shape class:

    abstract class Shape {
        abstract double calculateArea();
    }

    class Circle extends Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle extends Shape {
        double length;
        double breadth;

        Rectangle(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        @Override
        double calculateArea() {
            return length * breadth;
        }
    }


    // 3. Liskov Substitution Principle (LSP)
    // Principle: Subtypes must be substitutable for their base types without altering the correctness of the program.

    abstract class Bird {
        abstract void move();
    }

    class FlyingBird extends Bird {
        @Override
        void move() {
            // flying code
        }
    }

    class Penguin extends Bird {
        @Override
        void move() {
            // walking code
        }
    }


    // 4. Interface Segregation Principle (ISP)
    // Principle: Clients should not be forced to depend on interfaces they do not use.

    interface Eater {
        void eat();
    }

    interface Sleeper {
        void sleep();
    }

    interface Flyer {
        void fly();
    }

    interface Swimmer {
        void swim();
    }

    class Dog implements Eater, Sleeper {
        @Override
        public void eat() {
            // eating code
        }

        @Override
        public void sleep() {
            // sleeping code
        }
    }


    //5. Dependency Inversion Principle (DIP)
    // Principle: High-level modules should not depend on low-level modules. Both should depend on abstractions.
    // Abstractions should not depend on details. Details should depend on abstractions.

    interface Switchable {
        void turnOn();
        void turnOff();
    }

    class LightBulb implements Switchable {
        @Override
        public void turnOn() {
            // turn on the bulb
        }

        @Override
        public void turnOff() {
            // turn off the bulb
        }
    }

    class Switch {
        Switchable device;

        Switch(Switchable device) {
            this.device = device;
        }

        void operate(String command) {
            if (command.equals("ON")) {
                device.turnOn();
            } else if (command.equals("OFF")) {
                device.turnOff();
            }
        }
    }

}
