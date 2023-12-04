package edu.hillel.lesson32;

import org.apache.log4j.MDC;

import java.util.UUID;

public class ExecutableService {

    private TransactionService transactionService;

    public ExecutableService(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    public void execute(int amount, UUID uuid) {
        MDC.put("transaction.uuid", uuid);
        transactionService.makeTransaction(amount);
    }

    public static void main(String[] args) {
        ExecutableService executableService = new ExecutableService(new TransactionService());
        for (int i = 0; i < 10; i++) {
            executableService.execute(i, UUID.randomUUID());
        }
    }
}
