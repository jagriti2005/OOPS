// Polymorphism
//Method Overloading
// class Test {
//     void show(){
//         System.out.println("1");
//     }
//     void show(int a){
//         System.out.println("2");
//     }
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show();
//         t.show(10);
//     }
// }



// class Test {
//     void show(StringBuffer a){
//         System.out.println("string buffer method");
//     }
//     void show(String a){
//         System.out.println("string method");
//     }
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show("abc");      //string method
//         t.show(new StringBuffer("xyz"));        //string buffer methid
//         t.show(null);     //ambiguity error arises
//     }
// }




// class Test {
//     void show(String a){
//         System.out.println("string method");
//     }
//     void show(int a){
//         System.out.println("int method");
//     }
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show("abc");     //string method
//         t.show(10);        //int method
//     }
// }





// class Test {
//     void show(String a){
//         System.out.println("string method");
//     }
//     void show(int a){
//         System.out.println("int method");
//     }
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show('a');      //int method
//         t.show(10);       //int method
//     }
// }










//Method Overriding
// class Test{
//     void show(){
//         System.out.println("1");
//     }
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show();
//         xyz x = new xyz();
//         x.show();
//     }
// }
// class xyz extends Test{
//     void show(){
//         System.out.println("2");
//     }
// }




// class Test{
//     Object show(){
//         System.out.println("1");
//         return null;
//     }
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show();
//         xyz x = new xyz();
//         x.show();
//     }
// }
// class xyz extends Test{
//     String show(){
//         System.out.println("2");
//         return null;
//     }
// }





// class Test{
//     Object show() throws RuntimeException{
//         System.out.println("1");
//         return null;
//     }
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show();
//         xyz x = new xyz();
//         x.show();
//     }
// }
// class xyz extends Test{
//     String show() throws ArithmeticException{
//         System.out.println("2");
//         return null;
//     }
// }



// class Test{
//     void show(){
//         System.out.println("1");
//     }
//     public static void main(String[] args) {
//         xyz x = new xyz();
//         x.show();
//     }
// }
// class xyz extends Test{
//     void show(){
//         super.show();
//         System.out.println("2");
//     }
// }



// class Test{
//     public void show(){
//         System.out.println("1");
//     }
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.show();
//         xyz x = new xyz();
//         x.show();
//     }
// }
// class xyz extends Test{
//     private void show(){
//         System.out.println("2");
//     }
// }



//Overriding and Abstract Method...............
// abstract class Test{
//     abstract void display();
//     void show() throws RuntimeException{
//         System.out.println("1");
//     }
//     public static void main(String[] args) {
//         Xyz ob = new Xyz();
//         ob.show();
//     }
// }
// class Xyz extends Test{
//     void display(){

//     }
//     void show(){
//         System.out.println("2");
//     }
// }






//Interface in Java.............
// interface I1{
//     void show();
// }
// class Test implements I1{
//     public void show(){
//         System.out.println("1");
//     }

//     public static void main(String[] args) {
//         Test t1 = new Test();
//         t1.show();
//     }
// }





// interface I1{
//     public abstract void show();
//     public static final int a = 5;
// }
// class Test implements I1{
//     public void show(){
//         System.out.println("1");
//         System.out.println(a);
//     }

//     public static void main(String[] args) {
//         Test t1 = new Test();
//         t1.show();
//     }
// }




//Multiple Inheritence.............
// interface I1{
//     void show();
// }
// interface I2{
//     void display();
// }
// class Test implements I1,I2{
//     public void show(){
//         System.out.println("1");
//     }
//     public void display(){
//         System.out.println("2");
//     }

//     public static void main(String[] args) {
//         Test t1 = new Test();
//         t1.show();
//         t1.display();
//     }
// }










