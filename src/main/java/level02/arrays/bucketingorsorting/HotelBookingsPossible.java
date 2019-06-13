package level02.arrays.bucketingorsorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HotelBookingsPossible {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        if ((arrive == null || depart == null || arrive.size() == 0 || depart.size() == 0) && K >= 0) {
            return true;
        }

        if (arrive.size() != depart.size()) {
            return false;
        }
        arrive.sort(Comparator.naturalOrder());
        depart.sort(Comparator.naturalOrder());

        //System.out.println("Arrivals after sorting ::" + arrive);
        //System.out.println("Departure after sorting::" + depart);

        int arrivalMax = arrive.get(arrive.size() - 1);
        int departMax = depart.get(depart.size() - 1);

        int max = Math.max(arrivalMax, departMax);

        final Map<Integer, Integer> arrivalDayCounts = new HashMap<>();
        final Map<Integer, Integer> departuresDayCounts = new HashMap<>();

        arrive.forEach(a -> {
            if (arrivalDayCounts.containsKey(a)) {
                int count = arrivalDayCounts.get(a);
                count++;
                arrivalDayCounts.put(a, count);
            } else {
                arrivalDayCounts.put(a, 1);
            }
        });

        depart.forEach(d -> {
            if (departuresDayCounts.containsKey(d)) {
                int count = departuresDayCounts.get(d);
                count++;
                departuresDayCounts.put(d, count);
            } else {
                departuresDayCounts.put(d, 1);
            }
        });

        for (int i = 0; i < max; i++) {
            if (arrivalDayCounts.containsKey(i)) {
                int decrementTimes = arrivalDayCounts.get(i);
                for (int k = 1; k <= decrementTimes; k++) {
                    K--;
                }
            }
            if (departuresDayCounts.containsKey(i)) {
                int incrementTimes = departuresDayCounts.get(i);
                for (int k = 1; k <= incrementTimes; k++) {
                    K++;
                }
            }
            if (K < 0) {
                System.out.println("Rooms are not available for arrival date :: " + i);
                break;
            }
        }
        if (K < 0) {
            return false;
        }
        return true;
    }
}
