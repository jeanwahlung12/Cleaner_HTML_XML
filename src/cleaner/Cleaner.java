/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleaner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author TOSHIBA
 */
public class Cleaner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cadena = "<script> \n function </script>\n"+" <title> hola <title>\n"
                + "<div>  mundo</div> <script> qp2</script>";
        Pattern tags = Pattern.compile("<.*>(.*)</.*>");
        Matcher match = tags.matcher(cadena);
        String regex = "<script>.*?</script>";
        String str = "<p><b>Welcome to Tutorials Point</b></p>";
        System.out.println("Before removing HTML Tags: " + cadena);
        cadena = cadena.replaceAll(regex, "");
        System.out.println("After removing HTML Tags: " + cadena);

        cadena = cadena.replaceAll("<.*?>", "");
        System.out.println("After removing HTML Tags: " + cadena);

    }

}
