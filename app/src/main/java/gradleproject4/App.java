/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradleproject4;

import LecturerManagementSystem.*;
import java.util.Date;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        student_class sc = new student_class("paddy",9,new Date(2000/10/10),"thaing");
        System.out.println(new App().getGreeting());
    }
}
