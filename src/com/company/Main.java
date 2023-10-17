package com.company;

import com.company.user.User;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //List
        System.out.println("List\n");
        ArrayList<String> list1 = new ArrayList<String>();

        String[] data = {"sea", "power", "pointers", "magic", "ash"};
        list1.addAll(Arrays.asList(data));
        for (String element : list1) {
            System.out.println(element);
        }
        System.out.println("/////////////////////////////////");

        ArrayList<String> list2 = new ArrayList<String>(list1);
        for (String element : list2) {
            System.out.println(element);
        }
        System.out.println("/////////////////////////////////");

        String[] data2 = {"cannon", "water", "point"};
        ArrayList<String> list3 = new ArrayList<String>(Arrays.asList(data2));
        for (String element : list3) {
            System.out.println(element);
        }
        System.out.println("/////////////////////////////////");

        int middle = list2.size() / 2;
        list2.addAll(middle, list3);
        for (String element : list2) {
            System.out.println(element);
        }
        System.out.println("/////////////////////////////////");

        Collections.sort(list2, Collections.reverseOrder());
        for (String element : list2) {
            System.out.println(element);
        }
        System.out.println("/////////////////////////////////");

        ListIterator<String> listIterator = list2.listIterator();
        int index = 0;
        while (listIterator.hasNext()) {
            listIterator.next();
            if (index % 2 == 1) {
                listIterator.remove();
            }
            index++;
        }
        for (String element : list2) {
            System.out.println(element);
        }
        System.out.println("/////////////////////////////////");


        //Set
        System.out.println("\nSet\n");
        HashSet<String> set1 = new HashSet<String>();

        set1.add("carrot");
        set1.add("rock");

        set1.addAll(list1);
        set1.addAll(list2);

        for(String element : set1){
            System.out.println(element);
        }
        System.out.println("/////////////////////////////////");

        LinkedHashSet<String> set2 = new LinkedHashSet<String>();

        set2.addAll(list1);
        set2.addAll(list2);

        for(String element : set2){
            System.out.println(element);
        }
        System.out.println("/////////////////////////////////");


        //Map
        System.out.println("\nMap\n");
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<Integer, String>();

        map1.put(0, "January");
        map1.put(1, "February");
        map1.put(2, "March");
        map1.put(3, "April");
        map1.put(4, "May");
        map1.put(5, "June");
        map1.put(6, "July");
        map1.put(7, "August");
        map1.put(8, "September");
        map1.put(9, "October");
        map1.put(10, "November");
        map1.put(11, "December");

        System.out.println("First: " + map1.get(0));
        System.out.println("Last: " + map1.get(11));
        System.out.println("/////////////////////////////////");

        map1.put(6, "VACATION");
        System.out.println(map1.get(6));
        System.out.println("/////////////////////////////////");

        HashMap<Integer, String> map2 = new HashMap<Integer, String>();

        map2.putAll(map1);

        showMap(map2);
        System.out.println("/////////////////////////////////");

        Map<String, Set<String>> map3 = new HashMap<String, Set<String>>();

        Set<String> dataStudent = new HashSet<String>();
        dataStudent.add("+380995156592");
        dataStudent.add("anton@gmail.com");
        dataStudent.add("my_skype");

        map3.put("Anton", dataStudent);


        //Working with your class
        System.out.println("\nWorking with your class\n");
        HashSet<User> userSet = new HashSet<User>();

        User user1 = new User("Anton", 17, "+380995156592");
        User user2 = new User("Anton", 17, "+380995156592");
        User user3 = new User("Anton", 20, "+380995156592");

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        for (User user : userSet) {
            System.out.println("Name: " + user.getName() + ", Old: " + user.getOld() + ", Phone: " + user.getPhone());
        }
    }

    public static void showMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
