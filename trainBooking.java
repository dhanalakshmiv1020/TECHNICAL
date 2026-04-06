class trainBooking{
    String name;
    int age;
    int seatno;
    String gender;
    boolean isbooked;
    
    void bookticket(){
        System.out.println("name:");
        name=sc.nextLine();
        System.out.println("age: ");
        age=sc.nextInt();
        System.out.println("from: ");
    }
    void cancelticket(){
        if(isbooked= false){
            isbooked= true;
            System.out.println("cancel ticket");
        }
        else{
            System.out.println("not booked");
        }
    }
    void veiwticket(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("SeatNo: "+seatno);
        System.out.println("Gender: "+gender);
    }
    public static void main(String[] args){
        trainBooking obj=new trainBooking();
        obj.name="Dhanalakshmi";
        obj.age=19;
        obj.seatno=21;
        obj.gender="Female";
        obj.veiwticket();
        obj.cancelticket();
        obj.bookticket();
    } 
}