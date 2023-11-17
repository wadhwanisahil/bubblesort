public class quicksort {
    public static int partition(int x[], int low, int high) {
        int povit = x[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (x[j] < povit) {
                i++;
                int temp = x[i];
                x[i] = x[j];
                x[j] = temp;

            }
        }
        i++;
        int temp = x[i];
        x[i] = povit;
        x[high] = temp;
        return i;
    }

    public static void Quicksort(int x[], int low, int high) {

        if (low < high) {

            int povit = partition(x, low, high);
            Quicksort(x, low, povit - 1);
            Quicksort(x, povit + 1, high);
        }

    }

    public static void main(String[] args) {
        int x[] = { 3, 7, 2, 9 };
        int y = x.length;
        Quicksort(x, 0, y - 1);
        for (int k = 0; k < x.length; k++) {
            System.out.println(x[k]);
        }
        System.out.println();
    }
}
