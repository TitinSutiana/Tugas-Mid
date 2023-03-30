interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0091 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0091 obj = new Central0091();
        System.out.println("main");
        obj.aaa();
    }
}
