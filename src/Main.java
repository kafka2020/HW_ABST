public class Main {
    public static void main(String[] args) {
        CreditAccount credit = new CreditAccount(1000);
        SimpleAccount simple = new SimpleAccount();

        simple.add(10_000);
        simple.add(20_000);
//        System.out.println(simple.pay(500));
//        System.out.println(simple.pay(5500));
//        System.out.println(simple.getBalance());
//        System.out.println(simple.pay((35_000)));
//        System.out.println(simple.getBalance());
//
//        System.out.println(credit.add(100));
//        System.out.println(credit.pay(100));
//        System.out.println(credit.getBalance());
//
//        System.out.println(credit.pay(800));
//        System.out.println(credit.getBalance());
//        System.out.println(credit.add(10_000));
//        System.out.println(credit.add(900));
//        System.out.println(credit.getBalance());

//        simple.transfer(credit, 100);
//        System.out.println(credit.getBalance());
//        System.out.println(simple.getBalance());
//
//        simple.transfer(credit, 10_000);
//        System.out.println(credit.getBalance());
//        System.out.println(simple.getBalance());

        credit.transfer(simple, 99);
        System.out.println(credit.getBalance());
        System.out.println(simple.getBalance());

        credit.transfer(simple, 101);
        System.out.println(credit.getBalance());
        System.out.println(simple.getBalance());
        credit.transfer(simple, 2000);
        System.out.println(credit.getBalance());
        System.out.println(simple.getBalance());

        SimpleLogger logger = new SimpleLogger();
        logger.log("Hello!!!");

//        Задание 2
        SmartLogger smart = new SmartLogger();
        smart.log("H1");
        smart.log("H2");
        smart.log("H3");
        smart.log("joke error");
        smart.log("Kafka");
        smart.log("joke erRoR");
    }
}
