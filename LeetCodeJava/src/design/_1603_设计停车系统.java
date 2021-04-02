package design;

import java.util.HashMap;
import java.util.Map;

/**
 * url:
 * Author:Savannah
 * Description:
 * LeetCodeTesting 2021/3/26
 */
public class _1603_设计停车系统 {

    class ParkingSystem {

        private Map<Integer, Integer> map;

        {
            map = new HashMap<>();
        }

        public ParkingSystem(int big, int medium, int small) {
            map.put(0, big);
            map.put(1, medium);
            map.put(2, small);
        }

        public boolean addCar(int carType) {
            Integer integer = map.get(carType);
            if (integer == null) {
                return false;
            }
            if (integer > 0) {
                map.put(carType, --integer);
                return true;
            }
            return false;
        }
    }
}
