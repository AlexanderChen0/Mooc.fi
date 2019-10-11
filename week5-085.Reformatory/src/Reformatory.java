public class Reformatory {
    private int numberWeights = 0;

    public int weight(Person person) {
        // return the weight of the person
        numberWeights++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        person.setWeight(weight(person) + 1);
    }
    
    public int totalWeightsMeasured(){
        return numberWeights;
    }

}
