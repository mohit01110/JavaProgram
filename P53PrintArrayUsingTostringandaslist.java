// toString() // asList() //  deepToString()

import java.util.Arrays;

class P53PrintArrayUsingTostringandaslist{
public static void main(String[] args) {
    String a[] = {"Mohit","Choudhary","Programmer","Full Stack Developer"};

    System.out.println(Arrays.toString(a));

    System.out.println(Arrays.asList(a));

    int arr[][] = {{10,20},{30,40}};
    System.out.println("deepToString" + Arrays.deepToString(arr));
    

}

}