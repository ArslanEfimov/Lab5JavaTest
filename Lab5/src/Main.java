import Collection.CollectionOfOrgs;
import Commands.CommandsProcessing;
import Exceptions.WrongValuesException;

public class Main {
    public static void main(String[] args) throws WrongValuesException {
        try {
            CollectionOfOrgs collectionOfOrgs = new CollectionOfOrgs();
            collectionOfOrgs.addElemets();
        CommandsProcessing commandsProcessing = new CommandsProcessing();
        commandsProcessing.switchCommands();
        }catch (NullPointerException e){
            System.out.println("В коллекции содержится null элемент");
        }
    }
}