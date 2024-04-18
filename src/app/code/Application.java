package app.code;

import app.staff.administration.Director;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {
    public static void main(String[] args) {
//        MachineOperator machineOperator = new MachineOperator();
//        Storekeeper storekeeper = new Storekeeper();
//
//        Merchandiser merchandiser = new Merchandiser();
//        SalesManager salesManager = new SalesManager();
//
//        Secretary secretary = new Secretary();
//
//        ProductionChief productionChief = new ProductionChief();
//        productionChief.setMachineOperator(machineOperator);
//        productionChief.setStorekeeper(storekeeper);
//
//        SalesChief salesChief = new SalesChief();
//        salesChief.setSalesManager(salesManager);
//        salesChief.setMerchandiser(merchandiser);
//
//        Director director = new Director();
//        director.setProductionChief(productionChief);
//        director.setSalesChief(salesChief);
//        director.setSecretary(secretary);
//
//        director.manageCompany();

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.config");
        Director director = context.getBean(Director.class);
        director.manageCompany();




    }
}
