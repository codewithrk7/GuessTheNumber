class MyEmployee{
    private int id;
    private String name;

    public MyEmployee(){
        id = 66;
        name = "your-name-here";
    }
   public MyEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public String getName(){return name;}
    public void setName(String n){this.name=n;}
    public void setId(int i){this.id = i;}
    public int getId(){return id;}
}


public class construction {
    public static void main(String[] args) {

        MyEmployee rahul = new MyEmployee("codingRahulKumar",54);
////        MyEmployee rahul = new MyEmployee();
//////        rahul.setName("codewithrk7");
//////        rahul.setId(62);
        System.out.println(rahul.getId());
        System.out.println(rahul.getName());
    }
}
