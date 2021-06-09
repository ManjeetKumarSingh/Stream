package P1;

import java.util.ArrayList;
import java.util.List;

public class ExperimentStreamAndParallelStream {

    public static void main(String[] args) {

        List<Integer> listOfElement = new ArrayList<>();

        for(int i=0; i <=2000 ; i++){
            listOfElement.add(i);
        }

        listOfElement.stream().forEach(System.out::println);

        listOfElement.parallelStream().filter((Integer i)-> i>=990).forEach(System.out::println);


    }
}
