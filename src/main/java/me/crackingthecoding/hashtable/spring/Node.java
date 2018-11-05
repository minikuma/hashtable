package me.crackingthecoding.hashtable.spring;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by wminikuma@gmail.com
 * Blog : http://minikuma.github.io
 * Github : http://github.com/minikuma
 *
 * @ Author  : minikuma
 * @ Date    : 2018-11-05
 * @ Version : 1.0.0
 * @ Comment : LikedList Node
 */
public class Node {
    String key;
    @Getter @Setter
    String value;

    //Constructor
    Node(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
