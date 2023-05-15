import java.util.ArrayList;
class arrylist_swap{
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
        int temp = list.get(1);
        list.set(1,list.get(2));
        list.set(2,temp);
        System.out.println(list);
    }
}