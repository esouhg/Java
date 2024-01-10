public class Activity_Selection {
    public static void main(String args[]){
        activity[] arr = new activity[10];
        int[] strt = {1,2,3,4,7,8,9,9,11,12};
        int[] endd = {3,5,4,7,10,9,11,13,12,14};
        for(int i = 0; i<10; i++){
            arr[i] = new activity(strt[i], endd[i]);
        }
        for(int i =0; i<10; i++){
            System.out.println(arr[i].start + "  " + arr[i].end);
        }
        sort(arr, 0, 9);
        System.out.println("\n");
        for(int i =0; i<10; i++){
            System.out.println(arr[i].start + "  " + arr[i].end);
        }
        activity curr = arr[0];
        System.out.println(curr.start + "  " + curr.end);
        for(int i=1; i<10; i++){
            if(arr[i].start >= curr.end){
                curr = arr[i];
                System.out.println(curr.start + "  " + curr.end);
            }
        }

    }


    public static int partition(activity arr[], int low, int high)
    {
        int pivot = arr[high].end; 
        int i = (low-1); 
        for (int j=low; j<high; j++)
        {
            if (arr[j].end <= pivot)
            {
                i++;
                activity temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        activity temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
 

    public static void sort(activity arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
 

    
}

class activity{
    public int start;
    public int end;
    public activity(int start, int end){
        this.start = start;
        this.end = end;
    }
}
