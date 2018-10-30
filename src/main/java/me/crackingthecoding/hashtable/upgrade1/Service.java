package me.crackingthecoding.hashtable.upgrade1;

import java.util.LinkedList;

/**
 * Created by wminikuma@gmail.com
 * Blog : http://minikuma.github.io
 * Github : http://github.com/minikuma
 *
 * @ Author  : minikuma
 * @ Date    : 2018-10-29
 * @ Version : 1.0.0
 * @ Comment : hash table 에 적재 및 조회 기능을 제공하는 서비스
 */
public class Service {

    static LinkedList<Node>[] data;

    //Constructor
    Service(int size) {
        this.data = new LinkedList[size];
    }

    private int convertToIndex(int hashcode) {
        return hashcode % data.length;
    }

    //put
    public void put(String key, String value) {
        SimpleHashCodeCreator simpleHashCodeCreator = new HashCodeCreator();
        int index = convertToIndex(simpleHashCodeCreator.getHashCode(key));

        System.out.println( key + ", hashcode(" + simpleHashCodeCreator.getHashCode(key) + "), index(" + index + ")");

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

    //get
    public String get(String key) {
        //HashCodeCreator hashCodeCreator = new HashCodeCreator();

        SimpleHashCodeCreator simpleHashCodeCreator = new HashCodeCreator();
        int index = convertToIndex(simpleHashCodeCreator.getHashCode(key));
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null ? "Not Found" : node.getValue();
    }

    //key search
    Node searchKey(LinkedList<Node> list, String key) {
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
