// // import java.util.*;
// class Animal {
//     public void eat(){
//         System.out.println("i'm eating");
//     }
//     public static void main(String[] args) {
//         Animal buzo = new Animal();
//         buzo.eat();
//         buzo.run();
//     }
//     public void run(){
//         System.out.println("i'm running");
//     }
// }



// Object initialization
// 1) by references variable

// class Animal{
//     int age;
//     String color;
//     public static void main(String[] args) {
//         Animal buzo = new Animal();
//         buzo.age = 10;
//         buzo.color = "black";
//         System.out.println(buzo.color +" "+ buzo.age);
//     }
// }


// using method
// class Animal{
//     String color;
//     int age;
//     void initObj (String c,int a){
//         color = c;
//         age = a;
//     }
//     void display(){
//         System.out.println(color +" "+ age);
//     }
//     public static void main(String[] args) {
//         Animal buzo = new Animal();
//         buzo.initObj("black",10);
//         buzo.display();
//     }
// }





// class Animal {
//     public void eat(){
//         System.out.println("i'm eating");
//     }
//     public static void main(String[] args) {
//         Animal buzo = new Animal();
//         buzo.eat();
//         buzo.run();
//         Bird sp = new Bird();
//         sp.fly();
//     }
//     public void run(){
//         System.out.println("i'm running");
//     }
// }
// class Bird{
//     public void fly(){
//         System.out.println("i'm flying");
//     }
// }




//Inheritence
// class Animal{
//     void eat(){
//         System.out.println("i'm eating");
//     }
// }
// class Dog extends Animal{
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();
//     }
// }


