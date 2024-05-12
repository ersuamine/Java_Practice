package Test;

public class IfReview {
    public static String name;
    static{
        name="heyo";
    }

    public static void main(String[] args){
        IfReview ifReview = new IfReview();
        ifReview.name="yoyo";

        System.out.println(IfReview.name);

        IfReview newIfReview = new IfReview();
        newIfReview.name = "nono";

        IfReview lastIfReview = new IfReview();
        System.out.println(lastIfReview.name);
        System.out.println(IfReview.name);

    }
}
