package co.vinod.entity;

public class Person2 {

    private String firstname;

    /**
     * @param firstname
     */
    public Person2(final String firstname) {
        super();
        this.firstname = firstname;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Person2 [firstname=" + firstname + "]";
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person2 other = (Person2) obj;
        if (firstname == null) {
            if (other.firstname != null) {
                return false;
            }
        } else if (!firstname.equals(other.firstname)) {
            return false;
        }
        return true;
    }

    /**
     * @param firstname
     *            the firstname to set
     */
    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

}
