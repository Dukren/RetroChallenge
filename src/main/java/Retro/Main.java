package Retro;

public class Main
{
    public static void main(String[] args)
    {
        StringSearcher strShr = new StringSearcher();

        strShr.setSearchString(args[0]);
        strShr.setFileName(args[1]);

        strShr.runSearch();
    }
}
