import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> mappaCapoluoghi = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<String,String>("RO","Roma"),
                new AbstractMap.SimpleEntry<String,String>("TO","Torino"),
                new AbstractMap.SimpleEntry<String,String>("MI","Milano"),
                new AbstractMap.SimpleEntry<String,String>("VE","Venezia")
        ));

        //
        List<String> valoriMappaCapoluoghi = new ArrayList<String>(mappaCapoluoghi.values());

        //valori non ordinati
        System.out.println(valoriMappaCapoluoghi);

        //ordino i valori con l'ordine naturale di Java
        Collections.sort(valoriMappaCapoluoghi);

        //stampo i valori ordinati
        System.out.println(valoriMappaCapoluoghi);



    }

}
