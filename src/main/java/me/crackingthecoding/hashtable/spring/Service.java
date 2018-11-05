package me.crackingthecoding.hashtable.spring;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;

/**
 * Created by wminikuma@gmail.com
 * Blog : http://minikuma.github.io
 * Github : http://github.com/minikuma
 *
 * @ Author  : minikuma
 * @ Date    : 2018-11-05
 * @ Version : 1.0.0
 * @ Comment : hash table service
 */
public class Service {
    //local variable
    static LinkedList<Node>[] data;

    @Autowired
    SimpleMaker simpleMaker;

    // linked list 배열 크기 DI 적용
    public void setService(int size) {
        data = simpleMaker.getLink(size);
    }

    public void put(String key, String value) {
        int index = convertToIndex(simpleMaker.getHashCode(key));
        System.out.println( key + ", hashcode(" + simpleMaker.getHashCode(key) + "), index(" + index + ")");
        LinkedList<Node> list = data[index];
        if (list == null) {
            list = new LinkedList<Node>();
            data[index] = list;
        }

        Node node = searchKey(list, key);

        if (node == null) {
            list.addLast(new Node(key, value));
        }
        else {
            node.setValue(value);
        }
    }

    public String get(String key) {
        int index = convertToIndex(simpleMaker.getHashCode(key));
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null ? "Not Found" : node.getValue();
    }

    private int convertToIndex(int hashcode) {
        return hashcode % data.length;
    }

    private Node searchKey(LinkedList<Node> list, String key) {
        if (list == null) {
            return null;
        }
        else {
            for (Node node : list) {
                if (node.key.equals(key)) {
                    return node;
                }
            }
            return null;
        }
    }
}
