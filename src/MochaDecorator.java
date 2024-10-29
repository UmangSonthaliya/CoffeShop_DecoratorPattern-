class MochaDecorator extends CoffeeDecorator {
    public MochaDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Mocha";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 2.00; // Additional cost for mocha
    }
}
