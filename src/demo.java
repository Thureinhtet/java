

class Demo
{
    public static void main(String[] args) {
        Pair<String,Integer> pair=PairFactory.generatePair("One",2000);
        pair.show();

    }
    static class PairFactory{
        public static <K extends CharSequence,V extends Number> Pair<K,V> generatePair(K key, V value){
            return new Pair<K,V>(key,value);
        }
    }
    static class Pair<K,V>{
        private K key;
        private V value;
        Pair(K key,V value){
            this.key=key;
            this.value=value;
        }
        public void show(){
            System.out.printf("Key : %s,Value %s %n",key,value);
        }
    }


}