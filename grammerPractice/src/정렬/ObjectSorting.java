package 정렬;

import java.util.*;
/*
    객체 정렬 - 오름차순, 내림차순
             Comparator&compare, lambda
             Map.Entry<String, Integer> 정렬
 */
public class ObjectSorting {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("키1", 10);
        map.put("키2", 20);
        map.put("키3", 15);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());


        //1.comparator 정렬
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue(); //내림차순
            }
        });

        /*
        1-*.정리
        Collections.sort(컬렉션, new Comparator<비교원소 자료형>() {
            @Override
            public int compare(비교원소 자료형 o1, 비교원소 자료형 o2) {
                return o1.비교대상getter - o2.비교대상getter;
                return o1.getValue() - o2.getValue(); //오름차순
            }
        })

        Collections.sort(컬렉션, new Comparator<원소자료형>() {
            @Override
            public int compare(원소자료형 o1, 원소자료형 o2) {
                return o2.비교대상getter - o1.비교대상getter; //내림차순
            }
        })

         */

        //2-1.람다 정렬 - 비교대상 Comparable구현 ex : Integer
        Collections.sort(list , (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        //2-2.람다 정렬 - 비교대상 Comparable미구현 ex : int
        Collections.sort(list, (o1, o2) -> o2.getValue() - o1.getValue()); // 내림차순 소팅
        System.out.println(list);

        /*
        2-*. compareTo()정리

        숫자.compareTo(숫자) : 앞(숫자가) 크면 +1, 같으면 0, 앞(숫자가)작으면 -1 return
        문자열.compareTo(문자열) -> 처음문자부터 비교 - 포함 -> 길이차 return
                                               다른지점O -> 다른지점 문자 아스키코드 차 return
         */

        //3-1.comparingInt정렬 - 오름차순
        Collections.sort(list , Comparator.comparingInt(o->o.getValue()));

        //3-2.comparingInt 정렬 - 내림차순
        Collections.sort(list , Comparator.comparingInt(o->o.getValue()));
        Collections.reverse(list);


    }

    //4.상황 : 우선순위 큐 사용필요 -> 객체 Comparable &compareTo 구현

    static class pEdge implements Comparable<pEdge>{
        int s;
        int e;
        int w;

        public pEdge(int s, int e, int w){
            this.s=s;
            this.e=e;
            this.w=w;
        }

        @Override
        public int compareTo(pEdge o){
            return this.w - o.w;
        }
    }
}
