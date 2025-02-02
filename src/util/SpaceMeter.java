package util;

import static util.PrintUtil.*;

public class SpaceMeter {
    private final Runtime runtime = Runtime.getRuntime();

    private long memoryBefore;
    private long memoryUsed;

    public void start() {
        memoryBefore = runtime.totalMemory() - runtime.freeMemory();
    }

    public long stop() {

        // Calculate the used memory after the method execution
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        // Calculate the difference in memory usage
        memoryUsed = memoryAfter - memoryBefore;

        memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        return memoryUsed;
    }

    public void printBytes() {
        printMemory("Memory used by methodToMeasure in bytes: %d\n", memoryUsed);
    }

    public void printKBytes() {
        printMemory("Memory used by methodToMeasure in kilobytes: %.2f KB\n",  ((double) memoryUsed / 1024));
    }

    public void printMBytes() {
        printMemory("Memory used by methodToMeasure in megabytes: %.2f MB\n",  ((double) memoryUsed / (1024 * 1024)));
    }

    public void printGBytes() {
        printMemory("Memory used by methodToMeasure in gigabytes: %.2f GB\n",  ((double) memoryUsed / (1024 * 1024 * 1024)));
    }
}