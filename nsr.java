import java.util.Arrays;
import java.util.Stack;

public class nsr {
    public static int[] getnsr(int[] heights){
        int n = heights.length;
        int[] nsr = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(nsr,n);
        st.push(n);
        for(int i = 0 ; i <  n  ; i++){
            int ce = heights[i];
            while(st.peek()!=n && ce < heights[st.peek()]){
               nsr[st.pop()] = i;
            }
            
            st.push(i);
        }
        return nsr;
    }
        
    
    
    
    public static int[] getnsl(int[] heights){
        int n = heights.length;
        int[] nsl = new int[n];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(nsl,0);
        st.push(-1);
        for(int i = 0 ; i <  n  ; i++){
            int ce = heights[i];
            while(st.peek()!= -1 && ce < heights[st.peek()]){
                nsl[st.pop()] = i ;
            }
            st.push(i);
        }
        return nsl;

    }
    public static void main(String[] args) {
        int[] arr = {8,2,3,1,5,6,5,4,3,60};
        int[] res = getnsl(arr);
        for (int i : res) {
            System.err.print(i+" ");
        }
    }
}
