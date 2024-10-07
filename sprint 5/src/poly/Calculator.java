package poly;

import java.util.List;

public class Calculator {

    private Calculator() {
    }

    public static double calculate(List<MediaItem> mediaItems) {
        double minutesCounter = 0;
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        for (MediaItem mediaItem : mediaItems) {
            if (mediaItem instanceof Movie) {
                minutesCounter = minutesCounter + mediaItem.getRuntime();
            } else if (mediaItem instanceof Series) {
                minutesCounter = minutesCounter + (mediaItem.getRuntime() * ((Series) mediaItem).getSeriesCount());
            }
        }
        return minutesCounter / (60 * 24);
    }
}