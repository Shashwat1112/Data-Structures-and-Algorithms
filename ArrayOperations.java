package DSA;
import java.util.*;
public class ArrayOperations {
    private int arr[];

    public ArrayOperations(){
        arr= new int[5];
    }

    public ArrayOperations(int s){
        arr= new int[s];
    }

    public void ReadArray(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter elements :");
        for(int i=0; i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
    }

    public void printArray(){
        System.out.println("Array elements are = ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void leftShift(){
        int temp= arr[0];
        int i;
        for(i=0; i< arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[i]=0;
    }

    public void rightShift(){
        int temp=arr[arr.length-1],i;
        for(i= arr.length-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[i]=0;
    }

    public void leftRotate(){
        int i, temp=arr[0];
        for(i=0; i< arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[i]=temp;
    }

    public void rightRotate(){
        int i, temp=arr[arr.length-1];
        for(i= arr.length-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }

    public void insert_by_pos(int pos, int value){
        int i;
        for(i=arr[pos-1]; i>0 ; i--){
            arr[i+1]=arr[i];
        };
        arr[pos-1]=value;
    }

    public void delete_by_pos(int pos){
        int i;
        for(i=arr[pos-1]; i< arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
    }

    public void remove_duplicate(){
//        int tar[]=new int[arr.length];
//        int i,j,tar_index=0,flag=0;
//        for(i=0; arr[i]!=-999;i++){
//            for(j=0;j<=tar_index;j++){
//                if(arr[i]==tar[j]){
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag==0){
//                tar_index=tar_index+1;
//                tar[tar_index]=arr[i];
//            }
//        }
//        tar_index++;
//        tar[tar_index]=-999;
//        for(i=0;tar[i]!=-999;i++){
//            arr[i]=tar[i];
//        }
//        arr[i]=-999;

        int i,j;
        for(i=0; arr[i]!=-999; i++){
            for(j=i+1; arr[j]!=-999; j++){
                if(arr[i]==arr[j])
                    delete_by_pos(j+1);
            }
        }
    }
}
