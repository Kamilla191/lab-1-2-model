package org.ismailova.lab.service.impl;

import org.ismailova.lab.entity.Bank;
import org.ismailova.lab.entity.PaymentAccount;
import org.ismailova.lab.entity.User;
import org.ismailova.lab.service.PaymentAccountService;

/**
 * Реализация интерфейса PaymentAccountService для управления информацией о платежных счетах пользователей банка.
 */
public class PaymentAccountServiceImpl implements PaymentAccountService {
    /**
     * Создает новый платежный счет с заданными параметрами.
     *
     * @param id        Идентификатор платежного счета.
     * @param user      Пользователь, которому принадлежит платежный счет.
     * @param bank      Банк, в котором открыт платежный счет.
     * @param balance   Баланс платежного счета.
     * @return          Созданный объект класса {@link PaymentAccount}.
     */
    @Override
    public PaymentAccount create(int id, User user, Bank bank, double balance) {
        PaymentAccount paymentAccount = new PaymentAccount();
        paymentAccount.setId(id);
        paymentAccount.setUser(user);
        paymentAccount.setBankName(bank.getName());
        paymentAccount.setBalance(balance);
        return paymentAccount;
    }

    /**
     * Возвращает информацию о текущем платежном счете.
     *
     * @param id    Идентификатор платежного счета.
     * @return      Объект класса {@link PaymentAccount}, представляющий платежный счет.
     */
    @Override
    public PaymentAccount read(int id) {
        return null;
    }

    /**
     * Обновляет информацию о платежном счете.
     */
    @Override
    public void update() {

    }

    /**
     * Удаляет платежный счет по указанному идентификатору.
     *
     * @param id Идентификатор платежного счета для удаления.
     */
    @Override
    public void delete(int id) {

    }
}
