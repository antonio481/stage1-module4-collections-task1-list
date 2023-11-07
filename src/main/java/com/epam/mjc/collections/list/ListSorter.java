package com.epam.mjc.collections.list;


import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return Integer.compare(Integer.parseInt(a)*Integer.parseInt(a)*5+3,Integer.parseInt(b)*Integer.parseInt(b)*5+3);
    }
}
