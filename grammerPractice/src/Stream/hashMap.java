package Stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class hashMap {



    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 4);

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println("key : "+entry.getKey()+" value : "+entry.getValue());
        }

        System.out.println(map.entrySet().stream()
                .map(Map.Entry<String, Integer>::getKey)
                .collect(Collectors.toList())
        );


        /*
        <초기화>
        컬렉션.stream() ex : map.entrySet().stream()
        배열.stream()
         */

        /*
        <변경>
        자료형 변환 - .map(클래스::메써드)) ex : .map(Map.Entry<String, Integer>::getKey)
                   .mapToInt(Integer::intValue)
        값 변경 - .map(i -> i+1)
        정렬 - .sorted()
         */

        /*
        <삭제>
        값 삭제 - .filter(i -> i != null)
                .filter(Objects::nonNull)
         */

        /*
        자료구조변환 - to배열 - int배열 : toArray()
                           Integer배열 : toArray(Integer[]::new)
                   to리스트 : toCollect()
         */

    }
}
