  public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> total=new LinkedList<List<Integer>>();
         if(root==null)return total;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum=queue.size();
             List<Integer> list=new LinkedList<Integer>();
            for(int i=0;i<levelNum;i++){
            TreeNode tree=queue.poll();
            list.add(tree.val);
            if(tree.left!=null)
                queue.offer(tree.left);
            if(tree.right!=null)
                queue.offer(tree.right);
            }
             total.add(list);
        }
        return total;
    }
