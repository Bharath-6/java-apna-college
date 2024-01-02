package Strings;

public class Stringbuilderexamle {
    public static void main(String args[]){
        StringBuilder str = new StringBuilder("hello");
        str.append("world");
        System.out.println(str);//helloworld
        str.setCharAt(0,'m');//melloworld
        str.append(true);//melloworldtrue
        str.append(10);//melloworldtrue10
        //Insert(idx,ch) and deleteCharAt(ch)
        //Insert will wont replace wherer it will move present index to next and new character will placed at given idx
        str.insert(2,'y');//meylloworldtrue10
        str.deleteCharAt(0);//eylloworldtrue10
        //reverse
        //str.reverse();//01eurtdlrowollye
        //delete(i,j)
        str.delete(10,16);//eylloworld
        System.out.println(str);
        System.out.println(str.substring(0,2));//ey
    }
}
