package recursion;

import java.util.Stack;

class DeleteMiddleOfStack {
	
	private static void sort(Stack<Integer> s, int k) {
      //base condition
		if(k==1) {
			s.pop();
			return;
		}
		Integer temp = s.pop();	
		sort(s,k-1);
		s.add(temp);
	}

	public static void main(String[] args) {
       Stack<Integer> st = new Stack<>();
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       st.push(5);
       st.push(6);
       st.push(7);
       System.out.println("Odd size stack before" +st);
       int pos = (st.size() % 2) == 0 ? st.size()/2 : st.size()/2 + 1;
       //int pos =st.size()/2 + 1;
       sort(st,pos);
       System.out.println("Odd size stack after" +st);
       
       
       Stack<Integer> st2 = new Stack<>();
       st2.push(1);
       st2.push(2);
       st2.push(3);
       st2.push(4);
       st2.push(5);
       st2.push(6);
       System.out.println("Even size stack before" +st2);
       int pos2 = (st.size() % 2) == 0 ? st.size()/2 : st.size()/2 + 1;
       //int pos =st.size()/2 + 1;
       sort(st2,pos2);
       System.out.println("Even size stack after" +st2);
	}
}
