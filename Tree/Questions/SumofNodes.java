package Tree.Questions;

public class SumofNodes {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    //we always go first left subtree count and then right subtree count 
    //for x left tree and for right y so x+y+1 1 will be root
    public static int sumnodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum = sumnodes(root.left);
        int rightsum = sumnodes(root.right);

        return leftsum+rightsum+root.data;
    }

   

    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(sumnodes(root));
        
    }
}
