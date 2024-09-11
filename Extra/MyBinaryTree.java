import java.util.LinkedList;
import java.util.Queue;

public class MyBinaryTree {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            right = null;
            left = null;
        }
    }

    static class BinaryTree {
        static int inx = -1;

        public static Node buildTree(int[] nodes) {
            inx++;
            if (nodes[inx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[inx]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");

        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelorder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }
                q.add(null);
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static int countOfNodes(Node root) {
        int ans = 0;
        if (root == null) {
            return 0;
        }
        int left = countOfNodes(root.left);
        int right = countOfNodes(root.right);
        ans = left + right + 1;

        return ans;
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int left = sumOfNodes(root.left);
        int right = sumOfNodes(root.right);
        return left + right + root.data;
    }

    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);
        int ans = Math.max(left, right) + 1;
        return ans;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        int ans = Math.max(diam1, Math.max(diam2, diam3));
        return ans;
    }

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int height = Math.max(left.ht, right.ht) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int diam = Math.max(diam1, Math.max(diam2, diam3));
        return new TreeInfo(height, diam);
    }

    public boolean isSame(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            return isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
        } else {
            return false;
        }
    }

    public boolean isSubtree(Node root, Node subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isSame(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static int sumOfKthLevel(Node root, int k) {
        if (k == 1) {
            return root.data;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        int i = 0, sum = 0;
        while (!q.isEmpty()) {
            if (i == k - 1) {
                Node temp = q.remove();
                while (temp != null) {
                    sum += temp.data;
                    temp = q.remove();
                }
                return sum;
            }
            Node curr = q.remove();
            if (curr == null) {
                q.add(null);
                i++;
            } else {
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

        }
        return sum;
    }

    public static boolean pathSum(Node root, int target) {
        boolean ans = summ(root, root.data, target);
        return ans;
    }

    public static boolean summ(Node root, int res, int target) {
        if (root == null) {
            return res == target;
        }
        boolean left = summ(root.left, res + root.data, target);
        boolean right = summ(root.right, res + root.data, target);
        System.out.println("root : " + root.data);
        return left || right;
    }

    public static void main(String[] args) {
        int[] nodes = { 3, 9, 20, -1, -1, 15, 7 };
        Node root = BinaryTree.buildTree(nodes);

        System.out.println(pathSum(root, 10));
        // System.out.print("preorder = ");
        // preorder(root);
        // System.out.print("\ninorder = ");
        // inorder(root);
        // System.out.print("\npostorder = ");
        // postorder(root);

        System.out.println("\nlevelorder = ");
        levelorder(root);

        // System.out.println("\ncountOfNodes = " + countOfNodes(root));
        // System.out.println("sumOfNodes = " + sumOfNodes(root));
        // System.out.println("heightOfTree = " + heightOfTree(root));
        // System.out.println("diameter = " + diameter(root));
        // System.out.println("diameter2 = " + diameter2(root).diam);
        // System.out.println("sumOfKthLevel = " + sumOfKthLevel(root,2));
    }
}
