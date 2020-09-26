public class BonusMilesService {
    public int calculate(int cost){
        int miles;
        int milePerRub = 20;

        miles = cost / milePerRub;

        return miles;
    }
}
