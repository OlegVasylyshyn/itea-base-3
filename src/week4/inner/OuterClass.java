package week4.inner;

public class OuterClass {

    private String nonStaticField = "non-static field";


    public void work(){

        class MethodLocalInnerClass {

            private String field = "SOME STRING";

        }

        System.out.println(new MethodLocalInnerClass());

    }

    public void work2(){

        class MethodLocalInnerClass {

            private String field = "SOME STRING";

        }

        System.out.println(new MethodLocalInnerClass());

    }


    public class InnerClass {
        public String f(){
            return nonStaticField;
        }
    }

    public InnerClass getInnerClass(){
        return new InnerClass();
    }

}
