
public class Activity2_1_1 {
    
    public static void main(String []args) {
        String title = "Two States";
        Book newNovel = new MyBook();
        
        newNovel.setTitle(title);
        
        
        System.out.println("The title is: " + newNovel.getTitle());
    }
}
