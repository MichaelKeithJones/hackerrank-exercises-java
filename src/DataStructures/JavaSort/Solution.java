package DataStructures.JavaSort; /**
 * HackerRank exercise that teaches the purpose and use of
 * sorting and comparators in Java
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-5-29
 */


import java.util.*;
import java.util.stream.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        //--| Complete code here |--//
        List<Student> orderedStudentList = studentList
                .stream()
                .sorted(Comparator.comparingDouble(Student::getCgpa).reversed().thenComparing(Student::getFname).thenComparing(Student::getId))
                .collect(Collectors.toList());

        orderedStudentList.stream().map(Student::getFname).forEach(System.out::println);
    }
}
