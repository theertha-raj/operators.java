class ternarymin{
    public static void main(String[] args){
        int n1=80, n2=40, n3=30, n4=50, min;
        System.out.println("num1="+n1);
        System.out.println("num2=" +n2);
        System.out.println("num3="+n3);
        System.out.println("num4=" +n4);
        min=(n1<n2)?n1:n2;
        min=(n3<n4)? n3:n4;
        System.out.println("minimum=" +min);
    }
}
