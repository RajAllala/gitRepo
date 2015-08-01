public class MySingleTon {
     
    private static MySingleTon myObj;
    /**
     * Create private constructor
     */
    private MySingleTon(){
         
    }
    /**
     * Create a static method to get instance.
     */
    public static MySingleTon getInstance(){
        if(myObj == null){
            myObj = new MySingleTon();
        }
        return myObj;
    }
     
    public void getSomeThing(MySingleTon st){
        // do something here
        System.out.println(st);
    }
     
    public static void main(String a[]){
        MySingleTon st = MySingleTon.getInstance();
        st.getSomeThing(st);
        st.getSomeThing(st);
        
    }
}