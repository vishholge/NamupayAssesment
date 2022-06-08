import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class  Coutry{

    public String india [] = {"+91","0","0.05","0.1","0.15","0.2","0.25","0.3"};
    public String usa []   = {"+1","0","0.03","0.07","0.11","0.12","0.22","0.25"};
    public String uk []    = {"+44","0","0.04","0.05","0.08","0.12","0.2","0.4"};

    public  double calculateTax(String countryCode, String ctc){
        ArrayList<String[]> list = new ArrayList<>();
        list.add(india);
        list.add(usa);
        list.add(uk);
        double tax  = 0;

        for(int i =0; i < list.size(); i++) {

            if (list.get(i)[0].equals(countryCode)) {
                int ctcVal = Integer.parseInt(ctc);
                if (ctcVal <= 250000) {

                } else if (ctcVal > 250000 && ctcVal <= 500000) {
                    double rate = Double.parseDouble(list.get(i)[2]);
                    tax = ctcVal * rate;
                } else if (ctcVal > 500000 && ctcVal <= 750000) {
                    double rate = Double.parseDouble(list.get(i)[3]);
                    tax = ctcVal * rate;
                } else if (ctcVal > 750000 && ctcVal <= 1000000) {
                    double rate = Double.parseDouble(list.get(i)[4]);
                    tax = ctcVal * rate;
                } else if (ctcVal > 1000000 && ctcVal <= 1250000) {
                    double rate = Double.parseDouble(list.get(i)[5]);
                    tax = ctcVal * rate;
                } else if (ctcVal > 1250000 && ctcVal <= 1500000) {
                    double rate = Double.parseDouble(list.get(i)[6]);
                    tax = ctcVal * rate;
                } else if (ctcVal > 1500000) {
                    double rate = Double.parseDouble(list.get(i)[7]);
                    tax = ctcVal * rate;
                }

            }


        }
        return tax;
    }

}
public class Namupay {
    public static void main(String[] args) {


        Coutry calforindia = new Coutry();
        double taxindia = calforindia.calculateTax("+91","400000");
        System.out.println(taxindia);

        Coutry calforusa = new Coutry();
        double taxinusa = calforusa.calculateTax("+1","1500000");
        System.out.println(taxinusa);


    }

}