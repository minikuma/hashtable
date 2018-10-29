# 해시 테이블(Hash Table)
1. 해시 테이블(Hash Table) 이란?
2. 해시 테이블 충돌(Collision) 해결 방법? Single Linked List으로 가능?
3. 간단한 Hash Code Function를 사용한 배열 인덱스 구하기.
4. 구현
   - 무턱대고 구현하기.
   - 리팩토링(Refactoring) 해보기
5. 어디다 사용 해 볼 수 있나?
-----------------------
##### #1. 해시테이블(Hash Table)이란?
해시 테이블은 효율적인 탐색을 위한 자료 구조로서 key, value 구조를 가지고 있다. 간단한 해시 테이블 구성은 해시 코드 함수(Hash Code Function)과 연결 리스트(Linked List)만 있으면 된다. 여기서 key는 문자열 혹은 다른 자료형도 가능하다. 해시 테이블 적재는 아래와 같은 과정을 거치게 된다.
1. key에 대한 해시 코드를 계산한다. key 자료형은 보통 int 혹은 long 형이 된다. key의 개수는 무한으로 가질 수 있는 반면, int 혹은 long이 표현할 수 있는 개수는 유한하기 때문에 서로 다른 두 개의 key 가 같은 해시 코드값을 가질 수 있다.
2. `hash(key) % array_length`와 같은 방식으로 해시 코드를 이용하여 배열의 인덱스를 구한다. 물론 서로 다른 두 개의 해시 코드가 같은 인덱스를 가질 수 있다.
3. 배열의 각 인덱스에는 key와 value로 이루어진 연결 리스트가 존재한다. key 값을 해당 인덱스에 저장한다. **단, 값의 충돌을 방지하기 위해 반드시 연결 리스트를 사용해야 한다.**

결국 key에 대응하는 값을 찾기 위해서는 다음의 과정을 반복해야 한다. 주어진 key로부터 해시코드를 계산하고 이 해시코드를 이용하여 배열에 저장에 사용될 인덱스를 계산한다. 충돌(Collision)현상만 없다면 `O(1)`의 성능을 보여 주지만 특정 인덱스에 value가 몰리게 되면 `O(n)`으로 성능 저하가 발생할 수 있다. 결국 해시 코드를 인덱스 충돌 현상이 없게 만들어 내는 것이 성능에 중요하게 작용하게 된다.

##### #2. 해시 테이블 충돌(Collision) 해결 방법? Single Linked List으로 가능?
위에서 언급한 중복된 인덱스에 여러 개의 값을 수용하기 위해 연결 리스트 사용이 불가피하게 된다.

##### #3. 간단한 Hash Code Function를 사용한 배열 인덱스 구하기.
문자열로 이루어진 key를 받는 다고 가정해 보자. 유입 받은 문자열의 각 문자 요소의 ASCII 값을 구한 뒤 구해진 ASCII 값을 더 해준다.
(예) 유입 문자열(kuma), 각 문자의 ASCII 합: `k(107) + u(117) + m(109) + 1(97) = 430`
배열의 인덱스는 ASCII 합을 배열의 size로 나눈 나머지 값을 사용한다.
(예) ASCII 합: 430, 배열의 크기: 3, `430 % 3 = 1` (value가 저정될 배열의 인덱스)

##### #4. 구현
##### #5. 어디다 사용 해 볼 수 있나?
