package Retro;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileParser
{
    /**
     * Parses a text file containing a list of strings. Strings can be newline delimited, comma (,) delimited or both.
     * Also tests whether the length of each parsed string is the same as the searchString.
     *
     * @param fileName File name of the file containing strings that must be parsed
     * @param searchString String that must be compared to the values contained in the supplied text file
     * @return ArrayList with each all strings contained in supplied text file.
     */
    public ArrayList parseFile(String fileName, String searchString)
    {
        ArrayList fileData = new ArrayList();
        String bufferString;

        String filePath = new File("").getAbsolutePath();
        filePath = filePath + "\\" + fileName;

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null)
            {
                StringTokenizer st = new StringTokenizer(line, ",");

                while (st.hasMoreTokens())
                {
                    bufferString = st.nextToken();
                    if (bufferString.length() != searchString.length())
                    {
                        throw new StringIndexOutOfBoundsException();
                    }
                    else
                    {
                        fileData.add(bufferString);
                    }
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File " + fileName + " could not be found");
            System.exit(1);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Search string and file data are not the same length.");
            System.exit(1);
        }

        return fileData;
    }
}
