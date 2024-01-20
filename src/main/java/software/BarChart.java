package software;

import java.util.Map;

public record BarChart(String name, String xAxis, String yAxis, Map<String, Integer> data) {
}
