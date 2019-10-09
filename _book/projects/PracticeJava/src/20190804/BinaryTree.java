class Node{
    public int data;
    public Node left;
    public Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class BinaryTree{
    private Node root;
    public BinaryTree(){
        root=null;
    }
    //�������������data
    public void insert(int data){
        Node newNode=new Node(data);
        if(root==null){root=newNode;}
        else{
            Node current =root;
            Node parent;
            while(true){
                parent=current;
                if(data<parent.data){
                    current=current.left;
                    if(current==null){
                        parent.left=newNode;
                        return;
                    }
                }else{
                    current=current.right;
                    if(current==null){
                        parent.right=newNode;
                        return;
                    }
                }

            }
        }
    }
    //���鹹��������
    public void buildTree(int[] data){
        for(int i =0 ;i<data.length;i++){
            insert(data[i]);
        }
    }
    //������������ݹ�ʵ��
    public void inOrder(){
        this.inOrder(this.root);
    }
    public void inOrder(Node localRoot){
        if(localRoot!=null){
            inOrder(localRoot.left);
            System.out.print(localRoot.data);
            inOrder(localRoot.right);
        }
    }
    //������������ݹ�ʵ��
    public void preOrder(){
        this.preOrder(this.root);
    }
    public void preOrder(Node localNode){
        if(localNode!=null){
            System.out.print(localNode.data);
            preOrder(localNode.left);
            preOrder(localNode.right);
        }
    }
    //������������ݹ�ʵ��
    public void postOrder(){
        this.postOrder(this.root);
    }
    public void postOrder(Node localNode){
        if(localNode!=null){
        postOrder(localNode.left);
        postOrder(localNode.right);
        System.out.print(localNode.data);
        }
    }
    public static void main(String[] args) {
        int[] data = {2,8,7,4,9,3,1,6,7,5};  
        BinaryTree biTree=new BinaryTree();
        biTree.buildTree(data);
        System.out.println("���������������");
        biTree.inOrder();
        System.out.println("���������������");
        biTree.preOrder();
        System.out.println("���������������");
        biTree.postOrder();
    }
}