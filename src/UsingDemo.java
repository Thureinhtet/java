class UsingDemo {
    public static void main(String[] args) {
        int result=Calculator.add(25,25);
        System.out.println(result);
        Calculator c=new Calculator();
        result=c.divide(25,5);
        System.out.println(result);
    }
}