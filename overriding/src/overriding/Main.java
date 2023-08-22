/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overriding;

/**
 *
 * @author muhammadalifmakkasau
 */
public class Main {
    public static void main(String[] args) {
        Pesawat pesawat = new PesawatPenumpang("Garuda", 150);

        pesawat.terbang();  // Memanggil metode terbang() dari PesawatPenumpang karena overriding
    }
}

