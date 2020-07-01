class Node
{
    int data;
    Node left, right;

    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}
class Size
{
    int size = 0;
}
class BinaryTree
{
    Node root;
    int heighAndSize(Node node, Size size)
    {
        if (node == null)
            return 0;
        int l = heighAndSize(node.left, size);
        int r = heighAndSize(node.right, size);
        size.size++;
        return (l > r) ? l + 1 : r + 1;
    }
    float density(Node root)
    {
        Size size = new Size();
        if (root == null)
            return 0;
        int _height = heighAndSize(root, size);
        return (float) size.size / _height;
    }
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        System.out.println("Density of given Binary Tree is : "
                + tree.density(tree.root));
    }
}
