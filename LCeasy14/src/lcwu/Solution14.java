package lcwu;

public class Solution14 {

	public String longestCommonPrefix(String[] strs) {
	if(strs.length==0)return "";
	String s=strs[0];
	for(int i = 1;i<strs.length;i++) {
		while(strs[i].indexOf(s)!=0) {
			s=s.substring(0, s.length()-1);
			if (s.isEmpty())return"";
		}
	}
		return s;
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] teststring = {"flower","flow","flight"};
		Solution14 solution14 = new Solution14();
		String aString =solution14.longestCommonPrefix(teststring);
		System.out.println("-------"+aString+ "------");
		

	}

}