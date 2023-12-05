package DSA;

public class Sorting_algo {
    public static void BubbleSort(int[]arr, int s){
        int i,j,flag,t;
        for(j=s-1; j>0; j--){
            flag=0;
            for(i=0; i<=j-1; i++){
                if(arr[i]>arr[i+1]){
                    t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                    flag=1;
                }
            }
            if(flag==0)
                break;
        }
    }
    public static void display(int []arr){
        int i;
        //System.out.println();
        for(i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void selection_sort(int arr[], int size) {
        int i,j,t,min;
        for(i=0; i<size-1; i++){
            min=i;
            for(j=i+1; j<size; j++){
                if(arr[min]>arr[j])
                    min=j;
            }
            if(min!=i)
            {
                t=arr[i];
                arr[i]=arr[min];
                arr[min]=t;
            }
        }
    }

    public static void insertion_sort(int []arr, int size){
        int i,j,k;
        for(i=0; i<size; i++){
            k=arr[i];
            for(j=i-1; j>=0 && arr[j]>k; j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=k;
        }
    }

    public static void main(String[] args) {
        int[] arr ={40,30,50,90,60};

        BubbleSort(arr,5);
        System.out.print("Bubble sort = ");
        display(arr);
        System.out.println();

        System.out.print("Selection sort = ");
        selection_sort(arr,5);
        display(arr);
        System.out.println();

        System.out.print("Insertion sort = ");
        insertion_sort(arr,5);
        display(arr);
        System.out.println();
    }
}
