public class AttendanceTester {
   public static void main(String[] args) {
      AttendanceRecord jordan = new AttendanceRecord("Jordan", 4);
      AttendanceRecord riley = new AttendanceRecord("Riley", 7);

      jordan.markPresent();

      jordan.printAttendance();
      riley.printAttendance();
   }
}