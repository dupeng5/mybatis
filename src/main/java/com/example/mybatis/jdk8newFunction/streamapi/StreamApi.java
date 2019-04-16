package com.example.mybatis.jdk8newFunction.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @Author: dupeng5
 * @Date: 2019/4/16 10:58
 * @Version 1.0
 */
public class StreamApi {
    public void  streamGet(){
        //数组
        String[] arr = new String[]{"AB","WS","SD"};
        Stream<String> arrStream = Arrays.stream(arr);
        //集合
        List<String> list = new ArrayList<String>();
        Stream<String> listStream = list.stream();
        //值
        Stream<String> stream = Stream.of("AB","WS","SD");
    }
    public static void main(String[] args) {
        //初始化
        List<Person> list = Arrays.asList(
                // name，age
                new Person("张三", 11),
                new Person("王五", 20),
                new Person("王五", 91),
                new Person("张三", 8),
                new Person("李四", 44),
                new Person("李四", 44),
                new Person("李四", 44)
        );
        Person c = new Person();
        //  foreach
        System.out.println("foreach");
        list.stream().forEach( a->{
            System.out.println(a);
        });
        //  sorted
        System.out.println("sorted");
        list.stream().sorted(Comparator.comparing(Person::getAge)).forEach(a-> System.out.println(a));
        // filter
        System.out.println("filter");
        list.stream().filter(a->a.getAge()>30).forEach(a-> System.out.println(a));
        //limit
        System.out.println("limit");
        list.stream().limit(3).forEach(a-> System.out.println(a));
        //skip
        System.out.println("limit");
        list.stream().skip(3).forEach(a-> System.out.println(a));
        //distinct
        System.out.println("distinct");
        list.stream().distinct().forEach(a-> System.out.println(a));
        //max，min，sum，avg，count
        System.out.println("max，min，sum，avg，count ");
        IntSummaryStatistics num = list.stream().mapToInt(u->u.getAge()).summaryStatistics();
        num.getAverage();
        num.getCount();
        num.getMax();
        num.getMin();
        //map
        System.out.println("map");
        list.stream().map((s)->{ s.setAge(s.getAge()+10);return s;}).forEach(a-> System.out.println(a));
        //flatMap
        System.out.println("flatMap");
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5));
        Stream<Integer> integerStream = stream.flatMap( (Function<List<Integer>, Stream<Integer>>) integers -> integers.stream());
        List<Integer> collect = integerStream.collect(toList());
        collect.forEach(System.out::println);
        //findFirst
        System.out.println("findFirst");
        Person pes = list.stream().findFirst().get();
        System.out.println(pes);
        List<Person> pess = list.stream().limit(4).collect(toList());
        pess.forEach(System.out::println);
    }
}
