package DSA;

import java.util.*;
import java.util.LinkedList;

public class BinaryTree {
    private BTnode root;
    public BinaryTree() { root=null;}
//    public BinaryTree(BTnode r){ root=r;}
    public void setRoot(BTnode r) {root=r;}
    public BTnode getRoot() {return root;}
    public BTnode createNode(int d){
        if(root==null){
            root=new BTnode(d);
            return root;
        }
        BTnode new_node = new BTnode(d);
        return new_node;
    }

    public void insert_levelwise(int d){
        BTnode new_node = new BTnode(d);
        BTnode iter;
        Queue<BTnode> q= new LinkedList<BTnode>();
        if(root==null){
            root=new_node;
            return;
        }
        q.add(root);
        while(!q.isEmpty()){
            iter=q.remove();
            if(iter.getLeft()==null){
                iter.setLeft(new_node);
                return;
            }
            else{
                q.add(iter.getLeft());
            }
            if(iter.getRight()==null){
                iter.setRight(new_node);
                return;
            }
            else{
                q.add(iter.getRight());
            }
        }
    }
    public void levelwise_traverse(){
        BTnode iter;
        Queue<BTnode> q= new LinkedList<BTnode>();
        if(root==null)
        {
            System.out.println("Empty List");
            return;
        }
        q.add(root);
        while(!q.isEmpty()){
            iter=q.remove();
            System.out.print(iter.getData()+" ");
            if(iter.getLeft()!=null)
                q.add(iter.getLeft());
            if(iter.getRight()!=null)
                q.add(iter.getRight());
        }
    }


    public int level_count(){
        int level_count=0, level;
        BTnode iter;
        BTnode dummy= new BTnode(-999);
        Queue<BTnode> q=new LinkedList<BTnode>();
        if(root==null){
            System.out.println("Empty list");
            return -999;
        }
        q.add(root);
        q.add(dummy);
        while(!q.isEmpty()){
            iter=q.remove();
            if(iter.getData()==-999){
                level_count=level_count+1;
                q.add(dummy);
                iter=q.remove();
            }
            if(iter.getLeft()!=null)
                q.add(iter.getLeft());
            if(iter.getRight()!=null)
                q.add(iter.getRight());

        }
        return level_count;
    }
}
