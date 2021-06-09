package P1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.System.*;

/*
 This class is all about the implemntations of
 */
public class StreamApi {

    public static void main(String[] args) {

        final String myName= "Manjeet";

        HashMap<String,String> mapObject = new HashMap<>();
        mapObject.put("Name",myName);
        mapObject.put("Age","20");
        out.println(" Value of the Object :=> Error "+mapObject);

        List<String> listObject = new ArrayList <>();
        listObject.add(myName);
        listObject.add("Kumar");

        List<String> l = listObject.stream().filter((String s) -> s.equals("Manjeet")).collect(Collectors.toList());
        out.println(l);

        List<Object> newListObject = listObject.parallelStream()
                                    .filter((String s) -> s.equals("Kumar"))
                                    .collect(Collectors.toUnmodifiableList());
        out.println(newListObject);

        List ln = Collections.singletonList(listObject.parallelStream().filter((String s) -> s.equals("Kumar")).distinct().count());
        out.println(ln);

//        if(10 >=30){
//            out.println("The value what we enter is something what i want to have ");
//        }
//        else{
//            out.println("Value is not equal to the amount of the value what you want to have ");
//        }

    }
}
