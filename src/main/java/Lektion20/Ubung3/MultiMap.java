package Lektion20.Ubung3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiMap {
    Map<String,List<String>> mymap;

    MultiMap(){
        this.mymap= new HashMap<>();
    }
    public void put(String key,String value){
        if(!mymap.containsKey(key)) {
            mymap.put(key, new ArrayList<>());
            mymap.get(key).add(value);

        }else {
            mymap.get(key).add(value);
        }
    }
    public List<String> get(String key){
        if(mymap.containsKey(key)){
            return mymap.get(key);
        }else{
            return new ArrayList<>();
        }

}}
