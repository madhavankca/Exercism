public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    int expectedOvenTime =40;
    int preparationTimeForOneLayer=2;
    public int expectedMinutesInOven(){
        return expectedOvenTime;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesLasagnaInOven){
        return expectedOvenTime - minutesLasagnaInOven;
        
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayersInLasagna){
        return numberOfLayersInLasagna * preparationTimeForOneLayer;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayersInLasagna , int minutesLasgnaInOven){
        int totalPreparationTime = numberOfLayersInLasagna * preparationTimeForOneLayer + minutesLasgnaInOven;
        return totalPreparationTime;
    }
}
