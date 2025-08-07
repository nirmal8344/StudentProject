package college;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Details> studentList = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for student " + i + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Roll No: ");
            int rno = Integer.parseInt(sc.nextLine());

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Year: ");
            String year = sc.nextLine();

            System.out.print("Transport Mode: ");
            String transport = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Blood Group: ");
            String bloodGroup = sc.nextLine();

            System.out.print("Mobile Number: ");
            String mobile = sc.nextLine();

            System.out.print("Email ID: ");
            String email = sc.nextLine();

            Details student = new Details(name, rno, dept, year, transport, gender, bloodGroup, mobile, email);
            studentList.add(student);
        }

        displayAllStudents(studentList);
        displayCSEStudents(studentList);
        displayTransportModeCount(studentList);
        displayGenderCount(studentList);

        sc.close();
    }

    public static void displayAllStudents(List<Details> list) {
        System.out.println("\nAll Students:\n");
        for (Details s : list) {
            System.out.println(s);
            System.out.println();
        }
    }

    public static void displayCSEStudents(List<Details> list) {
        System.out.println("CSE Students:\n");
        for (Details s : list) {
            if (s.dept.equalsIgnoreCase("CSE")) {
                System.out.println(s.name + " - " + s.rno);
            }
        }
    }

    public static void displayTransportModeCount(List<Details> list) {
        System.out.println("\nTransport Mode Count:\n");
        HashMap<String, Integer> map = new HashMap<>();
        for (Details s : list) {
            map.put(s.transport, map.getOrDefault(s.transport, 0) + 1);
        }
        for (String transport : map.keySet()) {
            System.out.println(transport + " : " + map.get(transport));
        }
    }

    public static void displayGenderCount(List<Details> list) {
        System.out.println("\nStudents by Gender:\n");
        for (Details s : list) {
            System.out.println(s.gender + " : " + s.name);
        }
    }
}
