class company{
   private int id;
   private String name;
   public String getName(){
       return name;
   }

   public void setName(String n){
       name = n;
   }
    public void setId(int i){
        id =i;
    }
   public int getId(){
       return id;
   }

}



public class chapter9 {

    public static void main(String[] args) {
        company harry = new company();
//        harry.id = 48;
//        harry.name = "codewithharry";
        harry.setName("codewithharry");
        harry.setId(412);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
