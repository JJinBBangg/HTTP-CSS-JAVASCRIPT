package ch13.sec04;

public class C09Inherit {

}

class Super09<T>{}
class Sub09<T> extends Super09<T>{}

class Super10<T, U>{}
class Sub10<T, U> extends Super10<T, U> {}

class Super11<T>{}
class Sub11 extends Super11<String>{}

class Super12<T, U>{}
class Sub12<T> extends Super12<T, String>{}
class Sub121 extends Super12<Integer, String>{}

class Super13<T>{}
class Sub13<T, U> extends Super13<T>{}

class Super14<T extends Number>{}
class Sub14<T extends Number> extends Super14<T>{}
//class Sub14<T extends Object> extends Super14<T>{} // XX
//class Sub14<T extends Integer> extends Super14<T>{} // Ok



