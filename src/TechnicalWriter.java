class TechnicalWriter extends Employee {
    public String toString(){

        String techWriter = super.Employee("Technical Writer", "Jeff", 2, 1, 50000*1, 2);
        String tecWriter = super.toString();
        String writer = super.motto();

        return tecWriter + techWriter + writer + "You can always edit a bad page. You can’t edit a blank page.\n";

        //TODO

    }
}