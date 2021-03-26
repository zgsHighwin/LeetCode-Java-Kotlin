package tree;

import tree.base.TreeNode;

/**
 * url:
 * Author:Savannah
 * Description:
 * LeetCodeTesting 10/20/20
 */
public class _剑指_Offer_54_二叉搜索树的第k大节点 {
    int i = 0;
    int cnt =0;
    public int kthLargest(TreeNode root, int k) {
        inOrderTraversal(root,k);
        return cnt;
    }

    public void inOrderTraversal(TreeNode root,int k){

        if(root==null){
            return;
        }

        inOrderTraversal(root.right,k);
        if(++i==k){

            cnt = root.val;
            return;
        }
        inOrderTraversal(root.left,k);
    }
}
