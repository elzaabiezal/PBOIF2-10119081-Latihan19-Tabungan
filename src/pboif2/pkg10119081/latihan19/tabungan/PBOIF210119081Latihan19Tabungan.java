/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan19.tabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama  : Muhammad Elza Abiezal
 * Kelas : IF-2
 * NIM   : 10119081
 * Deskripsi program : Tabungan
 */
public class PBOIF210119081Latihan19Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
     
        int lama,i;
        String hasil;
        float bunga;
        double saldoAwal, saldoTotal;
        
        System.out.print("Saldo Awal    : Rp. ");
        saldoAwal=input.nextDouble();
        
        System.out.print("Bunga/bulan(%): ");
        bunga=input.nextFloat();
        
        System.out.print("Lama (bulan) : ");
       lama=input.nextInt();
        
        bunga = (float) (bunga/100);
        System.out.println(bunga);
        
        for (i=1;i<=lama;i++){
            saldoTotal = (saldoAwal * 0.15) + saldoAwal ;
            System.out.printf("Saldo dibulan ke-" + i + "%s %n", kursIndonesia.format(saldoTotal));
            saldoAwal = saldoTotal;
        }
    }
    
}
