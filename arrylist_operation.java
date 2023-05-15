import java.util.ArrayList;
class arrylist_operation{
    public static void main(String arg[]){
        //classname objectname =  new classname();
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String>list1 = new ArrayList<>();

        //add elemet
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //got elemet
        int get  = list.get(2);
        System.out.println(get);
        
        //remove elemet
        list.remove(2);
        System.out.println(list);

        //set element
        list.set(1,10);
        System.out.println(list);

        //check eleemt done exixt in aaary
        System.out.println(list.contains(100));
        System.out.println(list.contains(1));

        //size
        System.out.println(list.size());

        //print arraylist
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}