/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nasabah;

import java.util.Scanner;

/**
 *
 * @author Mazc0de
 */
public class Bank {
    public static void main(String[] args) {
        Nasabah bank = new Nasabah();
        bank.namaNasabah = "Daffa";
        bank.noRek = 123456789;
        bank.saldoRek = 10000;
        bank.pinCard = 1010;
        
        System.out.println(" ____              _      _____  ____   ____  \n" +
                            "|  _ \\            | |    |  __ \\|  _ \\ / __ \\ \n" +
                            "| |_) | __ _ _ __ | | __ | |__) | |_) | |  | |\n" +
                            "|  _ < / _` | '_ \\| |/ / |  ___/|  _ <| |  | |\n" +
                            "| |_) | (_| | | | |   <  | |    | |_) | |__| |\n" +
                            "|____/ \\__,_|_| |_|_|\\_\\ |_|    |____/ \\____/ ");
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        
        
        System.out.println("========== Selamat Datang Di Bank PBO ==========");
        System.out.println(" Masukkan Kartu ...");
        while(loop){
            System.out.println(" Ketik 1 Jika sudah");
            System.out.print(" Input : ");
            int enterCard = input.nextInt();
            if(enterCard == 1){
                loop = false;
            }
            else{
                System.out.println("Input Salah!");
            }
        }
        System.out.println("===============================================");
        System.out.println(" Kesempatan Anda 3x");
        int loopPin = 3;
        while(loopPin>=1){ 
            System.out.println("Kesempatan Anda "+loopPin+" Lagi");
            System.out.print(" Masukkan Pin : ");
            int enterPin = input.nextInt();
            if(enterPin == bank.getPinCard()){
                System.out.println("Pin anda benar");

                boolean loops = true;
                while(loops){
                    System.out.println("========== Selamat Datang Di Bank PBO ==========");
                    System.out.println(" 1. Cek Info Rekening");
                    System.out.println(" 2. Transfer Uang");
                    System.out.println(" 3. Ambil Uang");
                    System.out.println(" 4. Deposit Uang");
                    System.out.println(" 99. Keluar");
                    System.out.println("===============================================");
                    System.out.print(" Silahkan Pilih Menu : ");
                    int pilihMenu = input.nextInt();
                    if(pilihMenu == 1){
                        bank.cekInfo();
                    }
                    else if(pilihMenu == 2){
                        bank.transferUang();
                    }
                    else if(pilihMenu == 3){
                        bank.ambilUang();
                    }            
                    else if(pilihMenu == 4){
                        bank.depositUang();
                    }
                    else if(pilihMenu ==99){
                        loops = false;
                    }
                    else{
                        System.out.println(" Menu Tidak Tersedia");
                    }
                    System.out.println(" Terima Kasih Telah Menggunakan Layanan BANK PBO");
                    System.out.println(" SEMOGA HARIMU MENYENANGKAN");
                }
                break;
            }
            else{
                System.out.println("Pin Anda Salah!");
                if(loopPin == 1){
                    break;
                }
            }
            loopPin--;
        }
        
    }
}
