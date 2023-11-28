package BackTracking;

import java.util.ArrayList;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
		ArrayList<ArrayList<String>> list2 = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		partition(ques,list,list2);
		System.out.println(list2);
	}
	public static void partition(String ques,ArrayList<String> list,ArrayList<ArrayList<String>> list2){
		if(ques.length()==0) {
			list2.add(new ArrayList<String>(list));
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			String s = ques.substring(0,i);
			if(palindrome(s)) {
				list.add(s+"|");
				partition(ques.substring(i),list,list2);
				list.remove(list.size()-1);
			}
		}
	}
	public static boolean palindrome(String s) {
		int i=0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
