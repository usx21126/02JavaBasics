package com.xh;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private Account loginAcc;
    /** 启动ATM系统，展示欢迎页面 */
    public void start () {
        while (true) {
            System.out.println("===欢迎进入ATM系统===");
            System.out.println("1.用户登录");
            System.out.println("2.用户开户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    login();
                    break;
                case 2:
                    createAccount();
                    break;
                default:
                    System.out.println("没有该操作~");
                    break;
            }
        }
    }
    /** 完成用户登录操作 */
    private void login(){
        System.out.println("===系统登录===");
        //1.系统存在账户才能登录
        if(accounts.isEmpty()){
            System.out.println("当前系统中无任何账户，请先开户再来登录~");
            return;
        }
        while (true) {
            System.out.println("请您输入您的登录卡号：");
            String cardId = sc.next();
            Account acc =getAccountByCardId(cardId);
            if(acc != null){
                while (true) {
                    System.out.println("请您输入登录密码：");
                    String password = sc.next();
                    if(acc.getPassword().equals(password)){
                        loginAcc = acc;
                        System.out.println("恭喜您，"+acc.getUserName()+(acc.getSex()=='男'?"先生":"女士")+"，成功登录了系统，您的卡号是"+acc.getCardId());
                        showUserCommand();
                        return;
                    }else{
                        System.out.println("您输入的密码不正确，请确认~~");
                    }
                }
            }else{
                System.out.println("您输入的登录卡号不存在，请确认~~");
            }
        }
    }
    /** 展示登录后操作界面 */
    private void showUserCommand(){
        while (true) {
            System.out.println("==="+loginAcc.getUserName()+(loginAcc.getSex()=='男'?"先生":"女士")+",您可选择如下功能进行账户处理===");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.密码修改");
            System.out.println("6.退出");
            System.out.println("7.注销当前账户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //查询当前账户
                    showLoginAccount();
                    break;
                case 2:
                    //存款
                    depositMoney();
                    break;
                case 3:
                    //取钱
                    drawMoney();
                    break;
                case 4:
                    transferMoney();
                    break;
                case 5:
                    updatePassword();
                    return;
                case 6:
                    System.out.println(loginAcc.getUserName()+(loginAcc.getSex()=='男'?"先生":"女士")+",您退出系统成功！");
                    loginAcc = null;
                    return;
                case 7:
                    if(deleteAccount()){
                        return;
                    };
                    break;
                default:
                    System.out.println("您当前选择的操作不存在，请确认~");
                    break;
            }
        }
    }
    /** 账户密码修改 */
    private void updatePassword() {
        System.out.println("===账户密码修改操作===");
        while (true) {
            System.out.println("请您输入当前账户的密码：");
            String password = sc.next();
            if(loginAcc.getPassword().equals(password)){
                while (true) {
                    System.out.println("请您输入新密码：");
                    String newPassword = sc.next();
                    System.out.println("请您再次输入密码：");
                    String confirmPassword = sc.next();
                    if(newPassword.equals(confirmPassword)){
                        loginAcc.setPassword(newPassword);
                        System.out.println("恭喜您，您的密码修改成功~");
                        return;
                    }else{
                        System.out.println("您输入的两次密码不一致~");
                    }
                }
            }else{
                System.out.println("您当前输入的密码不正确~");
            }
        }
    }

    /** 销户操作 */
    private boolean deleteAccount() {
        System.out.println("===运行销户操作===");
        System.out.println("请问您确认销户吗？ y/n");
        String command = sc.next();
        switch (command) {
            case "y":
                if(loginAcc.getMoney() == 0){
                    accounts.remove(loginAcc);
                    System.out.println("您好，您的账户已经成功销户~");
                    return true;
                }else{
                    System.out.println("对不起，您的账户中存在余额，不允许销户~~");
                    return false;
                }
            default:
                System.out.println("好的，您的账户保留~");
                return false;
        }
    }

    /** 转账 */
    private void transferMoney() {
        System.out.println("===用户转账===");
        if(accounts.size()<2){
            System.out.println("当前系统中只有一个账户，无法为其他账户转账~");
            return;
        }

        if(loginAcc.getMoney()==0){
            System.out.println("您自己都没钱，就别转了~~~");
            return;
        }

        while (true) {
            System.out.println("请输入对方卡号：");
            String cardId = sc.next();
            Account acc = getAccountByCardId(cardId);
            if(acc==null){
                System.out.println("您输入对方卡号不存在~");
            }else{
                String name = "*"+acc.getUserName().substring(1);

                System.out.println("请您输入【"+name+"】的姓氏：");
                String preName = sc.next();
                if(acc.getUserName().startsWith(preName)){
                    while (true) {
                        System.out.println("请您输入转账给对方的金额：");
                        double money = sc.nextDouble();
                        if(money<=loginAcc.getMoney()){
                            //成功
                            System.out.println("");
                            loginAcc.setMoney(loginAcc.getMoney()-money);
                            acc.setMoney(acc.getMoney()+money);
                            System.out.println("您转账成功，转出金额"+money+"元，余额"+loginAcc.getMoney()+"元");
                            return;
                        }else{
                            System.out.println("您的余额不足，无法给对方转账，最多可转"+loginAcc.getMoney());
                        }
                    }
                }else{
                    System.out.println("对不起，您认证的姓氏有问题~");
                }
            }
        }
    }

    /** 取钱 */
    private void drawMoney() {
        System.out.println("===取款操作===");
        if(loginAcc.getMoney()<100){
            System.out.println("您的账户余额不足100元，不允许取钱~");
            return;
        }
        while (true) {
            System.out.println("请输入取款金额：");
            double money = sc.nextDouble();
            if(loginAcc.getMoney()<money){
                System.out.println("您的余额不足，账户余额为："+loginAcc.getMoney()+"元");

            }else{
                if(money>loginAcc.getLimit()){
                    System.out.println("您当前取款金额超过了每次限额，您每次最多可取："+loginAcc.getLimit()+"元");
                }else{
                    loginAcc.setMoney(loginAcc.getMoney()-money);
                    System.out.println("您取款"+money+"元，剩余金额"+loginAcc.getMoney()+"元");
                    return;
                }
            }
        }
    }

    /** 存钱 */
    private void depositMoney() {
        System.out.println("===存款操作===");
        System.out.println("请输入存款金额：");
        double money = sc.nextDouble();
        loginAcc.setMoney(loginAcc.getMoney()+money);
        System.out.println("恭喜您，您存钱"+money+"元成功，存钱后余额是："+loginAcc.getMoney());
    }

    /** 展示当前登录的账户信息 */
    private void showLoginAccount(){
        System.out.println("===当前您的账户信息如下：===");
        System.out.println("卡号："+loginAcc.getCardId());
        System.out.println("户主："+loginAcc.getUserName());
        System.out.println("性别："+loginAcc.getSex());
        System.out.println("余额"+loginAcc.getMoney());
        System.out.println("每次取现额度"+loginAcc.getLimit());
    }
    /** 完成用户开户操作 */
    private void createAccount() {
        System.out.println("===系统开户操作===");
        //1.创建一个账户对象，用于封装用户的开户信息
        Account account = new Account();
        //2.输入用户信息
        System.out.println("请您输入您的账户名称：");
        String name = sc.next();
        account.setUserName(name);

        while (true) {
            System.out.println("请您输入您的性别：");
            char sex = sc.next().charAt(0);
            if(sex == '男'||sex == '女'){
                account.setSex(sex);
                break;
            }else{
                System.out.println("您输入的性别有误~只能是男或女~");
            }
        }

        while (true) {
            System.out.println("请您输入您的账户密码：");
            String password = sc.next();
            System.out.println("请您输入您的确认密码：");
            String confirmPassword = sc.next();
            if(password.equals(confirmPassword)){
                account.setPassword(password);
                break;
            }else{
                System.out.println("您输入的2次密码不一致，请您确认~~");
            }
        }

        System.out.println("请您输入您的取现额度：");
        double limit = sc.nextDouble();
        account.setLimit(limit);

        //生成卡号
        String cardId = createCardId();
        account.setCardId(cardId);
        //3.添加账户
        accounts.add(account);
        System.out.println("恭喜您"+account.getUserName()+(account.getSex()=='男'?"先生":"女士")+",开户成功，您的卡号是"+account.getCardId());
    }

    private String createCardId(){
        while (true) {
            String cardId = "";
            Random random = new Random();
            for (int i = 0; i < 8; i++) {
                int data = random.nextInt(10);
                cardId += data;
            }
            Account account = getAccountByCardId(cardId);
            if(account == null){
                return cardId;
            }
        }
    }

    /**
     * 根据卡号查询账号对象返回
     */
    private Account getAccountByCardId(String cardId){
        for (Account account : accounts) {
            if(account.getCardId().equals(cardId)){
                return account;
            }
        }
        return null;
    }
}
