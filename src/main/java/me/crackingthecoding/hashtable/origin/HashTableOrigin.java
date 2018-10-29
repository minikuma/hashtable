package me.crackingthecoding.hashtable.origin;

import java.util.LinkedList;

/**
 * Created by wminikuma@gmail.com
 * Blog : http://minikuma.github.io
 * Github : http://github.com/minikuma
 *
 * @ Author  : minikuma
 * @ Date    : 2018-10-29
 * @ Version : 1.0.0
 * @ Comment : HashTable 구현
 *             key 값 충돌(collision) 해결 -> single linked List
 *
 */
public class HashTableOrigin {
    //hash table node
    private class HashNode {
        String key;
        String value;

        //constructor
        HashNode(String key, String value) {
            this.key = key;
            this.value = value;
        }

        //value getter/setter
        public String getValue() {
            return value;
        }
        public void setValue(String value) {
            this.value = value;
        }
    }

    LinkedList<HashNode>[] data;

    HashTableOrigin(int size) {
        this.data = new LinkedList[size];
    }

    //hash function 구현
    private int getHashCode(String key) {
        //hashcode variable init
        int hashcode = 0;
        for (char c : key.toCharArray()) {
            hashcode += c;
        }
        return hashcode;
    }
    //hash function -> index 변환
    private int convertToIndex(int hashcode) {
        return hashcode % data.length;
    }

    //put
    public void put(String key, String value) {
        int hashcode = getHashCode(key);
        int index = convertToIndex(hashcode);

        System.out.println( key + ", hashcode(" + hashcode + "), index(" + index + ")");

        LinkedList<HashNode> list = data[index];

        if (list == null) {
            list = new LinkedList<HashNode>();
            data[index] = list;
        }

        HashNode hashNode = searchKey(list, key);

        if (hashNode == null) {
            list.addLast(new HashNode(key, value));
        }
        else {
            hashNode.setValue(value);
        }
    }
    //get
    public String get(String key) {
        int hashcode = getHashCode(key);
        int index = convertToIndex(hashcode);
        LinkedList<HashNode> list = data[index];
        HashNode hashNode = searchKey(list, key);
        return hashNode == null ? "Not Found" : hashNode.getValue();
    }

    //search
    private HashNode searchKey(LinkedList<HashNode> list, String key) {
        if (list == null) {
            return null;
        }
        else {
            for (HashNode hashNode : list) {
                if (hashNode.key.equals(key)) {
                    return hashNode;
                }
            }
            return null;
        }
    }
}