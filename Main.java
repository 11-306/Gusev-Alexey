public class Main {

    public static void main(String[] args){

        MyQueue<String> queue = new MyQueue<>();
        queue.add("Палка");
        queue.add("Палка");
        queue.add("Палка");
        queue.add("Камень");
        queue.add("Палка");
        queue.add("Ножницы");
        
        String item  = queue.get();
        System.out.println(item);
        item  = queue.get();
        System.out.println(item);
        item  = queue.get();
        System.out.println(item);
        item  = queue.get();
        System.out.println(item);
        item  = queue.get();
        System.out.println(item);
        item  = queue.get();
        System.out.println(item);

    }
}
