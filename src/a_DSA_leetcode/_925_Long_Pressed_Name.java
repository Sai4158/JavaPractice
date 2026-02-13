package a_DSA_leetcode;

public class _925_Long_Pressed_Name {

    public static boolean isLongPressedName(String name, String typed) {

        int i = 0; 

        for (int j = 0; j < typed.length(); j++) { 

            // if current typed matches next needed char in name
            if (i < name.length() && typed.charAt(j) == name.charAt(i)) {
                i++;
            }
            // else it must be a repeat of previous typed character (long press)
            else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
            }
            else {
                return false;
            }
        }

        return i == name.length();
    }

    public static void main(String[] args) {
        String name = "alex", typed = "aaleex";
        System.out.println(isLongPressedName(name, typed)); // true
    }
}
