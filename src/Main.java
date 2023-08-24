import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen işlem yapmak istediğiniz bankayı seçiniz.");
        System.out.println("1- HSBC\n2- İmar Bankası");
        int selectBank = input.nextInt();

        System.out.println("Kart numarası giriniz : ");
        int cardNumber = input.nextInt();
        System.out.println("Kartınızın son kullanma tarihini giriniz : ");
        int expireDate = input.nextInt();
        System.out.println("Kartınız CV kodunu giriniz : ");
        int CV = input.nextInt();
        System.out.println("Tutar giriniz : ");
        double price = input.nextDouble();

        switch (selectBank){
            case 1:
                HSBCBank HsbcPos = new HSBCBank("HSBC Bank", "119321815990", "48610554801");
                HsbcPos.connect("127.0.0.1");
                HsbcPos.sendCardInfo(price, cardNumber, expireDate, CV);
                break;
            case 2:
                ImarBankasi ImarpOS = new ImarBankasi("İmar Bankası", "11451172590", "12345678890");
                ImarpOS.connect("127.90.12.01");
                ImarpOS.sendCardInfo(price, cardNumber, expireDate, CV);
        }
    }
}