package Leet;

import java.util.*;

public class LC_39_CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {2, 3, 6, 7};
		int amount =7;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		printcombination(coin,amount,ll,0,ans);
		System.out.println(ans);
	}
	
	public static void printcombination(int[] coin, int amount,List<Integer> ll,int index,List<List<Integer>> ans) {
		if(amount == 0) {
			//System.out.println(ll);
			//ans.add(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for(int i=index;i<coin.length;i++) {
			if(amount>=coin[i]) {
				ll.add(coin[i]);
				printcombination(coin,amount - coin[i],ll,i,ans);
				ll.remove(ll.size()-1);    // removing last element. /back tracking step
			}
		}
	}
}
