public class DeterminantCalc {
    /*
    [ 1    2    3 ]
    [ 4    5    6 ]
    [ 7    8    9 ]
     */
    public int determinantCalc(int int1, int int2, int int3, int int4, int int5, int int6, int int7, int int8, int int9) {
        int result = 0;
        result = ((int1 * int5 * int9) + (int2 * int6 * int7) + (int3 * int4 * int8)) -
                ((int7 * int5 * int3) + (int8 * int6 * int1) + (int9 * int4 * int2));

        return result;
    }

}
