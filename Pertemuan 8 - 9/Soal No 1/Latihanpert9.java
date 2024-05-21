
package latihanpert9;
  import java.util.Scanner;

/**
 *
 * @author Naufal Alamsyah R
 */

public class Latihanpert9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna untuk sisi-sisi segitiga
        System.out.print("Masukkan sisi1: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi2: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi3: ");
        double side3 = input.nextDouble();

        // Meminta input dari pengguna untuk warna
        System.out.print("Masukkan warna: ");
        String color = input.next();

        // Meminta input dari pengguna untuk properti filled
        System.out.print("Apakah segitiga terisi (true/false)? ");
        boolean filled = input.nextBoolean();

        // Membuat objek Segitiga
        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        // Menampilkan luas, keliling, warna, dan properti filled dari segitiga
        System.out.println("Luas segitiga: " + segitiga.getArea());
        System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
        System.out.println("Warna segitiga: " + segitiga.getColor());
        System.out.println("Apakah segitiga terisi? " + segitiga.isFilled());
        System.out.println(segitiga.toString());

        input.close();
    }
}



