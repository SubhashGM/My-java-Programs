import java.util.Scanner;

public class Electricityprob {
    public static void main(String[] args) {
        double units,charge=0,surcharge=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the units Consumed: ");
        units=sc.nextInt();
        if(units<199)
            charge=units*1.2;
        else if(units>=200&&units<400)
            charge=units*1.5;
        else if(units>=400&&units<600)
            charge=units*1.8;
        if(charge>400)
            surcharge=charge+(charge*0.15);
        else
            surcharge=100;
            System.out.println(surcharge);
        sc.close();
    }
}
