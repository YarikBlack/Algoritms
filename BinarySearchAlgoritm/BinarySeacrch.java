
public class BinarySeacrch {
    private int mid;
    
    int low = 0;

    int tries = 0;

    // method to binary search
    int search(int array[], int item){
        int high = array.length - 1;

        while(low <= high){
           mid = (low + high) / 2;
           int guess = array[mid];
           if(guess == item){
               return mid;
           } else if(guess > item){
               high = mid - 1;
               tries++;
           } else{
               low = mid + 1;
               tries++;
           }
        }
        if( low > high){
            mid = -1;
            return mid;
        }
        return mid;
    }

    // method to get search result 
    public void getSearchResult(){
        if( mid == -1){
            System.out.println("Item not found! :((");
            System.out.println("Used tryes: " + tries);
        } else{
            System.out.println("Search result: " + mid);
            System.out.println("Used tryes: " + tries);
        }
    }
}
