# MVI(Model-View-Intent) Pattern

~~~
View(Model(Intent()))
~~~

![img](http://t1.daumcdn.net/brunch/service/user/1OLd/image/JHTtx7AD-xlDJHdutxQBnUdnXQo.png)

* 자바스크립트 생태계에서 탄생했다.
* MVC에서 파생되었으며 Controller 대신 반응형 요소를 가진 Intent를 이용했다.
* MVC는 Controller가 직접 Model을 업데이트하고 View를 선택하는 능동적인 구조
* MVI는 Intent가 User를 관찰하고, Model이 Intent를 관찰하고, View가 Model을 관찰하고, User가 View를 관찰하는 Reactive 구조로 이루어져있다.
* **RxJava** 라이브러리가 필수적으로 사용되어야 한다.

### 흐름

1. Intent를 통해 User로부터 입력을 가져온다.
2. Intent는 Model에서 처리해야 하는 동작을 제공한다.
3. Model은 Intent로부터 동작을 가져온다.
   * MVI의 Model은 단순 데이터뿐만 아니라, Application의 State와 Business Logic을 관리한다.
4. Model은 View에 표시할 새로운 모델을 생성한다.
5. View는 Model로부터 새로운 모델을 가져와 표시한다.

### 장점

* 단방향, 불변성 데이터를 이용해 예측 가능한 상태이다.

  * 유지보수가 용이해짐.

* 단방향이므로 서로 간의 의존성이 없다.

  