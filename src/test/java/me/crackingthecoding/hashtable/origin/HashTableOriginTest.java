package me.crackingthecoding.hashtable.origin;

/**
 * Created by wminikuma@gmail.com on
 * Blog : http://minikuma.github.io
 * Github : http://github.com/minikuma
 *
 * @ Author  : Jeon Ji Hoon
 * @ Date    : 2018-10-29
 * @ Version : 1.0.0
 * @ Comment : Hash Table Origin 구현 Test
 */
public class HashTableOriginTest {
    public static void main(String[] args) {
        HashTableOrigin hashTableOrigin = new HashTableOrigin(3);

        hashTableOrigin.put("mini", "he is cute");
        hashTableOrigin.put("kuma", "he is rude");
        hashTableOrigin.put("happy", "he is strong");
        hashTableOrigin.put("day", "he is good");

        System.out.println(hashTableOrigin.get("mini"));
        System.out.println(hashTableOrigin.get("kuma"));
        System.out.println(hashTableOrigin.get("happy"));
        System.out.println(hashTableOrigin.get("day"));
    }
}