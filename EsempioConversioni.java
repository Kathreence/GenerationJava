public class EsempioConversioni {
    public static void main(String[] args) {
        int a = 20;
        long b = a;
        System.err.println(b);
        
        a = (int)b;     
        System.err.println(a);
        b = 3_000_000_000L;
        a = (int)b;     
        System.err.println(a);
        a = 16;
        float c = a;
        System.out.println(c);
        c = 23.45f;
        a = (int)c;
        System.out.println(a);
    }
}