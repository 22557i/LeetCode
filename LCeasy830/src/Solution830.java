import java.util.*;

public class Solution830 {
	public List<List<Integer>> largeGroupPositions(String S) {
		List<List<Integer>> res = new ArrayList();
		int i =0;
		int N =S.length();
		for(int j =0;j<N;j++){
			if(j==N-1||S.charAt(j)!=S.charAt(j+1)){
				if(j-i>=2){
					res.add(Arrays.asList(new Integer[]{i,j}));
				}
				i=j+1;
			}
		}
		return res;
	}
}
