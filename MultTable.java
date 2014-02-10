import java.lang.StringBuilder;

public class MultTable
{

    public static String multTable(int k)
    {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < k; i++)
        {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < k; j++)
            {
                sb.append(String.format("%5d", (i+1) * (j+1)));
            }
            s.append(sb.toString()).append("\n");
        }
        return s.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(multTable(12));
    }
}
