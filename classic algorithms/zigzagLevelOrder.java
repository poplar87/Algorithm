public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> sol = new ArrayList<>();
        travel(root, sol, 0);
        return sol;
    }
    
    private void travel(TreeNode curr, List<List<Integer>> sol, int level)
    {
        if(curr == null) return;
        
        if(sol.size() <= level)
        {
            List<Integer> newLevel = new LinkedList<>();
            sol.add(newLevel);
        }
        
        List<Integer> collection  = sol.get(level);
        if(level % 2 == 0) collection.add(curr.val);
        else collection.add(0, curr.val);
        
        travel(curr.left, sol, level + 1);
        travel(curr.right, sol, level + 1);
    }
}
O(n) solution by using LinkedList along with ArrayList. So insertion in the inner list and outer list are both O(1),
Using DFS and creating new lists when needed.
should be quite straightforward. any better answer?




My C# solution - iterative BFS

public class Solution {
    public IList<IList<int>> ZigzagLevelOrder(TreeNode root) {
        List<IList<int>> result = new List<IList<int>>();
        if(root == null)
            return result;
        
        Queue<TreeNode> qu = new Queue<TreeNode>();
        qu.Enqueue(root);
        while(qu.Count > 0)
        {
            List<int> lst = new List<int>();
            int size = qu.Count;
            for(int i = 0; i< size; i++)
            {
                var node = qu.Dequeue();
                lst.Add(node.val);    
                if(node.left != null)
                    qu.Enqueue(node.left);
                if(node.right != null)
                    qu.Enqueue(node.right);                     
            }
            if(result.Count % 2 != 0)
                lst.Reverse();
            
            result.Add(lst);
        }
        return result;      
    }
}
