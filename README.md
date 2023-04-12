0. 라이브러리
1. import java.util.*;
2. import java.io.*;

변수선언
1. Stirng arr1 [] = new String[5];
2. int arr[] ={1,2,3};
3. int N =3;


Arrays
1. ex) int arr[] = {10, 8, 11, 2, 3, 0};
//오름차순
2. Arrays.sort(arr);
//내림차순
3. Arrays.sort(arr,Collections.reverseOrder());
//일부만 정렬(인덱스 0번부터 4번까지)
4. Arrays.sort(arr,0,4);
//배열의 특정범위 자르기
5. int temp[] = Arrays.copyOfRange(arr,0,3);



length / length() / size()

1. length : 베열의 길이. (arr.length)

2. length():String object ( str.length()) 

3. size(): Collections 

4. length
int[] arr = new arr[3];
System.out.println(arr.length);

5. length()
String str = "java";
System.out.println(str.length());

6. size()
ArrayList<Integer> list = new ArrayList<>();
System.out.println(list.size());




4. String 
String str ="Hello";

//배열로 만들고싶을때
String  Arr[] = str.split(" ");

//대소문자 변경
str = str.toUpperCase();
str = str.toLowerCase();

//jongka -> jongha 로변경하고싶을떄
//string은 재정의 불가. substring이용해서 재선언
String name ="jongka";
string rename = name.subString(0,4)+'h'+name.subString(5);



HashMap
// 1. 선언
HashMap<String, Integer> hm = new HashMap<>();

// 2. key-value 넣기
hm.put("java", 0);

// 3. 키로 값 가져오기
hm.get("java");

// 4. containsKey()로 존재유무 확인
if (!hm.containsKey("java")) hm.put("java", 1);

// 5. 특정 키가 없으면 값 설정, 있으면 기존 값 가져오는 함수
hm.put("java", hm.getOrDefault("java", 3);

// 6. keySet() 함수로 맵 순회
for(String key : hm.KeySet()) {				
hm.get(key);
}


ArrayList

//선언
ArrayList <String> list = new ArrayList<>();

//2.삽입

list.add("asd");
list.add(0,"add0");//0번째인덱스에 삽입
//3.수정
list.set(0,"xxx"); //0번째 인덱스 xxx로 수정

//4.삭제
list.remove(0);

//5.값의 유무
list.contains("asdsdad") //false 로나옴


//인덱스 오름차순 순회
Iterator it = list.iterator();

while(in.hasNext()){
...
}
//내림차순
while(in.hasPrevious()){
...
}




// 7. 중복없이 값을 넣고 싶을 때
if (list.indexOf(value) < 0) {	// 없으면 -1을 리턴하기 때문에
list.put(value);
}

// 8. 리스트 값 하나씩 가져올 때 (int 일 경우)
for(int i = 0; i < list.size(); i++) {
list.get(i).intValue();
}















