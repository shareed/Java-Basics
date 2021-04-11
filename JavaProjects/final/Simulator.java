public class Simulator {
    public static void main(String[] args) {
        Final fc = new Final();
        
        //trying to change the value of a final field will cause a error
        //fc.type = "New Value";
        
        
        //trying to create a new instance of ClassA and assign it to FinalClass's classA variable will cause a error
        //fc.classA = new ClassA();
        
        //try to assign the greeting field value of the classA field on FinalClass
        //this will work because the classA field is marked final, but the greeting property on it is not.
        fc.classA.greeting = "New Greeting";
        System.out.println(fc.classA.greeting);

   }
}
