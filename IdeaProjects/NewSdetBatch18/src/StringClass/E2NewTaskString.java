package StringClass;

public class E2NewTaskString {
    public static void main(String[] args) {

        // Write a program that reads two people's first names and if they are expecting
        // boy or girl? Based on the input, suggest a name for the baby.

        //Example output:
        // Mom's first name? Mariam
        // Dad's first name? Ahmad
        // Boy or Girl? Boy
        // Suggested baby name? Mahmood

        String fatherName= "Ahmad";
        String motherName= "Mariam";
        boolean isBoy=true;
        if(isBoy){
            String fatherFirstPart=fatherName.substring(0,fatherName.length()/2);
            String motherLastPart=motherName.substring(motherName.length()/2,motherName.length());
            System.out.println(fatherFirstPart.trim()+motherLastPart.trim());
        }else {
            String motherFirstPart=motherName.substring(0,motherName.length()/2);
            String fatherLastPart=fatherName.substring(fatherName.length()/2,fatherName.length());
            System.out.println(motherFirstPart.trim()+fatherLastPart.trim());

        }


    }
}
