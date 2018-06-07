package pl.cschool.week2;

public class Tools {

    public static int[][] histogram(int[][] tabIn, int noOfdiffValues) {
        int[] tabV = new int[noOfdiffValues];
        int[] tabF = new int[noOfdiffValues];

        int indexOfLastFr = 0;
        for (int i = 0; i < tabIn.length; i++) {
            for (int k = 0; k < tabIn[i].length; k++) {

                int value = tabIn[i][k];
                boolean valueExists = false;

                for (int j = 0; j < tabV.length; j++) {
                    if (tabV[j] == value) {
                        tabF[j]++;
                        valueExists = true;
                    }
                }
                if (!valueExists) {
                    tabV[indexOfLastFr] = value;
                    tabF[indexOfLastFr] = 1;
                    indexOfLastFr++;
                }
            }
        }


        int[][] result = new int[2][noOfdiffValues];
        result[0] = tabV;
        result[1] = tabF;
        return result;

    }

    public String histogramToString(int[][] tab) {
    StringBuilder result = new StringBuilder();
    for(int i=0; i<tab[0].length; i++) {
        result.append(tab[0][i] + "\t");
        for (int j=0; j<tab[1][i]; j++) {
            result.append("*");
        }
        result.append("\n");
    }
        return  result.toString();
    }


     public static void printHistogram(int[][] tab) {
         for (int i=0; i<tab[0].length; i++ ) {
             System.out.print(tab[0][i] + "\t");
             for (int j=0; j<tab[1][i]; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }
}
