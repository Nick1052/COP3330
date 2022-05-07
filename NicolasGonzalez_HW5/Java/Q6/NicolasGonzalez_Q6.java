public class NicolasGonzalez_Q6 {
    public static void main(String[] args) {

        MyStringBuilder2 str1 = new MyStringBuilder2();
        MyStringBuilder2 str2 = new MyStringBuilder2("Test");

        // Demonstrate insert and contrusctor creator
        str1 = str2.insert(2, str2);
        System.out.println(str2.toString());
        System.out.println(str1.toString());

        // Demonstrate to toUpper and Substring
        System.out.println(str2.toUpperCase().toString());
        System.out.print(str1.substring(2).toString());

    }
}
// String builder is always an object so most of these methods will return object
class MyStringBuilder2 {
    // Data field
    private String s;

    // Constructor
    MyStringBuilder2() {
        s = "";
    }
    MyStringBuilder2(char[] chars) {
        s = String.valueOf(chars);
    }
    MyStringBuilder2(String s) {
        this.s = s;
    }
    //========\\
    // Methods \\
    //=========\\
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        String newStr = "";
        int i;
        for (i = 0; i < offset; i++) {
            if (i < offset)
                newStr += this.s.charAt(i) + "";
        }
        newStr += s;
        return new MyStringBuilder2(newStr + substring(offset));
    }
    public MyStringBuilder2 reverse() {
        String newStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            newStr += s.charAt(i) + "";
        }
        return new MyStringBuilder2(newStr);
    }
    public MyStringBuilder2 substring(int begin) {
        String newStr = "";
        for (int i = begin; i < s.length(); i++) {
            newStr += s.charAt(i) + "";
        }
        return new MyStringBuilder2(newStr);
    }
    public MyStringBuilder2 toUpperCase() {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                newStr += (char)(s.charAt(i) - 32) + "";
            else
                newStr += s.charAt(i) + "";
        }
        return new MyStringBuilder2(newStr);
    }
    public String toString() {
        return s;
    }

}