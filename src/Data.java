class Data{
    static int value=10;
    public static void main(String[] args) {
        Runnable runnable=()->System.out.println(value);
        value=11;
        runnable.run();
    }
}