package org.ismailova.lab;

import org.ismailova.lab.entity.*;
import org.ismailova.lab.service.*;
import org.ismailova.lab.service.impl.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankServiceImpl();
        BankOfficeService bankOfficeService = new BankOfficeServiceImpl();
        EmployeeService employeeService = new EmployeeServiceImpl();
        AtmService atmService = new AtmServiceImpl();
        UserService userService = new UserServiceImpl();
        PaymentAccountService paymentAccountService = new PaymentAccountServiceImpl();
        CreditAccountService creditAccountService = new CreditAccountServiceImpl();

        Bank bank = bankService.create(1, "Сбер");
        BankOffice bankOffice = bankOfficeService.create(1, "Отделение СберБанка", bank,"г. Белгород, ул. Победа 85", true, true, true, true, true, 1000);
        Employee employee = employeeService.create(1, "Александров", "Александ ", "Алескандрович", LocalDate.of(1975, 4, 8), "Директор", bank, bankOffice, true, true, 28_000);
        BankAtm atm = atmService.create(1, "Банкомат №1", 1, bankOffice, "2 этаж", employee, true, true, 100);
        User user = userService.create(1, "Иванов", "Иван", "Сергеевич", LocalDate.of(1990, 12, 13), "ООО \"Казино 777\"", List.of(bank));
        PaymentAccount paymentAccount = paymentAccountService.create(1, user, bank, 3000);
        CreditAccount creditAccount = creditAccountService.create(1, user, bank, LocalDate.now(), 18, 150000, 5, employee, paymentAccount);

        System.out.println(bank);
        System.out.println(bankOffice);
        System.out.println(employee);
        System.out.println(atm);
        System.out.println(user);
        System.out.println(paymentAccount);
        System.out.println(creditAccount);
    }
}
