package com.abstraction;

abstract class Content{
    int value=1;

    abstract protected void generate(String name);
    private void nonaccess(){
        System.out.println("private method");
    }
}
class ContentImpl extends Content{
    @Override
    public void generate(String name) {
        System.out.println(name);
    }

}
class ContentFactory {
    public static void main(String[] args) {
        Content a=ContentFactory.generate();
        a.generate("Hello");
        int value = a.value;
        System.out.println(value);
    }
    static Content generate(){
        return new ContentImpl();
    }

}
