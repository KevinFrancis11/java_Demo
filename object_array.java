 class students{
    int roll;
    String name;
    int marks;
 }
 
 
 class object_array {
    public static void main(String[] args) {
        students s1 = new students();
        s1.roll = 1;
        s1.name = "Kevin";
        s1.marks = 99;

        students s2 = new students();
        s2.roll = 2;
        s2.name = "Neymar";
        s2.marks = 81;

        students s3 = new students();
        s3.roll = 3;
        s3.name = "Ronaldo";
        s3.marks = 45;

        students student[] = new students[3]; //object array declared and instantiated
        //array initialization
        student[0] = s1;   
        student[1] = s2;
        student[2] = s3;
        for(int i=0;i<student.length; i++){
            System.out.println(student[i].name+" "+student[i].marks);
        }
    }
}
