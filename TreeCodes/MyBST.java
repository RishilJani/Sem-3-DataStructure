package TreeCodes;

public class MyBST {

    public TNode root;

    public MyBST() {
        root = null;
    }

    public void insert(int val) {
        root = InsRec(val, root);
    }

    public TNode InsRec(int val, TNode rt) {
        if (rt == null) {
            rt = new TNode(val);
            return rt;
        }
        if (val < rt.info) {
            rt.left = InsRec(val, rt.left);
        } else {
            rt.right = InsRec(val, rt.right);
        }
        return rt;
    }

    public void insertItr(int val) {
        if (root == null) {
            root = new TNode(val);
            return;
        }
        TNode n = new TNode(val);
        TNode curr = root;
        while (curr != null) {
            if (val < curr.info) {
                if (curr.left == null) {
                    curr.left = n;
                    return;
                } else {
                    curr = curr.left;
                }
            } else {
                if (curr.right == null) {
                    curr.right = n;
                    return;
                } else {
                    curr = curr.right;
                }
            }
        }
    }

    public void preOrder(TNode rt) {
        if (rt == null) {
            return;
        }
        System.out.print(rt.info + " ,");
        preOrder(rt.left);
        preOrder(rt.right);
    }

    public void inOrder(TNode rt) {
        if (rt == null) {
            return;
        }
        inOrder(rt.left);
        System.out.print(rt.info + " ,");
        inOrder(rt.right);
    }

    public void postOrder(TNode rt) {
        if (rt == null) {
            return;
        }
        postOrder(rt.left);
        postOrder(rt.right);
        System.out.print(rt.info + " ,");
    }

    public void deleteNode(int val) {
        if (root.info == val) {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            } else {
                root = adjustTree(root);
            }
            return;
        }
        deleteRec(val, root);
    }

    private void deleteRec(int val, TNode rt) {
        if (rt.info == val) {
            rt = null;
            return;
        }
        if (rt.left != null && rt.left.info == val) {
            TNode a = rt.left;
            if (a.left == null && a.right == null) {
                rt.left = null;
                return;
            }
            if (a.left == null) {
                rt.left = a.right;
            } else if (a.right == null) {
                rt.left = a.left;
            } else {
                rt.left = adjustTree(a);
            }

        } else if (rt.right != null && rt.right.info == val) {
            TNode a = rt.right;
            if (a.left == null && a.right == null) {
                rt.right = null;
                return;
            }
            if (a.left == null) {
                rt.right = a.right;
            } else if (a.right == null) {
                rt.right = a.left;
            } else {
                rt.right = adjustTree(a);
            }
        } else {
            if (rt.info > val) {
                deleteRec(val, rt.left);
            } else {
                deleteRec(val, rt.right);
            }
        }
    }

    private TNode adjustTree(TNode a) {
        TNode temp = a.right;
        while (temp.left != null) {
            temp = temp.left;
        }
        temp.left = a.left;
        return a.right;
    }

    public boolean searchNode(int val, TNode rt) {
        if (rt == null) {
            return false;
        }
        if (rt.info == val) {
            return true;
        }
        if (rt.info < val) {
            return searchNode(val, rt.right);
        } else {
            return searchNode(val, rt.left);
        }
    }

    public boolean isSame(TNode a, TNode b) {
        if (a == null && b == null) {
            return true;
        } else if (a == null || b == null) {
            return false;
        } else if (a.info != b.info) {
            return false;
        }
        return isSame(a.left, b.left) && isSame(a.right, b.right);
    }

    public boolean isSymmetric(TNode a, TNode b) {
        if (a == null && b == null) {
            return true;
        } else if (a == null || b == null) {
            return false;
        } else if (a.info != b.info) {
            return false;
        }
        return isSymmetric(a.left, b.right) && isSymmetric(a.right, b.left);
    }

}