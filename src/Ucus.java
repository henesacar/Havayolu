import java.util.Scanner;
public class Ucus {
    public static void main(String[] args) {
        double distance, age, type,ageDiscount,typeDiscount,discountedPrice;
        double price = 0.10;
        Scanner scn = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        distance = scn.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = scn.nextInt();
        System.out.print("Yolculuk tipini giriniz( 1 => Tek Yön , 2 => Gidiş Dönüş): ");
        type = scn.nextInt();
       //Discount Block
        if( age < 12){
            ageDiscount = (distance*price)*0.5;
        }else if(age >= 12 && age < 24){
           ageDiscount = (distance*price)*0.1;
        }else if(age > 65){
            ageDiscount = (distance*price)*0.3;
        }else{ageDiscount = 0;}
        discountedPrice = (distance*price)-ageDiscount;
        //Type Hesap
        if(type == 1){
            typeDiscount = discountedPrice;
        }else if(type == 2){
            typeDiscount = discountedPrice*0.2;
        }else{typeDiscount=0;}
        //Distance Cost Hesap
        if(distance>0 && age>0 && type == 1){
            double cost = (distance*price) - ageDiscount;
            System.out.println("Toplam Tutar: " +cost);
        }else if(distance>0 && age>0 && type == 2){
            double cost = ((distance*price)-ageDiscount-typeDiscount)*2;
            System.out.println("Toplam Tutar: "+cost);
        }else{
            System.out.println("Hatalı veri girdiniz!");
        }
    }
}
