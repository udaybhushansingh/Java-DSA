public class Treee_segment {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8};

        int n = arr.length;

        int[] tree = new int[4 * n];

        build(arr, tree, 0, n - 1, 0);
        System.out.println("Root: " + tree[0]);
    }

        static void build( int [] arr, int [] tree, int start , int end , int treeIndex) {
            if (start == end) {
                tree[treeIndex] = arr[start];
                return;

            }
            int mid = (start + end) / 2;

            build(arr , tree , start , mid , 2 * treeIndex +1 ); // for left
            build(arr ,tree ,mid+1 , end ,2 * treeIndex +2  ) ; // for right

            tree [treeIndex] = tree[2 * treeIndex +1] + tree[2 * treeIndex + 2 ];
        }

    }
