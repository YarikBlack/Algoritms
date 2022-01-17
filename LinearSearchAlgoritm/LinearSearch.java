class LinearSearch{
    private int searchResult;
    private int current = 0;
    private int tries = -1;
    
    public int linear(int array[], int searchItem){

        for(int i = 0; i < array.length; i++){
            tries++;
            current = array[i];

            if(array[current] == searchItem){
                searchResult = current;
                return searchResult;
            }
        }
        return searchResult;
    }
    public void ShowSearchResult(){
        System.out.println("Search result: " + searchResult);
        System.out.println("Used tryes: " + tries);
    }
}