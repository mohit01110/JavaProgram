public class P52PrintArrayUsingForEachLoop {
    public static void main(String[] args) {
    int a[] = new int[3];
    a[0] = 10;
    a[1] = 20;
    a[2] = 30;

    for(int i : a)
    {
        System.out.println(i);
    }
    
}
}
