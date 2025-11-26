class student{ // in this program we are creating the array of objects
    int rollno;
    String name;
    int marks;
}
public class arrObj {
    public static void main(String args[]){
        student s1=new student();
        s1.rollno=2;
        s1.name="sushi";
        s1.marks=88;
        student s2=new student();
        s2.rollno=3;
        s2.name="archi";
        s2.marks=86;
        student s3=new student();
        s3.rollno=5;
        s3.name="abhi";
        s3.marks=97;

        //System.out.println(s3.name+" "+s3.rollno+" "+s3.marks);
        student students[]=new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        
        // for(int i=0;i<students.length;i++){ // by using normal for loop
        //     System.out.println(students[i].rollno+" "+students[i].name+ " "+students[i].marks);
        // }
 
        //using enhanced for loop
        for(student n:students){
            System.out.println(n.rollno+" "+n.name+" "+n.marks);// this loop is called as enhanced for loop or in other programming languages its called as for each loop
        }
    }
    
}
