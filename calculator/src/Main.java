import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            if(sc.hasNextInt()){
                int price = sc.nextInt();

                int[] priceList = int_translator(price);
                System.out.printf("2.5%% : %d %n", priceList[0]);
                System.out.printf("5%% : %d %n", priceList[1]);
                System.out.printf("7.5%% : %d %n", priceList[2]);
            }else if(sc.hasNextDouble()){
                double price = sc.nextDouble();

                double[] priceList = double_translator(price);
                System.out.printf("2.5%% : %.2f %n", priceList[0]);
                System.out.printf("5%% : %.2f %n", priceList[1]);
                System.out.printf("7.5%% : %.2f %n", priceList[2]);
            }


        }

    }

    public static double[] double_translator(double price){
        double[] percentList = {1.025, 1.05, 1.075};
        double[] priceList = new double[3];
        for (int i=0;i<3;i++){
            priceList[i] = price*percentList[i];
        }
        return priceList;
    }

    public static int[] int_translator(int price){
        double[] percentList = {1.025, 1.05, 1.075};
        int[] priceList = new int[3];
        for (int i=0;i<3;i++){
            if(price*percentList[i] < 100000){
                if(price*percentList[i] %100 != 0){
                    priceList[i] = ((((int)(price*percentList[i])/100)+1)*100);
                }else{
                    priceList[i] = (int)(price*percentList[i]);
                }
            }else if(price*percentList[i] >= 100000){
                if(price*percentList[i] %500 != 0){
                    priceList[i] = ((((int)(price*percentList[i])/500)+1)*500);
                }else{
                    priceList[i] = (int)(price*percentList[i]);
                }
            }
        }
        return priceList;
    }
}

