public class Bubble {

static int[] bubbleSort(int[] x) {

        boolean swp = true;
        while(swp) {

            swp = false;
            for(int i = 0; i < x.length-1; i++) {

                if(x[i] > x[i+1]) {

                    swp = true;
                    int tmp = x[i];
                    x[i] = x[i+1];
                    x[i+1] = tmp;
                }
            }
        }
        return x;
    }
}
