public class Dog {
    private Boolean isHungry;
    private String owner;
    private String name;
    private String[] offSpring = new String[5];

    public Dog(Boolean isHungry, String name) {
        this.isHungry = isHungry;
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void feedDog() {
        if (isHungry) {
            System.out.println("The dog is being fed");
            isHungry = false;
        } else {
            System.out.println("The dog is not hungry");
        }
    }

    public Boolean getHungry() {
        return isHungry;
    }

    public String[] getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(String[] offSpring) {
        this.offSpring = offSpring;
    }
}
