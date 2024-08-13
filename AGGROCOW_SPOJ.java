package lec15;
import java.util.*;
public class AGGROCOW_SPOJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0) {
		int nos = s.nextInt();//
		int noc = s.nextInt();
		int[]stall = new int[nos];
		for(int i =0; i<stall.length;i++) {
			 stall[i]=s.nextInt();
		}
		Arrays.sort(stall);
		System.out.println(MinDistance(stall,noc));
		}

	}
	public static int MinDistance(int[]stall,int noc) {
		int lo = stall[0];
		int hi = stall[stall.length-1];
		int ans = 0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if (isitPossible(stall,noc,mid)==true) {
				ans = mid;
				lo = mid+1;
			}else {
				hi = mid -1;
			}
		}
		return ans;
	}
	public static boolean isitPossible(int[] stall, int noc, int mid) {
		int pos = stall[0];
		int countcow = 1;
		for (int i = 1;i<stall.length;i++) {
			if(stall[i]-pos>=mid) {
				countcow++;
				pos = stall[i];
			}
			if(countcow==noc) {
				return true;
			}
		}
		return false;
		
	}

}
