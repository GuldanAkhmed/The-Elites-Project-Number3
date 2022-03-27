package com.syntax.groupproject3;


    interface Shapes {
    /*
        Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
        Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
     */

        public double calculateArea ();
        public double calculatePerimiter ();
    }
    class Circle implements Shapes {
        double radius;
        // A=πr2 area
        // C=2πr circumfernce= perimeter
        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public double calculateArea() {
            return Math.PI * Math.pow(radius, 2);
        }
        @Override
        public double calculatePerimiter() {
            return Math.PI * 2 * radius;
        }
    }
    class Square implements Shapes {
        public Square(double side) {
            this.side = side;
        }

        double side;
        // A=a2 area
        // P=4a perimeter
        @Override
        public double calculateArea() {
            return side * 2 ;
        }

        @Override
        public double calculatePerimiter() {
            return side *4 ;
        }
    }
    public class Task01 {
        public static void main(String[] args) {
            Circle circle = new Circle(4);
            System.out.println(circle.calculateArea());
            System.out.println(circle.calculateArea());
            Square square = new Square(6);
            System.out.println(square.calculateArea());
            System.out.println(square.calculatePerimiter());
        }

    }
