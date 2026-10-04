import java.lang.reflect.Array;

public class Create_own_Arraylist {
    static void main(String[] args) {


        MyArrayList list = new MyArrayList();

        for (int i = 1; i <= 12; i++) {
            list.add(i * 10);
        }

        System.out.println(list.get(0));   // 10
        System.out.println(list.get(5));   // 60
        System.out.println(list.get(11));  // 120
        System.out.println(list.size());   // 12
    }

    static class MyArrayList {
        private int[] data ;
        private int size ;

        MyArrayList(){
             data = new int [100] ;
             size = 0 ;
        }

        void  add(int value ){
            if (size == data.length){
                int []temp = new int [data.length * 2] ;

                for (int i = 0 ; i < data.length ; i ++){
                    temp[i] = data [i] ;
                }
              data = temp ;
            }
            data[size] = value;
            size ++ ;

        }
        int get (int index ){
            return data[index];
        }
        int size(){
            return size ;
        }
    }
}
