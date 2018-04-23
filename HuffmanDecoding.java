/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void HuffmanDecoding(String S ,Node root)
    {
        String result="";
        Node base = root;
        
        while(!S.isEmpty())
        {
            if(S.charAt(0)=='1')
            {
                base = base.right;
                S = S.substring(1);
            }
            else
            {
                base = base.left;
                S = S.substring(1);
            }
            if(base.left==null && base.right==null)
            {
                result = result + base.data;
                base = root;
            }
        }
        System.out.println(result);
    
    }
       
    
