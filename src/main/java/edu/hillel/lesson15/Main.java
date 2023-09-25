package edu.hillel.lesson15;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        TestInterface test = new TestImpl();
        test.calculate(1, 1);


//        TestInterface testInterface = (int a1, int a2) -> {return a1+a2;};

//        TestInterface testInterface = (int a1, int a2) -> a1 + a2;

//        TestInterface testInterface = (a1, a2) -> a1 + a2;

//        TestInterface testInterface = Integer::sum;
//        System.out.println(testInterface.calculate(5, 7));
//        testInterface = (a1, a2) -> a1 - a2;
//        System.out.println(testInterface.calculate(5,2));


//        Function<Integer, String> function = String::valueOf;
//        System.out.println(function.apply(3));

//        Function<Integer, Integer> multiply = (value) -> value * 2;
//
//        Function<Integer, Integer> add = (value) -> value + 3;
//
//        System.out.println(multiply.apply(5));
//        System.out.println(add.apply(1));
//
//        final Function<Integer, Integer> addThenMultiply = multiply.compose(add);
//        System.out.println(addThenMultiply.apply(2));
//
//        final Function<Integer, Integer> multiplyThenAdd = multiply.andThen(add);
//
//        System.out.println(multiplyThenAdd.apply(2));


//        Predicate<List<Integer>> predicate = integers -> !integers.isEmpty();
//
//        System.out.println(predicate.test(Collections.emptyList()));
//        System.out.println(predicate.test(ImmutableList.of(1)));
//
//        Predicate<List<Integer>> predicate1 = integers -> integers.contains(1);
//
//        final Predicate<List<Integer>> and = predicate.and(predicate1);
//
//        System.out.println(and.test(ImmutableList.of(1)));
//        System.out.println(and.test(ImmutableList.of(2)));
//
//        Supplier<Integer> supplier = () -> (int) (Math.random() * 1000);
//
//        System.out.println(supplier.get());
//        System.out.println(supplier.get());
//        System.out.println(supplier.get());
//        System.out.println(supplier.get());
//
//
//        Consumer<String> consumer = System.out::println;
//        consumer.accept("dsfsf");
//        consumer.accept("dsfsf123213");


//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(1);
//        numbers.add(6);
//
//        System.out.println(numbers);
//
//        numbers.removeIf(n -> (n % 3 == 0));
//        numbers.forEach(System.out::println);
//
//
//        Map<String, List<String>> map = new HashMap<>();
//
//        map.computeIfAbsent("Path1", s -> {
//                List<String> list = new ArrayList<>();
//                list.add("File1");
//                return list;
//                });
//
//        map.computeIfAbsent("Path2", s -> {
//            List<String> list = new ArrayList<>();
//            list.add("File1");
//            return list;
//        });
//
//        System.out.println(map);
//
//
//        map.computeIfPresent("Path1", (key, value) -> {
//            value.add("File2");
//            return value;
//        });
//
//        map.computeIfPresent("Path2", (key, value) -> {
//            value.add("File2");
//            return value;
//        });
//
//        System.out.println(map);


        //Empty
        Stream<String> stream = Stream.empty();


        // Collection


//        Collection<String> collection = Arrays.asList("3", "d", "232");
//        final Stream<String> stream1 = collection.stream();
//
//
//        final Stream<String> d = Stream.of("d", "d", "df");
//
//
//        String[] arr = new String[] {"d", "d", "df"};
//
//        final Stream<String> stream2 = Arrays.stream(arr);
//
//        final Stream<String> build = Stream.<String>builder().add("dd").add("sdsd").add("dsd").build();
//
//
//        Stream<Integer> iterate = Stream.iterate(40, n -> n + 2).limit(20);
//
//        System.out.println(iterate.collect(Collectors.toList()));
//
//
//        List<String> list = new ArrayList<>();
//
//        list.add("1");
//        list.add("2");
//        list.add("3");
//
//
//        list.forEach(System.out::println);
//
//
//        final Stream<String> stream3 = list.stream().filter(element -> element.contains("1"));
//        System.out.println(stream3.collect(Collectors.toList()));

        List<String> uris = new ArrayList<>();

        uris.add("C:\\MyComputer:\\File.txt");

        final Set<Path> collect = uris.stream().map(Paths::get).collect(Collectors.toSet());

        List<Car> cars = new ArrayList<>();
        final List<List<Passangers>> collect1 = cars.stream().map(car -> car.getPassangersList()).collect(Collectors.toList());


        List<Integer> primeNumbers = Arrays.asList(5, 7, 11, 13);
        List<Integer> oddNumbers = Arrays.asList(1, 3, 5);
        List<Integer> evenNumbers = Arrays.asList(2, 4, 6);

        final List<List<Integer>> lists = Arrays.asList(primeNumbers, oddNumbers, evenNumbers);

        System.out.println(lists);

        final List<Integer> collect2 = lists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect2);


        final Map<Integer, List<Passangers>> collect3 =
                cars.stream().collect(Collectors.toMap(Car::getId, Car::getPassangersList));
        System.out.println(collect3);

        collect2.stream().skip(3).limit(4).distinct().collect(Collectors.toList());


//        final boolean b = uris.stream().anyMatch(element -> element.contains("1"));
//        final boolean a = uris.stream().allMatch(element -> element.contains("1"));
//        final boolean c = uris.stream().noneMatch(element -> element.contains("1"));

        lists.stream().count();


        List<Integer> integers = Arrays.asList(1, 1, 1, 1);

        final Integer reduce = integers.stream().reduce(23, (a, b) -> a + b);
        System.out.println(reduce);


        final Optional<Integer> first = integers.stream().findFirst();

    }
}
