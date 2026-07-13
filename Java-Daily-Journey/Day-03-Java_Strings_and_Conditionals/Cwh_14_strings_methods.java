public class Cwh_14_strings_methods {

    static void main(String[] args) {

        String name = "Harry"; // indexing  0 1 2 3 4 5
        int value = name.length();
        System.out.println(value);

        String lowerstring = name.toLowerCase(); // means jaha bhi upper case unko lower me kare dega
        System.out.println(lowerstring);

        String upperstring = name.toUpperCase(); // all upper kare deta hai
        System.out.println(upperstring);

        String nontrimeedstring = "   Harry        "; // trimming & not trimming
        System.out.println(nontrimeedstring);
        String trimmedstring;
        System.out.println(nontrimeedstring.trim());

        System.out.println(name.substring(1));  // means starting index value haat jaygi and bki jo index value assign hai to uske piche wali value pring hojaygi

        System.out.println(name.substring(1, 4)); // means 1 se phele wali and 4 ke baad wali nhi hogi calue print baki hongi jaise harry ka h nhi hoga beacuse woh 0 per hai and y bhi nhi hoga beace woh 4 hai
        System.out.println(name.replace('r', 'p'));

        System.out.println(name.replace("r", "ier")); // replacing r  with ier

        System.out.println(name.startsWith("Har")); // true if start with par or false if not with par
        System.out.println(name.endsWith("ry")); // ture if end with ry and false if not end with ry

        System.out.println(name.charAt(4));  // 0 --> H , 1 --> a , 2 r , 3 r , 4 y

        // new variabel
        String modifiedname = "Harryrry";
        System.out.println(modifiedname.indexOf("rry5446")); // indexing showing
        System.out.println(modifiedname.indexOf("rry", 4));
        System.out.println(modifiedname.lastIndexOf("rry", 4));  // -1 if not found

        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("HaRRy"));

        // escape sequence character
        /*
        /n  , /t , \"  \"
         */

        System.out.println("hey there what are you doing \" another person: Iam doing nothing \" ");
    }
}