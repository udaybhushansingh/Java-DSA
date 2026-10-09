public class Tree_segment_query {
    static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};

        int n = arr.length;

        int[] tree = new int[4 * n];


        build(arr, tree, 0, n - 1, 0);

        // Query [1..3]
        int answer = query(tree, 0, n - 1, 1, 3, 0);
        System.out.println("Range Sum: " + answer);

        update(tree, 0, n - 1, 1, 10, 0);
        System.out.println(tree[0]);
    }
    static void build(int [] arr , int [] tree , int start , int end ,int treeIndex ){
        if (start == end) {
            tree[treeIndex] = arr[start];
            return;
        }
        int mid = (start + end) / 2;
        build(arr , tree ,start , mid ,2 * treeIndex + 1);
        build(arr , tree ,mid + 1 , end ,2 * treeIndex + 2);

        tree[treeIndex] = tree[2 * treeIndex + 1] + tree[2 * treeIndex + 2];
        }


    static int query(int[]tree , int start , int end , int queryStart , int queryEnd , int treeIndex) {

        if (queryStart <= start && end <= queryEnd) { // complete overlap
            return tree[treeIndex];
        }
        if (end < queryStart || start > queryEnd) { // no overlap
            return 0;
        }

        int mid = (start + end) / 2;
        int leftSum = query(tree, start, mid, queryStart, queryEnd, 2 * treeIndex + 1);
        int rightSum = query(tree, mid + 1, end, queryStart, queryEnd, 2 * treeIndex + 2);
        return leftSum + rightSum;


    }


    static  void update(int [] tree , int start, int end, int index , int value , int treeIndex){
        if ( start == end ){
            tree[treeIndex] = value ;
            return;
        }
        int mid = (start + end) / 2;
        if (index <= mid) {
            update(tree , start , mid , index, value,2 * treeIndex + 1 );
            update(tree , mid + 1, end , index, value,2 * treeIndex + 2 );
        }
        tree[treeIndex] = tree[2 * treeIndex + 1] + tree[2 * treeIndex + 2];
    }


}