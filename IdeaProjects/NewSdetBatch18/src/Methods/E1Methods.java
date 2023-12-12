package Methods;


 // Create a Method to print a result?
public class E1Methods {

    // Create a method that will say Hello in different language based on the country
  // that will pass when method is executed. Do it for any five countries

  // // Description of the syntax:
  // void= return type, greeting= method name, String country= argument
  // String= datatype, word= variable

  void greeting(String country){
   String word="";
   if(country.equalsIgnoreCase("USA")){
    word = "Hello";
   }else if (country.equalsIgnoreCase("France")){
    word ="Bonjour";
   }else if(country.equalsIgnoreCase("Mexico")){
    word="Hola";
   }else if (country.equalsIgnoreCase("Afghanistan")){
    word = "Salam";
   }else if(country.equalsIgnoreCase("India")) {
    word = "Namaste";
   }
   System.out.println("In the Country "+country+ " They greet saying "+word);
  }

     public static void main(String[] args) {
         E1Methods obj = new E1Methods();
         obj.greeting("Mexico");
         obj.greeting("France");
     }

}
