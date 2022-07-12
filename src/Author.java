public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String toString() {
        return "" + name + " "
                + "" + surname;
    }
    @Override
    public boolean equals(Object other) {
        Author guest = (Author) other;
        if (other == this)
            return true;
        else if (this.name == guest.getName() && this.surname == guest.getSurname())
            return true;
        else
            return false;
    }
    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode();
    }

}
