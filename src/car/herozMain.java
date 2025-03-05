/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car;

/**
 *
 * @author Aurel
 */
import car.Heroz;
public class HerozMain {
    public static void main(String[] args) {
        Heroz batman, superman; //deklarasi variabel hero yaitu, Batman dan Superman

        //instansiasi batman
        batman = new Heroz();
        batman.Nama = "Batman"; // isi field Nama dengan Batman, berarti nama hero Batman
        batman.Role = "Fighter"; // isi field Role dengan Fighter, menunjukkan role Batman adalah Fighter
        batman.Hp = "17500"; // isi field Hp dengan 17500, HP Batman sebanyak 17500
        batman.Attack = "3000"; // isi field Attack dengan 3000, serangan Batman memberikan damage sebanyak 3000

        // instansiasi Superman
        superman = new Heroz();
        superman.Nama = "Superman"; // isi field Nama 
        superman.Role = "Fighter";
        superman.Hp = "20000";
        superman.Attack = "5000";

        //  menampilkan informasi hero Batman ( menampilkan objek dan atribut - atributnya )
        System.out.println("HERO STAT INFORMATION: " + "\n" + 
                           "Nama: " + batman.Nama + "\n"+ // menampilkan nama
                "Role: " + batman.Role + "\n"+
                "Hp: " + batman.Hp + "\n"+
                "Attack: " + batman.Attack + "\n" + "Attack sound: " + batman.hiak()+ "\n" + "Another attack sound: "
                );
        batman.bugh();
        System.out.println();
        
        System.out.println("HERO STAT INFORMATION: " + "\n" +
                           "Nama: " + superman.Nama + "\n"+
                "Role: " + superman.Role + "\n"+
                "Hp: " + superman.Hp + "\n"+
                "Attack: " + superman.Attack + "\n" + "Attack sound: " + superman.hiak()+ "\n" + "Another attack sound: "
                );
        superman.bugh();
        System.out.println();
    }
}
