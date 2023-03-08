package Collection;
import Exceptions.WrongValuesException;
import Organization.*;
import java.time.LocalDate;
import java.util.Vector;

public class CollectionOfOrgs{

        private static Vector<Organization> organizationVector = new Vector<>();
        Organization organization1 = new Organization(Organization.generateId(), "Yandex", new Coordinates(23.4f, 5), LocalDate.now(), 12.7f, "Yandex_ru", OrganizationType.COMMERCIAL, new Address("Kirovskaya"));
        Organization organization2 = new Organization(Organization.generateId(), "Google", new Coordinates(22.5f, 6), LocalDate.now(), 12.7f, "Google_ru", OrganizationType.COMMERCIAL, new Address("Lomonosova"));
        Organization organization3 = new Organization(Organization.generateId(), "Tinkoff", new Coordinates(15.5f, 8), LocalDate.now(), 12.7f, "Tinkoff_ru", OrganizationType.TRUST, new Address("Komsomolskaya"));
        Organization organization4 = new Organization(Organization.generateId(), "Sber", new Coordinates(40.5f, 23), LocalDate.now(), 44.7f, "Sber_ru", OrganizationType.TRUST, new Address("Morskaya"));
        Organization organization5 = new Organization(Organization.generateId(), "Apple", new Coordinates(233.5f, 2), LocalDate.now(), 132.7f, "Apple_ru", OrganizationType.COMMERCIAL, new Address("Nahimova"));

    public CollectionOfOrgs() throws WrongValuesException {
    }

    public static Vector<Organization> getOrganizationVector () {
        return organizationVector;
    }

        public static void setOrganizationVector (Vector < Organization > organizationVector) {
        CollectionOfOrgs.organizationVector = organizationVector;
    }


        public void addElemets () {

        organizationVector.add(organization1);
        organizationVector.add(organization2);
        organizationVector.add(organization3);
        organizationVector.add(organization4);
        organizationVector.add(organization5);
    }



}
