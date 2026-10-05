package Hotel_Billing_System;
import java.util.Scanner;
import java.util.ArrayList;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<bill> bills = new ArrayList<>();
        System.out.println("Enter the no of Plates: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the details for Plate " + (i+1) + ":");
            bill bi = new bill();
            System.out.println("Enter the no of Parotas: ");
            bi.parota=sc.nextInt();
            System.out.println("Enter the No of PannerButterMasala: ");
            bi.PannerButterMasala=sc.nextInt();
            System.out.println("Enter the No of Dosa: ");
            bi.Dosa = sc.nextInt();
            System.out.println("Enter the No of Idlies: ");
            bi.Idly = sc.nextInt();
            System.out.println("Enter the no of Califlower Chilly: ");
            bi.Califlower65 = sc.nextInt();
            bills.add(bi);
            System.out.println("Details for Plate " + (i+1) + " added.");
        }
        for(int i=0;i<n;i++){
            System.out.println("Details for Plate " + (i+1) + ":");
            bill bi = bills.get(i);
            System.out.println("No of Parota: "+ bi.parota);
            System.out.println("NO of Dosa: "+ bi.Dosa);
            System.out.println("NO of Idly: "+bi.Idly);
            System.out.println("NO of Califlower65: "+bi.Califlower65);
            System.out.println("No of PannerButterMasala: "+bi.PannerButterMasala);
        }
        System.out.println("Enter the Plate No You Want to know: ");
        int kn = sc.nextInt();
        bill bi = bills.get(kn-1);
        System.out.println("No of Parota: "+ bi.parota);
        System.out.println("NO of Dosa: "+ bi.Dosa);
        System.out.println("NO of Idly: "+bi.Idly);
        System.out.println("NO of Califlower65: "+bi.Califlower65);
        System.out.println("No of PannerButterMasala: "+bi.PannerButterMasala);
    }
}
