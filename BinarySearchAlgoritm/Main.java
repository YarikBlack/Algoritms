
class Main{
    public static void main(String[] args){
        int item = 0;
        int [] massive = new int[101];

        BinarySeacrch binary = new BinarySeacrch();
       
        // set a value to massive
        for(int i = 0; i < 101; i++){
            massive[i] = item;
            item++;
        }

        // set massive to argument in search function
        binary.search(massive, 30); // there is number that we looking for; you can set what you want to found
        
        
        //get search result
        binary.getSearchResult();
    }
}