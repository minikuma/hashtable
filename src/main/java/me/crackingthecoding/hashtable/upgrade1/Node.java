package me.crackingthecoding.hashtable.upgrade1;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by wminikuma@gmail.com
 * Blog : http://minikuma.github.io
 * Github : http://github.com/minikuma
 *
 * @ Author  : minikuma
 * @ Date    : 2018-10-29
 * @ Version : 1.0.0
 * @ Comment : hash table (key, value) node
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
