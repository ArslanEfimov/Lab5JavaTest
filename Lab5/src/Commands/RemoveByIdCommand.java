package Commands;

import Collection.CollectionOfOrgs;
import Organization.Organization;

import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class RemoveByIdCommand {
    public void removeById() {
        System.out.print("Введите значение id: ");
        Scanner scan = new Scanner(System.in);
        Long id = scan.nextLong();
        Iterator<Organization> iter = CollectionOfOrgs.getOrganizationVector().iterator();
        int i = 0;
        while (iter.hasNext()) {
            if (Objects.equals(iter.next().getId(), id)) {
                iter.remove();
                i += 1;
                System.out.println("Элемент успешно удален");
            }
        }
        if (i != 1) {
            System.out.println("Элемента с таким id нет");
        }
    }
}
