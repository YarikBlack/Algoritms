public class LinearSearchMain {
    public static void main(String[] args){
        int item = 0;
        int massive[] = new int[101];
        int searchNumber = 50; // Enter a value to search here

        LinearSearch search = new LinearSearch();

        for(int i = 0; i < 101; i++){
            massive[i] = item;
            item++;
        }
        
        System.out.println("Stack is full!");

        search.linear(massive, searchNumber); // Enter a number you want to search here

        System.out.println("You are looking for: " + searchNumber);
    
        search.ShowSearchResult(); // Show result of Search and how many tries you spend

    }
}
