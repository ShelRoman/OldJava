package proff27.hw1;



public class TestClass {

    public static void main(String[] args) throws Throwable{
        Cashier babaZina = new Cashier("b_zina", "22051954");
        System.out.println(babaZina.isAuthorized("b_zina", "22051954"));
        babaZina.showMenu();

    }
}
