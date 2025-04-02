import java.util.ArrayDeque;
import java.util.ArrayList;

public class SlidingWindowMax {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int [] arr = {1,3,-1,-3,5,3,6,7};
        int i=0,j=0,n = arr.length,k=3;
        ArrayDeque<Integer> l = new ArrayDeque<Integer>();

        while(j < n){
            while(l.size() > 0 && l.peekLast() < arr[j]){
                l.removeLast();
            }

            l.add(arr[j]);

            if(j-i+1 < k) {
                j++;
            }

            else if(j-i+1 == k){
                System.out.println(l);
                ans.add(l.peek());

                if(l.peek() == arr[i]) l.removeFirst();
                i++;
                j++;
            }

        }
        System.out.println(i);
        System.out.println(ans);
    }
}
