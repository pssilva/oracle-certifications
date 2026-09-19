package br.com.methods;

public class Exercise {
    public void bike1() {}
    public final void bike2() {}
    public static final void bike3() {}
    public final static void bike4() {}
    //public modifier void bike5() {}       // DOES NOT COMPILE
    //public void final bike6() {}          // DOES NOT COMPILE
    final public void bike7() {}
}
