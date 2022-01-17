
class BinarySearchMain{
    public static void main(String[] args){
        int item = 0;
        int searchNumber = 40; // set a value of number that we want to find
        int [] massive = new int[101];

        BinarySeacrch binary = new BinarySeacrch();
       
        // set a value to massive
        for(int i = 0; i < 101; i++){
            massive[i] = item;
            item++;
        }

        System.out.println("We looking for: " + searchNumber);

        // set massive to argument in search function
        binary.search(massive, searchNumber); // set number that you want found here
        
        
        //get search result
        binary.getSearchResult();
    }
}