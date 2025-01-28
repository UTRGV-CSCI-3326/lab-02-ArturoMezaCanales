// Hello World
public class MixMatch {
	public static void main(String[] args) {
        
        
        int myInt = 5;
        System.out.println(myInt + " An integer is a 32 bit data type. It stores whole numbers from -2,147,483,648 to 2,147,483,647.");
        
        short myShort = 2;
        System.out.println(myShort + " A short is smaller than an int and can be used when minimizing memory usage is crucial.");
        
        char myChar = 'I';
        System.out.println(myChar + " A char stores a single character like a letter, symbol or emoji, that corresponds to a number in unicode");
       
        String myString = "store";
        System.out.println(myString + " A string is an object that is represented as a array of char's");
        
        long myLong = 9223372036854775807L;
        System.out.println(myLong + " long is a 64 bit data type. It stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.");
       
        float myFloat = 2.123456789f;
        System.out.println(myFloat + " A float can store a decimal with up to 7 correct decimal places");
        
        double myDouble = 3.123456789123456789;
        System.out.println(myDouble + " A double can store a decimal with up to 15 correct decimal places");
        
        boolean myBool = true;
        System.out.println(myBool + " A bool is a single bit of memory. 0 for false 1 for true");
        

        System.out.println("my float: " + myFloat + " and my double: " + myDouble + " can't " + myString + " the numbers I entered correctly");
	}

}