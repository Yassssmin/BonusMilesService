public class BonusMilesService {
    public int calculate(int cost){

        int miles;
        miles = (int)Math.floor(cost / 20.0);

        return miles;
    }
}
