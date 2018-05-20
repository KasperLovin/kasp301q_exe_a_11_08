import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ch_11_08
{
    /*Write a method minLength that accepts a set of strings as a parameter and that returns the length of the shortest
    string in the list. If your method is passed an empty set, it should return 0.*/

    public static void main(String[] args)
    {
        List<String> length = new ArrayList<>();
        length.add("kasper");
        length.add("Niller");
        length.add("Ruth");
        length.add("Ib");
        length.add("Andreas");
        length.add("O");

        System.out.println(minLength(length));

    }

    public static int minLength(List<String> fullLength)
    {
        String compare = fullLength.get(0);

        for (int i = 0; i < fullLength.size() ; i++)
        {
            if (fullLength.get(i).length() < compare.length() )
            {
                compare = fullLength.get(i);
            }
        }
        return compare.length();
    }
}
