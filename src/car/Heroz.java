/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car;

/**
 *
 * @author Aurel
 */
public class Heroz {
    //field
    public String Nama; // Nama hero
    public String Role; // Role hero (Fighter, Tank, Marksman, Mage, Assassin, Support)
    public String Hp; // Hp atau banyaknya darah hero
    public String Attack; // Damage attack hero
    
    // constructor default
    public Heroz(){ 
    }

    // constructor untuk inisialisasi objek dengan nilai tertentu, contoh: "this.Nama = Nama" berarti menginisialisasi Nama yang ada di field dengan nilai Nama yang ada di parameter, dst
    public Heroz(String Nama, String Role, String Hp, String Attack){ 
        this.Nama = Nama;
        this.Role = Role;
        this.Hp = Hp;
        this.Attack = Attack;
    }

    // method yang menampilkan atribut object
    public void infoHeroz(){ 
        System.out.println("Nama: " + Nama); // menampilkan nama hero
        System.out.println("Role :" + Role); // menampilkan role hero
        System.out.println("HP: " + Hp); // menampilkan HP hero
        System.out.println("Attack: " + Attack); // menampilkan attack hero
    }

    // method untuk mencetak suara hero saat bertarung
    public String hiak(){
        return "Hiakh!!!"; // suara hero teriak "Hiakh!!!"
    }
        // method untuk mencetak suara pukulan hero saat bertarung
    public void bugh(){
        System.out.println("Bugh! Bugh! Bugh! Bugh"); // suara hero memukul/menonjok lawannya, "bugh bugh bugh bugh"
    }
}
