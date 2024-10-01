package ru.netology.javaqa.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldMinSales() {
        StatsService statsService = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = statsService.minSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldMaxSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 8;
        int actualDay = statsService.maxSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test
    public void shouldAverageSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAvg = 15;
        long actualAvg = statsService.avgSales(sales);
        Assertions.assertEquals(expectedAvg, actualAvg);

    }

    @Test
    public void shouldSumSales() {
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = statsService.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void shouldMaxMonthAvg(){
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxAvg = 5;
        int actualMaxAvg = statsService.monthMaxAvg(sales);
        Assertions.assertEquals(expectedMaxAvg, actualMaxAvg);

    }

    @Test
    void shouldMinMonthAvg(){
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinAvg = 5;
        int actualMinAvg = statsService.monthMinAvg(sales);
        Assertions.assertEquals(expectedMinAvg, actualMinAvg);

    }
}
