package recursion;

import java.util.Stack;

public class ReverseStack {
	
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		System.out.println("Actual: "+st);
		int size = st.size();
		reverse(st, size);
		System.out.println("Reverse:"+st);
	}

	private static void reverse(Stack<Integer> st, int size) {
	   if(st.size() == 1) {
		   return;
	   }
	   	   
	   int temp = st.pop();
	   reverse(st, size-1);
	   insert(st,temp);
		
	}

	private static void insert(Stack<Integer> st, int temp) {
		if(st.size() == 0) {
			st.push(temp);
			return;
		}
		int temp1 = st.pop();
		insert(st,temp);
		st.push(temp1);
		
	}
}
