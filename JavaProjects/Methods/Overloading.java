public class Overloading {

    public static void main(String[] args) {
        Overloading original = new Overloading();
                original.print();
                original.print("Second Method");
                original.print("Third", "Method");

    }

        //overload methods here
    // no parameters and just print a string
    public void print(){
        System.out.println("Original Method");
    }
    // takes in a String
    public void print(String str){
        System.out.println(str);
    }
    // two String parameters
    public void print(String str, String str2){
        System.out.println(str + " " + str2);
    }

    //specifying two String parameters with different names causes a compiler error
    //because we already have a print method with two String parameters so the compiler cannot differentiate between either
    // public void print(String first, String second){
    //     System.out.println(first + " " + second);
    // }
    
}
