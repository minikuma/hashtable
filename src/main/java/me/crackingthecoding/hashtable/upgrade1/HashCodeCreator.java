package me.crackingthecoding.hashtable.upgrade1;

/**
 * Created by wminikuma@gmail.com
 * Blog : http://minikuma.github.io
 * Github : http://github.com/minikuma
 *
 * @ Author  : minikuma
 * @ Date    : 2018-10-29
 * @ Version : 1.0.0
 * @ Comment : Hash Function 구현
 */
public class HashCodeCreator implements SimpleHashCodeCreator {
    /***
     * @ param  : String
     * @ return : int
     * @ author : minikuma
     * @ version: 1.0.0
     * @ comment: hashcode 만드는 hash function 구현
     */
    public int getHashCode(String key) {
        int hashcode = 0;
        for (char c : key.toCharArray()) {
            hashcode += c;
        }
        return hashcode;
    }
}
