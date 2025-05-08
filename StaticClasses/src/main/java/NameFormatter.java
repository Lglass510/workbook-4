public class NameFormatter {


    private NameFormatter() {

    }



   public static String format(String firstName, String lastName) {
       return lastName + "," + firstName;

   }


   public static String format (String prefix, String firstName, String middleName, String lastName, String suffix) {
        String fullName = lastName + firstName;
        return lastName + "," + prefix + firstName + middleName + "," + suffix;

        if (prefix != null && !prefix.isEmpty()) {
            fullName += prefix + ",";
        }
   }





}


