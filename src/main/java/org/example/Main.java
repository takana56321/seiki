package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //　1　動画で紹介されたものを一通り実装
        List<Integer> numberList = List.of(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10);
        numberList.stream()
                .filter(number -> number <= 5)
                .forEach(System.out::println);

        numberList.stream()
                .limit(3)
                .forEach(System.out::println);

        List<String> studentList = List.of("inoue" , "enami" , "tanaka" , "enami");

        System.out.println(studentList.stream()
                .sorted()
                .collect(Collectors.joining(",")));

        System.out.println(studentList.stream()
                .toList());

        System.out.println(studentList.stream()
                .map(String::toUpperCase)
                .filter(v -> v.startsWith("E"))
                .distinct()
                .findFirst());

        System.out.println(studentList.stream()
                .anyMatch(e -> e.startsWith("e")));

        //　2　文字列リストの要素10個作って、2文字以上を抽出
        //　　　文字列に変換して、区切りカンマ(,)をつけて出力
        List<String> animalList = List.of(
                "犬" , "猫" , "鳥" , "猿" , "キリン" ,
                "キジ" , "象" , "パイソン" , "狸" , "子豚"
        );

        System.out.println(animalList.stream()
                .filter(a -> a.length() >= 2)
                .collect(Collectors.joining(",")));

        //　3　数値リストを要素10個で作り、奇数だけを抽出
        //　　 抽出した奇数の平均を出して出力
        List<Integer> number = List.of(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10);

        System.out.println(number.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .average());

        // 4 ChatGPTに基本的なStreamAPIの課題を出してもらう
        //   文字列リストの長さの平均値を計算する
        List<String> average = List.of(
                "a" , "abcd" , "ab" , "abcdefg" , "abc" ,
                "abcdefghijklmnop"
        );

        System.out.println(average.stream()
                .mapToInt(String::length)
                .average());
    }
}