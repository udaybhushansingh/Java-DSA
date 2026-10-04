public class Rec_binary {
    static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr , 3 , 0 , arr.length -1));

    }

    static int search (int [] arr , int  t, int  s, int e ) {

        if (s > e) {
            return -1;

        }
        int m = s + (e - s) / 2;
        if (arr[m] == t) {
            return m;
        } else {
            if (arr[s] <= arr[m]) {
                if (t <= arr[s] && t >= arr[m]) {
                    return search(arr, t, s, m - 1);
                } else {
                    return search(arr, t, m + 1, e);
                }
            }
            if (t >= arr[m] && t <= arr[e]) {
                    return search(arr, t, m + 1, e);
                }
                return search(arr, t, s, m - 1);
            }
        }
    }
