public class Main {
    public static void main(String[] args){
        int item = 0;
        int massive[] = new int[101];

        LinearSearch search = new LinearSearch();

        for(int i = 0; i < 101; i++){
            massive[i] = item;
            item++;
        }

        System.out.println("Stack is full!");

        search.linear(massive, 20);
        

    }
}
