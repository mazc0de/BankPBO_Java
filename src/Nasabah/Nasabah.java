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
public class Nasabah {
    public String namaNasabah;
    public int noRek;
    public int saldoRek;
    public int pinCard;
    
    Scanner input = new Scanner(System.in);
    
    public Nasabah(){


    }

    public Nasabah(String namaNasabah, int noRek, int saldoRek, int pinCard) {
        this.namaNasabah = namaNasabah;
        this.noRek = noRek;
        this.saldoRek = saldoRek;
        this.pinCard = pinCard;
    }
//    public cekPin(){
//        
//    }
    public void cekInfo(){
        System.out.println("================= Info Rekening ===============");
        System.out.println(" Nama Pemilik : "+namaNasabah);
        System.out.println(" Nomor Rekening : "+noRek);
        System.out.println(" Saldo Rekening : Rp "+saldoRek+",-");
        System.out.println("===============================================");
        System.out.println("Press enter..");
        String cekInfo = input.nextLine();
    }
    
    public void transferUang(){
        boolean loop = true;
        while(loop){
            System.out.println("================= Transfer Uang ===============");
            System.out.print(" Masukkan Nomor Rekening : ");
            int rekTujuan = input.nextInt();
            System.out.print(" Masukkan Nominal : ");
            int nominalTf = input.nextInt();
            System.out.print("Apakah Data Tersebut Benar? (y/n) ");
            char cekData = input.next().charAt(0);
            
            if(cekData == 'y'){
                if(saldoRek < nominalTf){
                    System.out.println(" \nMaaf Saldo Anda Kurang");
                    System.out.println(" Transaksi Dibatalkan");
                    System.out.println(" Sisa Saldo Anda Adalah : Rp "+saldoRek+",-");
                    System.out.print("Apakah Anda Ingin ber Transaksi lagi? (y/n) ");
                    char cekKurangSaldo = input.next().charAt(0);
                    if(cekKurangSaldo == 'y'){
                        
                    }
                    else{
                        loop = false;
                    }
                }
                else{
                    System.out.println(" Transaksi Sedang Diproses...");
                    System.out.println(" Transaksi Berhasil");
                    saldoRek = saldoRek - nominalTf;
                    System.out.println(" Sisa Saldo Anda Adalah Rp "+saldoRek+",-");
                    System.out.print("Apakah Anda Ingin ber Transaksi lagi? (y/n) ");
                    char cekCukupSaldo = input.next().charAt(0);
                    if(cekCukupSaldo == 'y'){
                        
                    }
                    else{
                        loop = false;
                    }
                }
            }

            System.out.println("Terima Kasih");
            System.out.println("===============================================");
        }
    }
    
    public void ambilUang(){
        boolean loop = true;
        while(loop){
            System.out.println("================== Tarik Tunai ================");
            System.out.print(" Masukkan Nominal : ");
            int nominalWD = input.nextInt();
            System.out.print(" Apakah Data Tersebut Benar? (y/n) ");
            char cekData = input.next().charAt(0);
            if(cekData == 'y'){
                if(saldoRek < nominalWD){
                    System.out.println(" Maad Saldo Anda Kurang");
                    System.out.println(" Transaksi Dibatalkan");
                    System.out.print("Apakah Anda Ingin ber Transaksi lagi? (y/n) ");
                    char cekKurangSaldo = input.next().charAt(0);
                    if(cekKurangSaldo == 'y'){
                        
                    }
                    else{
                        loop = false;
                    }
                }
                else{
                    System.out.println(" Transaksi sedang diproses...");
                    System.out.println(" Transaksi Berhasil");
                    saldoRek = saldoRek - nominalWD;
                    System.out.println("Sisa Saldo Anda Adalah Rp "+saldoRek+",-");
                    System.out.print("Apakah Anda Ingin ber Transaksi lagi? (y/n) ");
                    char cekSaldoCukup = input.next().charAt(0);
                    if(cekSaldoCukup == 'y'){
                        
                    }
                    else{
                        loop = false;
                    }
                }
            }
            else{
                loop = false;
            }
            System.out.println("Terima Kasih");
            System.out.println("===============================================");
        }
    }
    
    public void depositUang(){
        boolean loop = true;
        while(loop){
            System.out.println("================ Deposit Uang ================");
            System.out.print(" Masukkan Nominal : ");
            int deposit = input.nextInt();
            System.out.print(" Apakah Data Tersebut Benar? (y/n) ");
            char cekData = input.next().charAt(0);
            if(cekData == 'y'){
                System.out.println(" Transaksi Sedang Diproses...");
                System.out.println(" Transaksi Berhasil");
                saldoRek = saldoRek + deposit;
                System.out.println(" Saldo Anda Sekarang Adalah Rp "+saldoRek+",-");
                System.out.print("Apakah Anda Ingin ber Transaksi lagi? (y/n) ");
                char cekDepositLagi = input.next().charAt(0);
                    if(cekDepositLagi == 'y'){
                        
                    }
                    else{
                        loop = false;
                    }
            }
            else{
                loop = false;
            }
            System.out.println("Terima Kasih");
            System.out.println("===============================================");
        }
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public int getNoRek() {
        return noRek;
    }

    public void setNoRek(int noRek) {
        this.noRek = noRek;
    }

    public int getSaldoRek() {
        return saldoRek;
    }

    public void setSaldoRek(int saldoRek) {
        this.saldoRek = saldoRek;
    }

    public int getPinCard() {
        return pinCard;
    }

    public void setPinCard(int pinCard) {
        this.pinCard = pinCard;
    }
    
    
    
    
}
