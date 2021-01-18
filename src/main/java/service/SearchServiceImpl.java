package service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class SearchServiceImpl implements SearchService{
    ArrayList<Integer> arrayList;

    public SearchServiceImpl(){
        arrayList = new ArrayList<Integer>();
        for(int i=0;i<2000000;i++){
            arrayList.add(i);
        }
    }

    @Override
    public void binarySearch(int key) {
        Collections.binarySearch(arrayList,key);
    }

    @Override
    public void linearSearch(int key) {
        arrayList.indexOf(key);
    }
}
