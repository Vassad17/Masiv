package ru.netology.javaqa.stats;

import ru.netology.javaqa.stats.StatsService;
public class Main {
    public static void main(String[] args) {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();
        int monthMaxAvg = statsService.monthMaxAvg(sales);
        int monthMinAvg = statsService.monthMinAvg(sales);
        System.out.println("Month Max Avg: " + monthMaxAvg);
        System.out.println("Month Min Avg: " + monthMinAvg);
    }
}
