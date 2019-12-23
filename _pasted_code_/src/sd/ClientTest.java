/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package sd;

import java.io.*;

public class ClientTest {

    public static void main(final String[] args) {

        final String fileName = "employee.ser";
        serializeObject(fileName);
        // deserializeObject(fileName);

    }

    private static void deserializeObject(final String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(fileName)))) {
            final Object object = ois.readObject();
            //final Employee employee = (Employee) object;
            System.out.println(object);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    private static void serializeObject(final String fileName) {
        final Address address = new Address(1111, "address Line1", "address Line2", "Mumbai", 590999);
        final Employee employee = new Employee(1001, "KK", 30, "aman.agrahari@gmail.com", "pass@123", address);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)))) {
            oos.writeObject(employee);
            System.out.println("Object is serialized..");
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

}