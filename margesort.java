public class margesort {

    public static void conqur(int arr[], int si, int mid, int ei) {
        int marged[] = new int[ei - si + 1];
        int idex1 = si;
        int idex2 = mid + 1;
        int x = 0;
        while (idex1 <= mid && idex2 <= ei) {
            if (arr[idex1] <= arr[idex2]) {
                marged[x++] = arr[idex1++];
            } else {
                marged[x++] = arr[idex2++];
            }
        }
        while (idex1 <= mid) {
            marged[x++] = arr[idex1++];

        }
        while (idex2 <= ei) {
            marged[x++] = arr[idex2++];

        }
        for (int i = 0, j = si; i < marged.length; i++, j++) {
            arr[j] = marged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conqur(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 2, 1, 3, 9 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println();
    }
}
