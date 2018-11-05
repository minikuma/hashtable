package me.crackingthecoding.hashtable.spring;

import java.util.LinkedList;

/**
 * Created by wminikuma@gmail.com
 * Blog : http://minikuma.github.io
 * Github : http://github.com/minikuma
 *
 * @ Author  : minikuma
 * @ Date    : 2018-11-05
 * @ Version : 1.0.0
 * @ Comment : interface (hashcode 생성, LinkedList 배열 생성)
 */
public interface SimpleMaker {
    int getHashCode(String key);
    LinkedList[] getLink(int size);
}
