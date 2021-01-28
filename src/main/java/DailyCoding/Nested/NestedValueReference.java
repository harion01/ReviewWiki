package DailyCoding.Nested;

public class NestedValueReference {
    public int pubInt = 0;
    protected int protectedInt = 1;
    int justInt = 2;
    private int privateInt = 3;
    static int staticInt = 4;

    static class StaticNested{
        public void setValue(){
            //static nested class는 outer class의 static 변수만 사용 할 수 있다.
            staticInt = 40;
        }
   }

   class Inner{
        public void setValue(){
            //모든 outer 변수에 접근 할 수 있다.
            pubInt = 0;
            protectedInt = 10;
            justInt = 20;
            privateInt = 30;
            staticInt = 40;
        }
   }

   public void setValue(){
        EventListener listener = new EventListener() {
            @Override
            public void onClick() {
                //모든 outer 변수에 접근 할 수 있다.
                pubInt = 30;
                protectedInt = 31;
                justInt = 32;
                privateInt = 33;
                staticInt = 34;
            }
        };
   }
}
