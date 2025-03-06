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
        superman.Nama = "Superman"; // isi field Nama dengan Superman, memberi nama hero Superman
        superman.Role = "Fighter"; // field Role untuk Superman diisi dengan Fighter
        superman.Hp = "20000"; // Hp superman sebanyak 20000
        superman.Attack = "5000"; //field Attack diisi dengan 5000, dapat memberikan serangan kepada lawan sebanyak 5000

        //  menampilkan informasi hero Batman ( menampilkan objek dan atribut - atributnya )
        System.out.println("HERO STAT INFORMATION: " + "\n" + 
                           "Nama: " + batman.Nama + "\n"+ //menampilkan atribut Nama dari Superman
                "Role: " + batman.Role + "\n"+ //menampilkan Role dari Superman
                "HP: " + batman.Hp + "\n"+ //menampilkan banyaknya HP superman
                "Attack: " + batman.Attack + "\n" + "Attack sound: " + batman.hiak()+ "\n" + "Another attack sound: " //menampilkan damage dan suara bertarung dari superman
                );
        batman.bugh();
        System.out.println();
        
        //  menampilkan informasi hero Superman ( menampilkan objek dan atribut - atributnya )
        System.out.println("HERO STAT INFORMATION: " + "\n" + 
                           "Nama: " + superman.Nama + "\n"+ //menampilkan atribut Nama dari Superman
                "Role: " + superman.Role + "\n"+ // menampilkan Role dari Superman
                "HP: " + superman.Hp + "\n"+ //menampilkan banyaknya HP superman
                "Attack: " + superman.Attack + "\n" + "Attack sound: " + superman.hiak()+ "\n" + "Another attack sound: " //menampilkan damage dan suara bertarung dari superman
                );
        superman.bugh();
        System.out.println();
    }
}
