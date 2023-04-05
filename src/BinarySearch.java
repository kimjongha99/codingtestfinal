
//이진탐색 ->무조건 데이터가 정렬되어있어야함.
// 전체 데이터의 반절을 잘라서 중간보다 검색하는 값이 크면 큰쪽으로 반절. ... 반복...

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BinarySearch {

    public  boolean searchF(ArrayList<Integer> dataList , Integer searchItem){
        if(dataList.size()==1 && searchItem == dataList.get(0)){
            return true;
        }
        if(dataList.size()==1 && searchItem != dataList.get(0)){
            return  false;
        }
        if(dataList.size()==0){
            return  false;
        }
        //지금까진 배열의 길이가 1인경우의 예외처리

        int med = dataList.size()/2;

        if(searchItem == dataList.get(med)){
            return  true;
        }
        //반절 나눈것이 검색값일경우
        else{
            if (searchItem < dataList.get(med)) {
                return this.searchF(new ArrayList<>(dataList.subList(0,med )),searchItem);
            }else{
                return  this.searchF(new ArrayList<>(dataList.subList(med,dataList.size())),searchItem);

            }
        }



   }
    public static void main(String[] args) {

        BinarySearch binarySearch= new BinarySearch();
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int index = 0; index < 10; index++) {
            testData.add((int)(Math.random() * 100));
        }
        Collections.sort(testData);
        System.out.println(testData);

        boolean result = binarySearch.searchF(testData, 10);
        System.out.println(result );
    }

}
