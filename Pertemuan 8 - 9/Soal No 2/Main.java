package person;

/**
 *
 * @author Naufal
 */

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Naufal Alamsyah Ramanda", "Jalan Geger Arum No. 115", "0895326458245", "naufalramanda@gmail.com");
        System.out.println(person.toString());

        Student student = new Student("Aura Reghina Suci", "Jalan Pasir Impun No. 13", "085456325456", "araasucii@gmail.com", Student.MAHASISWA_BARU);
        System.out.println(student.toString());

        Employee employee = new Employee("Cahya Mutaqin", "Jalan Geger Kalong No. 99", "082654698569", "cahyamutaqin@gmail.com", "Kantor 358", 5000000, new Date());
        System.out.println(employee.toString());

        Faculty faculty = new Faculty("Lyna", "Jalan Juwita No. 34", "089654632564", "lynainayah@gmail.com", "Kantor 479", 9000000, new Date(), "8 AM - 5 PM", "Dosen");
        System.out.println(faculty.toString());

        Staff staff = new Staff("Gina Afifah", "Jalan Ledeng No. 55", "084567890123", "ginaafifah@gmail.com", "Kantor 268", 6000000, new Date(), "CEO");
        System.out.println(staff.toString());
    }
}