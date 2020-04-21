class Engineer extends Employee {
    public String toString(){
        String engineer = super.Employee("Engineer", "Jeremy", 8, 2, 50000*1.5, 3);
        String engine = super.toString();
        String eng = super.motto();

        return engineer + engine + "Signing Bonus: $10K \n" + eng + "To the optimist, the glass is half full.To the pessimist, the glass is half empty.To the engineer, the glass is twice as big as it needs to be.\n";
        //TODO
    }
}