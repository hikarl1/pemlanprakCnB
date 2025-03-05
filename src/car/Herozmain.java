/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car;

/**
 *
 * @author Aurel
 */
public class Herozmain {
    //field
    public String Nama;
    public String Role;
    public String Hp;
    public String Attack;
    
    //method
    public Herozmain(){
    }
    
    public Herozmain(String Nama, String Role, String Hp, String Attack){
        this.Nama = Nama;
        this.Role = Role;
        this.Hp = Hp;
        this.Attack = Attack;
    }
    
    public void Herozmain(){
        System.out.println("Nama: " + Nama);
        System.out.println("Role :" + Role);
        System.out.println("HP: " + Hp);
        System.out.println("Attack: " + Attack);
    }
    
    public String hiak(){
        return "Hiakh!!!";
    }
    public void bugh(){
        System.out.println("Bugh! Bugh! Bugh! Bugh");
    }
}
