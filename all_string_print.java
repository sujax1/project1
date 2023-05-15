class all_string_print{
    public static void main(String arg[])
    {
        StringBuilder sg = new StringBuilder("");
        for(char ch ='a';ch<='z';ch++)
        {
            sg.append(ch);
        }
       
        System.out.println(sg);
         System.out.println(sg.length());
    }
}