package oop;


public class op101 {

    public static void main(String[] args) {

    }


}

class Human{
    String name;
    int age;
    void eat(){};
    void sleep(){};
}

class Student extends Human{

    int studentId;
    void goToSchool(){};
}
class Worker extends Human{
    int workId;
    void goToWork(){};
}

