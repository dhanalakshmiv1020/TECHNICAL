class LibraryBook{
    int bookid;
    String bookname;
    String author;
    boolean isIssued=false;

    void issueBook(){
        if(isIssued==false){
            isIssued=true;
            System.out.println("book returned successfully");
        }
        else{
            System.out.println("book already issued");
        }
    }
    void returnBook(){
        if(isIssued==true){
            isIssued=false;
            System.out.println("book returned successfully");
        }
        else{
            System.out.println("book was not issued");
        }
    }
    void displayBook(){
        System.out.println("Book Id: "+bookid);
        System.out.println("Book Name: "+bookname);
        System.out.println("Author: "+author);
        System.out.println("issued: "+isIssued);
    }
    
    public static void main(String[] args){
        LibraryBook book1=new LibraryBook();
        book1.bookid=101;
        book1.bookname="THE CRIME";
        book1.author="Dhana";
        book1.displayBook();
        book1.issueBook();
        book1.returnBook();

        }
    }
