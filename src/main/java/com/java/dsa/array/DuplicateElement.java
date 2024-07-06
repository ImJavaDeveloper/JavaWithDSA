package com.java.dsa.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

    public Set<Integer> findDuplicate(int [] array)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        Set result=new HashSet();
        for(int i=0;i<array.length;i++)
        {
            if(map.get(array[i]) != null)
            {
                map.put(array[i],map.get(array[i])+1);
                result.add(array[i]);
            }
            else
            {
                map.put(array[i],1);
            }
        }
        return  result;
    }
}
