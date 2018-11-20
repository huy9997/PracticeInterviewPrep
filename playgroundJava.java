import java.util.*;
class playgroundJava
{
    public static void main(String [] args)
    {
        // String test = "hello world";
        // printString(test);
        // reverse("racecar");
        // atoi(" a s d s a s a");
        //nodePractice();
        System.out.println(fizzBuzz(2));
        if(StringProblem()==false){
            System.out.println("The String problem is false");
        }
        else{
            System.out.println("The String Problem is true");
        }
    }

    public static String reverse(String reader){
        //reverse a string
        String reverse = "";
        System.out.println("reader length: " + reader.length());
        for(int i = reader.length()-1; i >= 0 ; i--){
            reverse = reverse + reader.charAt(i);
        }
        System.out.println(reverse);
        return reverse;
    }

    public static int atoi(String str){
        //turn a string into a int 
        // no spaces
        // once a non int is detected end program
        str = str.replaceAll(" ", "");
        System.out.println(str);
        


        for(int i = 0; i< str.length();i++){
            if(str.charAt(i)!='+'|| str.charAt(i)!='-'|| !Character.isDigit(str.charAt(i))){
                return 0;
            }

            // System.out.println(str.charAt(i));

        }        
        return 0; 
    }

    public static ArrayList fizzBuzz(int num ){
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i < num; i++){
            if((num % 3 ==0) && ( num %5 == 0 ) ){
                list.add("fizzBuzz");
            }
            if(num % 3 ==0){
                list.add("fizz");
            }
            if(num % 5 ==0){
                list.add("buzz");
            }
            list.add(Integer.toString(num));
        }  
        return list;
    }

    public static boolean StringProblem(){
        String paragraph = "classes";
        String checker = "class";
        HashMap <Character,Integer> map = new HashMap<>();
        for(int i = 0; i < paragraph.length(); i++){
            if(map.containsKey(paragraph.charAt(i))){
                map.put(paragraph.charAt(i),(map.get(paragraph.charAt(i)) + 1));
            }
            
            map.put(paragraph.charAt(i),1);
        }
        for(int j = 0; j < checker.length() - 1; j++){
            if(map.containsKey(checker.charAt(j))){
                map.put(checker.charAt(j), map.get(checker.charAt(j)) - 1 );
                if(map.get(checker.charAt(j))==0){
                    map.remove(checker.charAt(j));
                }
            }else{
                return false; 
            }
        }
        return true;
    }
}

//