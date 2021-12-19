
public class ArraySalesCom {
    static int commission (int sales){
        int totalCom;
        totalCom = (int) (sales * .09) + 200;
        return totalCom;
    }
    public static void main(String[] args) {
        int[] grosses = {200, 300, 400, 500, 600, 700, 800, 900, 1000};
        System.out.println("******Sales Commissions*******");
        
        System.out.printf( "    %s   %10s\n", "Gross", "Sales Commission");
        for (int i = 0; i < grosses.length; i++){
            System.out.printf("%5d - %d%9d\n", grosses[i] ,grosses[i]+99, commission(grosses[i]));
        }
    
    }
}