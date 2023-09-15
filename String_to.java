public class String_to{
    public static void main(String[] args){
        String greeting = "hello";
        System.out.println("length"+greeting.length());
        System.out.println("upper:"+greeting.toUpperCase());
        System.out.println("lower:"+greeting.toLowerCase());
        System.out.println("position:"+greeting.indexOf('h'));
        System.out.println("my name"+" "+"kiran");
        System.out.println(greeting.concat("kiran"));
    }
}
