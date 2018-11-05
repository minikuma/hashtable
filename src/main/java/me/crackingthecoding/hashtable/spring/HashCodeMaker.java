package me.crackingthecoding.hashtable.spring;

import java.util.LinkedList;

/**
 * Created by wminikuma@gmail.com on
 * Blog : http://minikuma.github.io
 * Github : http://github.com/minikuma
 *
 * @ Author  : minikuma
 * @ Date    : 2018-11-05
 * @ Version : 1.0.0
 * @ Comment : hash code 생성, Linked List 배열 생성
 */
public class HashCodeMaker implements SimpleMaker {
    public int getHashCode(String key) {
        int hashcode = 0;
        for (char c : key.toCharArray()) {
            hashcode += c;
        }
        return hashcode;
    }
    public LinkedList[] getLink(int size) {
        return new LinkedList[size];
    }
}
