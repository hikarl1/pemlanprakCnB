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
public class herozMain {
    public static void main(String[] args) {
        Heroz batman, superman;
        
        batman = new Heroz();
        batman.Nama = "Batman";
        batman.Role = "Fighter";
        batman.Hp = "17500";
        batman.Attack = "3000";
        
        superman = new Heroz();
        superman.Nama = "Superman";
        superman.Role = "Fighter";
        superman.Hp = "20000";
        superman.Attack = "5000";
                
        System.out.println("HERO STAT INFORMATION: " + "\n" +
                           "Nama: " + batman.Nama + "\n"+
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
        batman.bugh();
        System.out.println();
    }
}
