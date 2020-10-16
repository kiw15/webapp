public class Morning1016{
    public static void main(String[] args) {
        System.out.println("Java Simple");

        int[][] regAry = new int[5][5];
        int cnt= 1;
         
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                regAry[j][i]= cnt++;
            }
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.printf("%3d", regAry[i][j]);
            }
            System.out.println();
            }
        }
    }
