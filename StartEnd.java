// Checking if String Starts or Ends with a Specific Substring

public class StartEnd{
    public static void main(String[] args){
        String str1 = "file.pdf";
        String str2 = "Good morning..!";

        if (str1.endsWith(".pdf")){
            System.out.println("The file is a PDF");
        }else{
            System.out.println("The file is not a PDF");
        }

        if (str2.startsWith("Good")){
            System.out.println("The string starts with 'Good'");
        }else{
            System.out.println("The string does not start with 'Good'");
        }
    }
}
