class Solution {
    public void traversal(TreeNode root, List<Integer> ans){
        if(root == null) return;
        traversal(root.left, ans); //left
        traversal(root.right, ans); // right
        ans.add(root.val); //node
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        traversal(root, ans);
        return ans;
    }
}