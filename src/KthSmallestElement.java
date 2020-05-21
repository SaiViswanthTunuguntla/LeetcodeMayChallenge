import java.util.Stack;

public class KthSmallestElement {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    int cnt,ans;
    public int kthSmallest(TreeNode root, int k) {
     cnt=0;
     inorder(root,k);
     return  ans;
    }

    private void inorder(TreeNode root, int k) {
        if(root==null) return;
        inorder(root.left,k);
        cnt++;
        if(cnt==k){
            ans=root.val;
            return;
        }
        inorder(root.right,k);
    }

    public int kthSmallestmethod2(TreeNode root, int k) {

        Stack<TreeNode> stack =new Stack<>();
        TreeNode node = root;
        int i=0;

        while(node!=null || !stack.isEmpty())
        {
            while(node!=null)
            {
                stack.add(node);
                node= node.left;
            }

            node= stack.pop();
            i++;

            if(i>=k)
                return node.val;

            node=node.right;

        }


        return -1;
    }


}
