package me.crackingthecoding.hashtable.upgrade1;

/**
 * Created by wminikuma@gmail.com on
 * Blog : http://minikuma.github.io
 * Github : http://github.com/minikuma
 *
 * @ Author  : Jeon Ji Hoon
 * @ Date    : 2018-10-29
 * @ Version :
 * @ Comment :
 */
public class HashTableUpgrade1Test {
    public static void main(String[] args) {
        Service service = new Service(3);

        service.put("mini", "he is cute");
        service.put("kuma", "he is rude");
        service.put("happy", "he is strong");
        service.put("day", "he is good");

        System.out.println(service.get("mini"));
        System.out.println(service.get("kuma"));
        System.out.println(service.get("happy"));
        System.out.println(service.get("day"));
    }
}
