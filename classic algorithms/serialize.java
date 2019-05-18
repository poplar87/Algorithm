//297. Serialize and Deserialize Binary Tree
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "#";
        String res= root.val+","+ serialize(root.left)+","+serialize(root.right);
        return res;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arrays=data.split(",");
        return deserialize(arrays,new int[]{0});
    }
     public TreeNode deserialize(String[] array ,int[] a) {
         if(array[a[0]].equals("#")){a[0]++;return null;}
         TreeNode node= new TreeNode(Integer.valueOf(array[a[0]++]));
      
         node.left=deserialize(array,a);
        node.right=deserialize(array,a);
         return node;
     }
}
