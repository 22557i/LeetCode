package lcwu;

public class Solution101 {

    public boolean isSymmetric(TreeNode root) {

    return(isMirror(root,root));
    }
    boolean isMirror (TreeNode a,TreeNode b){
        if(a==null&&b==null)return true;
        if(a==null||b==null)return false;
        return(a.val==b.val)&&isMirror(a.left,b.right)&&isMirror(a.right,b.left);
    }


}
