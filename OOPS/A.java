//single inheritence
// class A {
//     void showA(){
//         System.out.println("a class methods");
//     }
//     public static void main(String[] args) {
//         A obj1 = new A();
//         obj1.showA();
//         // obj1.showB();     //error

//         B obj2 = new B();
//         obj2.showA();
//         obj2.showB();
//     }
// }
// class B extends A{
//     void showB(){
//         System.out.println("b class methods");
//     }
// }





// multilevel inheritence
// class A {
//     void showA(){
//         System.out.println("a class methods");
//     }
//     public static void main(String[] args) {
//         A obj1 = new A();
//         obj1.showA();
//         // obj1.showB();     

//         B obj2 = new B();
//         obj2.showA();
//         obj2.showB();
//         // obj2.showC();

//         C obj3 = new C();
//         obj3.showA();
//         obj3.showB();
//         obj3.showC();
//     }
// }
// class B extends A{
//     void showB(){
//         System.out.println("b class methods");
//     }
// }
// class C extends B{
//     void showC(){
//         System.out.println("c class methods");
//     }
// }





//Hierarchical inheritence
class A{
    void showA(){
        System.out.println("a class methods");
    }
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.showA();
        // obj1.showB();
        // obj1.showC();
        B obj2 = new B();
        obj2.showA();
        obj2.showB();
        
        C obj3 = new C();
        obj3.showA();
        obj3.showC();
        // obj3.showB();
    }
}
class B extends A{
    void showB(){
        System.out.println("b class methods");
    }
}
class C extends A{
    void showC(){
        System.out.println("c class methods");
    }
}

