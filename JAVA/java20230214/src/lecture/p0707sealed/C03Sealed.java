package lecture.p0707sealed;

public class C03Sealed {

}

sealed class Super03 permits Sub31{}

non-sealed class Sub31 extends Super03{}

class Sub0311 extends Sub31{
}
