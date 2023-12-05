class Person{
   String name;
   String address;
   Person(String name,String address){
     this.name=name;
     this.address=address;
   }
   void setName(String name){
   this.name=name;
   }
   void setAddress(String address){
   this.address=address;
   }
   String getName(){
     return this.name;
   }
   String getAddress(){
     return this.address;
   }
   void print(){
     System.out.println(this.name+" "+this.address);
   }
}
class Student extends Person{
   int numCOurses;
   String[] courses;
   int[] grades;
   String name;
   String address;
   Student(String name,String address){
     super(name,address);
   }
   void getttName(){
   System.out.println(super.name);
   }
   void addCourseGrade(String[] courses,int[] grades){
     this.courses=courses;
     this.grades=grades;
   }
   void printGrades(){
     for(int i=0;i<grades.length;i++){
         System.out.print(grades[i]+" ");
      }
   }
   double getAverageGrade(){
   double avg=0.0,sum=0.0;
   for(int i=0;i<grades.length;i++){
         sum=sum+grades[i];
       }
   avg=sum/grades.length;
   return avg;
   }
}
class Teacher extends Person{
      int numCourses=0;
      String[] courses;
      Teacher(String name,String address){
        super(name,address);
        }
       void print(){
         System.out.println(name+" "+address);
         }
        
       boolean addCourse(String course){
       
        if(numCourses==0){
        courses[numCourses]=course;
        numCourses++;
        }
       else if(numCourses<5){
          for(int i=0;i<courses.length;i++){
             if(courses[i].compareTo(course)==0)
               return false;
          }
          courses[numCourses]=course;
          numCourses++;
       
        }
        else if(numCourses>=5){
          return false;
          }
          return true;
     }
  }
      
class Lab5_2{
    public static void main(String args[]){
      Student s=new Student("mamatha","waramgal");
      //System.out.println(Person.name);
      //s.getttName();
      String[] courses=new String[3];
      
      /*courses[0]="DBMS";
      courses[1]="DAA";
      courses[2]="OOPS";
      int[] grades=new int[3];
      grades[0]=10;
      grades[1]=9;
      grades[2]=10;
      s.addCourseGrade(courses,grades);
      s.printGrades();
      System.out.println(s.getAverageGrade());*/
      Teacher t=new Teacher("srujana","nzbd");
      t.print();
      t.addCourse("DBMS");
      
      
      
      
      }
}
      
   



