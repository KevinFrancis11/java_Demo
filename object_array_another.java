class Student{
    int roll_No;
    String name;

    Student(int rn, String n){
        roll_No = rn;
        name = n;
    }

    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Roll number: "+ roll_No);
    }
}

class object_array_another {
    public static void main(String[] args) {
        //decleration and instantiation of object array or creating an array of Student object
        Student obj[] = new Student[3];

        obj[0] = new Student(1, "Kevin");
        obj[1] = new Student(7, "Ronaldo");
        obj[2] = new Student(11, "Neymar");
        
        obj[0].display();
        obj[1].display();
        obj[2].display();
    }
}
