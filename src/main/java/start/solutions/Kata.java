package start.solutions;

// Build Tower
public class Kata {

//    [
//            "  *  ",
//            " *** ",
//            "*****"
//    ]
    public static String[] towerBuilder(int nFloors) {
        int mFloors = nFloors;
        String[] response = new String[nFloors];
        String s = "";
        for (int i = 0; i < mFloors; i++) {
            for (int j = 0; j < nFloors - 1; j++) {
                s += " ";
            }

            for (int j = mFloors * 2 - 1; j >= nFloors * 2 - 1; j--) {
                s += "*";
            }

            for (int j = 0; j < nFloors - 1; j++) {
                s += " ";
            }
            response[i] = s;
            System.out.println(s);
            s = "";
            nFloors--;
        }
    return response;
    }
}