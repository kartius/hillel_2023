package edu.hillel.lesson32;

import org.apache.log4j.Logger;

public class TransactionService {

    final static Logger LOGGER = Logger.getLogger(TransactionService.class);

    public void makeTransaction(int amount) {
        LOGGER.info(String.format("Making transaction %s", amount));
    }
}
