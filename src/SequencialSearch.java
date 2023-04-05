
//순자탐색
// 여러데이터중 원하는 데이터를 찾아내는 것을 의미 함.
// 0번부터 순차적으로...

import java.util.ArrayList;

public class SequencialSearch {
    public  int searchFunc(ArrayList<Integer> dataList, Integer searchItem){
        for(int i=0; i<dataList.size(); i++){
            if (dataList.get(i) == searchItem) {
                return i; //i번째에 있다.를 리턴
            }
        }
        return -1; //없으면 -1ㄹ탄
    }





    public static void main(String[] args) {
        SequencialSearch sSearch = new SequencialSearch();
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int index = 0; index < 10; index++) {
            testData.add((int)(Math.random() * 100));
        }
        System.out.println(testData);
        System.out.println(sSearch.searchFunc(testData, 19)); // 해당 숫자가 없으면, -1, 있으면 1을 리
    }
}