/*������� 2. (���������)
�������� ���������� "������� ����� ������� � ������������", ����� Cashier. �������� �� � ���� ������ ������.
 ����������� ��������� ������� ���������� � ���� ����������� ����:
 ����������� �� ����� � ������, ����� boolean isAuthorized(String login, String password).
 �������� ����, ����� void showMenu()
 ������� �������, ����� void createPurchase()
 �������� � ������� ����� �� ���������, ������� ���-�� ������ ����������� ������, ����� void addGoods(String barCode, int count)
 ������ �� ������� ����� �� ���������, ������� ���-�� ������ ����������� ������, ����� void removeGoods(String barCode, int count)
 �������� �������, ����� void cancelPurchase().
 ��������� �������, �� ����� ��������� ������ ����� �������, ����� double closePurchase()*/
package proff27.hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Cashier {
    private String login;
    private String password;
    private boolean authorizationStatus;
    private static final String[] basicMenuOptions = {"1. Create purchase", "2. Exit"};
    private static final String[] purchaseMenuOptions = {"1. Add goods", "2. Remove goods",
            "3. Cancel purchase", "4. Close purchase"};
    private static List<Good> goods = new ArrayList<>();

    {
        goods.add(new Good("00123", "Fish", 13.44));
        goods.add(new Good("00124", "Meat", 25.22));
        goods.add(new Good("00125", "Fruit", 7.33));
    }

    public Cashier() {
    }

    public Cashier(String login, String password) {
        this.setLogin(login);
        this.setPassword(password);
    }

    private Good getGoodByBarCode(String barCode) {
        for (int i = 0; i < goods.size(); i++) {
            if (goods.get(i).getBarCode().equals(barCode)) {
                return goods.get(i);
            }
        }
        return null;
    }

    private boolean isGoodExist(String barCode) {
        return this.getGoodByBarCode(barCode) != null;
    }

    private void setAuthorizationStatus(boolean authorizationStatus) {
        this.authorizationStatus = authorizationStatus;
    }

    private boolean getAuthorizationStatus() {
        return authorizationStatus;
    }

    private void authorizationAttention() {
        System.out.println("Authorization failure");
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return this.login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAuthorized(String login, String password) {
        this.setAuthorizationStatus(Objects.equals(this.getLogin(), login) & Objects.equals(this.getPassword(), password));
        return Objects.equals(this.getLogin(), login) & Objects.equals(this.getPassword(), password);
    }

    public void showMenu() {
        if (!this.getAuthorizationStatus()) {
            this.authorizationAttention();
        } else {
            this.showBasicMenu();
        }
    }

    private void showBasicMenu() {
        Scanner scan = new Scanner(System.in);
        boolean runWhile = true;
        while (runWhile) {
            for (String option : basicMenuOptions) {
                System.out.println(option);
            }
            System.out.println("Choose the operation");
            int chosenOption = scan.nextInt();
            if (chosenOption == 1) {
                this.createPurchase();
            } else if (chosenOption == 2) {
                runWhile = false;
            } else {
                System.out.println("Wrong input");
            }
        }
        System.out.println("Goodbye, and have a nice day!");
    }

    private void createPurchase() {
        Purchase purchase = new Purchase();
        Scanner scan = new Scanner(System.in);
        boolean runWhile = true;
        while (runWhile) {
            for (String option : purchaseMenuOptions) {
                System.out.println(option);
            }
            System.out.println("Choose the operation");
            int chosenOption = scan.nextInt();
            if (chosenOption == 1) {
                this.addGoods(purchase);
            } else if (chosenOption == 2) {
                this.removeGoods(purchase);
            } else if (chosenOption == 3) {
                runWhile = false;
                cancelPurchase();
            } else if (chosenOption == 4) {
                runWhile = false;
                System.out.println("Purchase done, total sum is: " + closePurchase(purchase));
            } else {
                System.out.println("Wrong input");
            }
        }
    }

    private double closePurchase(Purchase purchase) {
        return purchase.getSum();
    }

    private void addGoods(Purchase purchase) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter code of the product");
        String barCode = scan.next();
        System.out.println("Enter quantity of the product");
        int quantity = scan.nextInt();
        if (!isGoodExist(barCode) || quantity < 1) {
            System.out.println("Wrong barcode or negative quantity");
        } else if (purchase.goods.contains(getGoodByBarCode(barCode))) {
            purchase.goods.get(purchase.goods.indexOf(getGoodByBarCode(barCode))).addQuantity(quantity);
        } else {
            purchase.goods.add(getGoodByBarCode(barCode));
            purchase.goods.get(purchase.goods.indexOf(getGoodByBarCode(barCode))).addQuantity(quantity);
        }
    }

    private void removeGoods(Purchase purchase) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter code of the product");
        String barCode = scan.next();
        System.out.println("Enter quantity of the product");
        int quantity = scan.nextInt();
        if (!isGoodExist(barCode) || quantity < 1) {
            System.out.println("Wrong barcode or negative quantity");
        } else if (purchase.goods.contains(getGoodByBarCode(barCode))) {
            purchase.goods.get(purchase.goods.indexOf(getGoodByBarCode(barCode))).subtractQuantity(quantity);
        } else {
            System.out.println("Product isn't in purchasing list");
        }
    }

    private void cancelPurchase() {
        System.out.println("Purchase cancelled");
    }

    private class Good {
        private String barCode;
        private String name;
        private double price;
        private int quantity = 0;

        public String getBarCode() {
            return barCode;
        }

        public int getQuantity() {
            return quantity;
        }

        public void addQuantity(int quantity) {
            quantity = quantity + this.getQuantity();
            this.quantity = quantity;
        }

        public void subtractQuantity(int quantity) {
            quantity = quantity - this.getQuantity();
            if (quantity < 1) {
                this.quantity = 0;
            } else {
                this.quantity = quantity;
            }
        }

        public double getPrice() {
            return this.price;
        }

        private Good() {
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        private Good(String barcode, String name, double price) {
            this.barCode = barcode;
            this.setName(name);
            this.price = price;
        }
    }

    private class Purchase {
        private List<Good> goods;

        public Purchase() {
            goods = new ArrayList<>();
        }

        public double getSum() {
            double sum = 0;
            for (Good good : goods) {
                sum += good.getQuantity() * good.getPrice();
            }
            return sum;
        }
    }
}