package me.crackingthecoding.hashtable.upgrade1;

/**
 * Created by wminikuma@gmail.com
 * Blog : http://minikuma.github.io
 * Github : http://github.com/minikuma
 *
 * @ Author  : minikuma
 * @ Date    : 2018-10-30
 * @ Version : 1.0.0
 * @ Comment : Hash Function maker interface
 *             다양한 Hash Function 적용 가능한 구조
 */
public interface SimpleHashCodeCreator {
    int getHashCode(String key);
}
