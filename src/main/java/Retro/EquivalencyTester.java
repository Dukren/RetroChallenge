package Retro;

import java.util.ArrayList;
import java.util.Arrays;

public class EquivalencyTester
{
    private ArrayList<String> equivalencyList = new ArrayList<String>();

    /**
     * Generates a list of equivalent strings.
     * A string is considered equivalent of all the characters of one string appears in the other, regardless of order.
     *
     * Is case sensitive.
     *
     * @param list List of strings that must be tested for equivalency.
     * @param queryString String which the list of strings must be tested against.
     */
    public void generateEquivalentList(ArrayList list, String queryString)
    {
        char[] bufferChar;
        char[] queryCharArray = queryString.toCharArray();
        String bufferString;

        for (int i = 0; i < list.size(); i++)
        {
            bufferString = (String) list.get(i);
            bufferChar = bufferString.toCharArray();
            Arrays.sort(bufferChar);
            Arrays.sort(queryCharArray);

            if (Arrays.equals(bufferChar, queryCharArray))
            {
                equivalencyList.add(bufferString);
            }
        }
    }

    /**
     * Getter method for equivalency list
     *
     * @return Generated equivalency list
     */
    public ArrayList getEquivalentList()
    {
        return equivalencyList;
    }
}
