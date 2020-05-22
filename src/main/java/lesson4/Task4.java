package lesson4;

import lesson2.Vector;

public class Task4 {

    public static Vector<Integer> getLinks(int amountPeople, int[][] links, int startMan, int finishMan) {
        boolean[] seenPeople = new boolean[amountPeople];
        Queue<Man> queue = new Queue<>();
        Vector<Integer> answer = new Vector<>();
        Vector<Integer>[] linksData = new Vector[amountPeople];
        for (int i = 0; i < linksData.length; i++) {
            linksData[i] = new Vector<>();
        }
        for (int i = 0; i < links.length; i++) {
            linksData[links[i][0] - 1].add(links[i][1] - 1);
        }

        Man starMan = new Man(startMan);
        //Fill startMan acquaintances
        for (int i = 0; i < linksData[startMan - 1].size(); i++) {
            Man man = new Man(linksData[startMan - 1].get(i), starMan);
            queue.offerLast(man);
        }
        do {
            Man manForCheck = queue.pollFirst();
            if (seenPeople[manForCheck.getNumber()]) {
                continue;
            }
            if (manForCheck.getNumber() == finishMan - 1) {
                while (manForCheck.getNumber() != startMan) {
                    answer.add(manForCheck.getNumber());
                    manForCheck = manForCheck.getPrevMan();
                }
                break;
            }
            seenPeople[manForCheck.getNumber()] = true;
            for (int i = 0; i < linksData[manForCheck.getNumber()].size(); i++) {
                Man manToAddToQueue = new Man();
                manToAddToQueue.setPrevMan(manForCheck);
                manToAddToQueue.setNumber(linksData[manForCheck.getNumber()].get(i));
                if (!seenPeople[manToAddToQueue.getNumber()]) {
                    queue.offerLast(manToAddToQueue);
                }
            }
        } while (!queue.isEmpty());

        return answer;
    }
}
