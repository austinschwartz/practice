import java.util.*;

public class Permutations {
    public static void permutate(ArrayList<String> pers, String str, int pos,int len)
    {
        if(pos > len)
            return;
        for(int i = pos; i < len; i++)
        {
            pers.add(str.substring(pos,i+1));
        }
        permutate(pers, str, pos+1,len);
    }

    public static void main(String[] args) {
        ArrayList<String> pers = new ArrayList<String>();
        permutate(pers, "hello", 0, 5);
        String list = "";
        for (String p : pers) {
            list += p + "\n";
        }
        System.out.println(list);
    }
}
