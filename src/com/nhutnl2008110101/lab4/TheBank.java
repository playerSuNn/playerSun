package com.nhutnl2008110101.lab4;

import java.util.Scanner;

public class TheBank {
    public static void main(String[] args) {
        Account account = new Account(999, 2000000);
        account.withdraw(50000);
        Scanner sc = new Scanner(System.in);
        int menu;
        do
        {
            System.out.println("_____THE BANK SUN_____");
            System.out.println("1.Withdraw, Send, Check Money.");
            System.out.println("2.Object function Customer.");
            System.out.println("3.Object function Employee.");
            System.out.println("_Enter any Number to Exit_");
            System.out.println("*****PLEASE CHOOSE*****");
            menu = sc.nextInt();
            switch(menu)
            {
                case 1:
                {
                    Account acc = new Account(999, 2000000);
                    int smallMenu;
                    do
                    {
                        System.out.println("_____FUNCTION_____");
                        System.out.println("1.Withdraw money.");
                        System.out.println("2.Send money.");
                        System.out.println("3.Check money.");
                        System.out.println("Enter any No to Exit.");
                        System.out.println("_____PLEASE CHOOSE_____");
                        smallMenu = sc.nextInt();
                        switch(smallMenu)
                        {
                            case 1:
                            {
                                System.out.println("Enter the amount you want to withdraw");
                                int moneyWithdraw = sc.nextInt();
                                account.withdraw(moneyWithdraw);
                                account.showData();
                                break; 
                            }
                            case 2:
                            {
                                System.out.println("Enter the amount you want to send:");
                                int moneySend = sc.nextInt();
                                account.deposit(moneySend);
                                account.showData();
                                break;
                            }
                            case 3:
                            {
                                account.showData();
                            }
                        }
                    }
                    while(smallMenu > 0 && smallMenu <= 3);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter quantity:");
                    int soK_H = sc.nextInt();
                    Customer cus = new Customer();
                    int menuCus;
                    do
                    {
                        System.out.println("_____FUNCTION_____");
                        System.out.println("1.Enter your name");
                        System.out.println("2.Enter your IP");
                        System.out.println("3.Print cus info");
                        System.out.println("***Enter any No to Exit***");
                        System.out.println("_____PLEASE CHOOSE_____");
                        menuCus = sc.nextInt();
                        switch(menuCus)
                        {
                            case 1:cus.getName();
                            case 2:cus.getAddress();
                            case 3:cus.showInfo_Cus();
                        }
                    }
                    while(menuCus > 0 && menuCus <= 3);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the number of employees");
                    int soNV = sc.nextInt();
                    Employee emp = new Employee();
                    int menuEmp;
                    do
                    {
                        System.out.println("______FUNCTION_____");
                        System.out.println("1.Enter employee's name");
                        System.out.println("2.Enter employee's salary");
                        System.out.println("3.Print employee's info");
                        System.out.println("***Enter any No to Exit***");
                        System.out.println("_____PLEASE CHOOSE_____");
                        menuEmp = sc.nextInt();
                        switch(menuEmp)
                        {
                            case 1:emp.getName();
                            case 2:emp.getSalary();
                            case 3:emp.showTTemployee();
                        }
                    }
                    while(menuEmp > 0 && menuEmp <= 3);
                        break;
                }
            }
        }
        while(menu > 0 && menu <= 3);
    }
    
}
