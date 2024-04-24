package org.example.prof.lessonTwelve.homeWorkTwelve.doctorQueueByTimer;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DoctorQueue {
    final private Map<String, String> doctorQueue;

    public DoctorQueue() {
        this.doctorQueue = new TreeMap<>(comparator); // Заменяем HashMap на TreeMap
    }

    Comparator<String> comparator = (o1, o2) -> {
        String[] timeArrOne = o1.split(":");
        String[] timeArrTwo = o2.split(":");

        int hours = Integer.compare(Integer.parseInt(timeArrOne[0]), Integer.parseInt(timeArrTwo[0]));

        return hours != 0 ? hours : Integer.compare(Integer.parseInt(timeArrOne[1]), Integer.parseInt(timeArrTwo[1]));
    };

    public void setInDocQueue(String timerSlot, String namePatient) {
        this.doctorQueue.put(timerSlot, namePatient);
    }

    public void nextPatient() {
        if (!doctorQueue.isEmpty()) {
            System.out.println("Next patients for the doctor:");
            Iterator<Map.Entry<String, String>> iterator = doctorQueue.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                System.out.println("Time: " + entry.getKey() + " Next patient for the doctor: " + entry.getValue());
                iterator.remove();
            }
        } else {
            System.out.println("No appointments scheduled.");
        }
    }

    public void printDocQueue() {
        if (doctorQueue.isEmpty()) {
            System.out.println("Doctor queue is empty. Bye!");
        } else {
            System.out.println("Очередь дока: ");
            for (Map.Entry<String, String> entry : doctorQueue.entrySet()) {
                System.out.println("Time: " + entry.getKey() + " Name patient: " + entry.getValue());
            }
        }
    }
}