
    int temp=-999;
    int flag = 0;
    void inorder(Node root)
   {
        if(root!=null)
        {
            inorder(root.left);
            if(root.data<=temp)
            {  flag= 1;
                return;
            }
             else
                temp = root.data;
            inorder(root.right);
            
        }
            
        
    }
    boolean checkBST(Node root) {
        if(root==null)
            return true;
        inorder(root);
        if(flag==1)
            return false;
        else
            return true;
    }