package tree;

import tree.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * url:https://leetcode-cn.com/problems/find-mode-in-binary-search-tree/
 * Author:Savannah
 * Description:
 * 501. 二叉搜索树中的众数
 * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
 * <p>
 * 假定 BST 有如下定义：
 * <p>
 * 结点左子树中所含结点的值小于等于当前结点的值
 * 结点右子树中所含结点的值大于等于当前结点的值
 * 左子树和右子树都是二叉搜索树
 * 例如：
 * 给定 BST [1,null,2,2],
 * <p>
 * 1
 * \
 * 2
 * /
 * 2
 * 返回[2].
 * <p>
 * 提示：如果众数超过1个，不需考虑输出顺序
 * <p>
 * 进阶：你可以不使用额外的空间吗？（假设由递归产生的隐式调用栈的开销不被计算在内）
 * LeetCodeTesting 9/24/20
 */
public class _501_二叉搜索树中的众数 {

    int maxCnt = 0;
    int maxValue = 0;
    int curCnt = 0;
    int curValue = 0;
    List<Integer> list = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inOrderTraversal(root);
        int[] data = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            data[i] = list.get(i);
        }
        return data;
    }

    public void inOrderTraversal(TreeNode treeNode) {

        if (treeNode == null) {
            return;
        }
        inOrderTraversal(treeNode.left);
        System.out.println(treeNode.val);
        if (maxCnt == 0) {
            maxCnt++;
            curCnt++;
            curValue = treeNode.val;
            maxValue = treeNode.val;
            list.add(maxValue);
        } else {
            int value = treeNode.val;
            if (value == curValue) { //和上一次的结果相同
                curCnt++;
                if (curCnt == maxCnt) {
                    list.add(value);
                } else if (curCnt > maxCnt) {
                    list.clear();
                    list.add(maxValue);
                    maxCnt = curCnt;
                }
            } else {//和上一次结果不同
                curCnt = 1;
                curValue = value;
                if(maxCnt==curCnt){
                    list.add(curValue);
                }
            }
        }
        inOrderTraversal(treeNode.right);
    }
}
