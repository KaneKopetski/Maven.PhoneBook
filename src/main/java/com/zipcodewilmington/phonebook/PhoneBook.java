package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    private Map<String,List<String>> map;
    private List<String> list = new ArrayList<>();

    public PhoneBook(Map<String, List<String>> map) {
        this.map = map;
    }

    public PhoneBook() {
        map = new LinkedHashMap<String, List<String>>();
    }

    public void add(String name, String phoneNumber) {
        list.add(phoneNumber);
        map.put(name, list);
    }

    public void addAll(String name, String... phoneNumbers) {
        for (String string: phoneNumbers) {
            list.add(string);
        }
        map.put(name,list);
    }

    public void remove(String name) {
        map.remove(name);
    }

    public Boolean hasEntry(String name) {
        Boolean result;
        if (map.containsKey(name)) {
            return true;}
        else if (list.contains(name)) {
            return true;}
        else return false;
    }

    public List<String> lookup(String name) {
        return map.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String result= "";
        for (Map.Entry<String,List<String>> entry: map.entrySet()
        ) {
            result = entry.getKey();
        }
        return result;
    }

    public List<String> getAllContactNames() {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String,List<String>> entry: map.entrySet()
        ) {
            result.add(entry.getKey());
        }
        return result;
    }

    public Map<String, List<String>> getMap() {
        return this.map;
    }
}
