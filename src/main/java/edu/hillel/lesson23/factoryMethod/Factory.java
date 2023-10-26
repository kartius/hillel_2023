package edu.hillel.lesson23.factoryMethod;


public class Factory {
    public DataStorage createStorage(StorageType type) {
        switch (type) {
            case DB -> {
                return new DBStorage();
            }
            case FILE -> {
                return new FileStorage();
            }
            case IN_MEMORY -> {
                return new InMemoryStorage();
            }
        }
        throw new RuntimeException();
    }
}
