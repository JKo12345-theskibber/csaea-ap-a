public class Student {
   private String name;
   private int grade;

   public Student(String n, int g) {
      name = n;
      grade = g;
   }

   public void printInfo() {
      System.out.println(name + " — Grade " + grade);
   }
}